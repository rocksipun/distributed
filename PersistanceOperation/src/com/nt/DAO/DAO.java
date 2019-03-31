package com.nt.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	public static void getConn()throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		ps=con.prepareStatement("select count(*) from emp");
		rs=ps.executeQuery();
		rs.next();
		System.out.println(rs.getString(1));
		
	}

}
