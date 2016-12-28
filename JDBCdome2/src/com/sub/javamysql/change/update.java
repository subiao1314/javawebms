package com.sub.javamysql.change;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.omg.IOP.RMICustomMaxStreamFormat;

public class update {
    public static final String DBDRIVER ="com.mysql.jdbc.Driver";	
    public static final String DBURL ="jdbc:mysql://localhost:3306/database";	
    public static final String DBUSER ="root";	
    public static final String DBPWD ="root";	

	public static void main(String[] args) throws Exception {
        Class.forName(DBDRIVER);
		Connection conn=DriverManager.getConnection(DBURL,DBUSER,DBPWD);
        Statement st=conn.createStatement();		
		String sql="update cv set name='tom',age=10 where id=4 ;";
		
        int i=st.executeUpdate(sql)	;
        
        System.out.println("更新的数据条目为："+i);
	    st.close();
	    conn.close();
	}

}
