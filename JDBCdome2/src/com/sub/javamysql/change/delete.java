package com.sub.javamysql.change;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.omg.IOP.RMICustomMaxStreamFormat;

public class delete {
    public static final String DBDRIVER ="com.mysql.jdbc.Driver";	
    public static final String DBURL ="jdbc:mysql://localhost:3306/database";	
    public static final String DBUSER ="root";	
    public static final String DBPWD ="root";	

	public static void main(String[] args) throws Exception {
        Class.forName(DBDRIVER);
		Connection conn=DriverManager.getConnection(DBURL,DBUSER,DBPWD);
        Statement st=conn.createStatement();		
		String sql="delete from cv  where id=6 ;";
		
        int i=st.executeUpdate(sql)	;
        
        System.out.println("删除的数据条目为："+i);
	    st.close();
	    conn.close();
	}

}
