package com.sub.javamysql.change;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

import org.omg.IOP.RMICustomMaxStreamFormat;

public class insert_prepared {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/database";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws Exception {
		Class.forName(DBDRIVER);
		Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		Statement st = conn.createStatement();
		conn.setAutoCommit(false);
		Savepoint sp = null;
		Savepoint sp2 = null;
		try {

			String tmp = "insert into cv (name,age)values";
			st.executeUpdate(tmp + "('中华11',102)");
			st.executeUpdate(tmp + "('中华12',102)");
			st.executeUpdate(tmp + "('中华13',103)");

			sp = conn.setSavepoint();
			//制造错误
			st.executeUpdate(tmp + "('中华14‘,104)"); // 直接提交时，如果遇到中间一项错误，会报错，但仍把没错的提交到数据库
			sp2 = conn.setSavepoint();

			st.executeUpdate(tmp + "('中华15',105)");

			conn.commit();
			System.out.println("插入新纪录");
		} catch (Exception e) {
			System.out.println("执行遇到错误，回滚！");
             if (sp2!=null) {
            	 System.out.println("sp2定点");
            	 conn.rollback(sp2);
            	 conn.commit();
             }else if (sp!=null) {
            	 System.out.println("sp定点");
            	 conn.rollback(sp);
            	 conn.commit();
             }			
				
				
				st.close();
				conn.close();
		}

		
	}

}
