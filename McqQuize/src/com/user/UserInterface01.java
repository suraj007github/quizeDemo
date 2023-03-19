package com.user;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;

public class UserInterface01 {


	


	Connection connection =null;
	PreparedStatement ps=null;


	public  void getDetails( String firstname, String lastname, String username, String passward, String mailid, String city, String mibilnum) throws SQLException {
		


	try {
		Connect cp=new Connect();
		Connection connection= cp.getconnectionDetails();
		
		
		ps=connection.prepareStatement("insert into quizedemo(firstname,lastname,username,passward,mailid,city,mibilenum)"+ "values(?,?,?,?,?,?,?)");
		ps.setString(1,firstname );
		ps.setString(2,lastname);
		ps.setString(3,username);
		ps.setString(4,passward);
		ps.setString(5,mailid);
		ps.setString(6,city);
		ps.setString(7,mibilnum);
		int i=ps.executeUpdate();connection.close();
		ps.close();
	//}
		System.out.println("Record inserted"+i);
	} catch (Exception e) {
		e.printStackTrace();
	}
	//finally {
		


		

	}
	public static void main(String args[]) throws SQLException {
		 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter id");
	String id =sc.next();
	System.out.println("Enter first name");
	String firstname=sc.next();

	System.out.println("Enter last name");
	String lastname=sc.next();

	System.out.println("Enter username");
	String username=sc.next();
	
	System.out.println("Enter passward");
	String passward=sc.next();
	
	System.out.println("Enter mail id");
	String mailid=sc.next();
	
	System.out.println("Enter city");
	String city=sc.next();
	
	System.out.println("Enter mobile number");
	String mibilenum=sc.next();
	
	sc.close();
	UserInterface01 user= new UserInterface01();

	user.getDetails(firstname, lastname, username, passward, mailid, city, mibilenum);
	}

	

	}


