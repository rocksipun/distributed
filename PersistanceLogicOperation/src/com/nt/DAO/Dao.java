package com.nt.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	public static void getConnection(String url,String user,String password)throws SQLException {
		Connection con=null;
		con=DriverManager.getConnection(url, user, password);
		
		
	}
	
}
