package com.nt.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static void getConn(String url,String user,String password)throws SQLException {
		Connection con=null;
		preparedStatement ps=null;
		ResultSet rs=null;
		dao.getConnectio("jdbc:oracle:thin:@localhost:orcl", "scott", "tiger");
		ps=con.prepareStatement("select count(*) from emp");
		rs=ps.executeQuery();
		rs.next();
		System.out.println(rs.getString(1));
		
	}

}
