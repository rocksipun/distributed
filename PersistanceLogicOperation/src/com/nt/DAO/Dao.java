package com.nt.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Dao dao=null;
		dao.getConnectio(jdbc:oracle:thin:@localhost:orcl, scott, tiger);
		ps=con.prepareStatement("select count(*) from emp");
		rs=ps.executeQuery();
		rs.next();
		System.out.println(rs.getString(1));
		
		
	}
	
}
