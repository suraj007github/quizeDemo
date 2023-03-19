package com.user;

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	
	

	
public class Connect {

	


	
		Connection connection = null;
		public  Connection getconnectionDetails() throws Exception {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quize", "root","suraj@19");
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection ;
		

		}

	

}




