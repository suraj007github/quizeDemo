package admin;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.Scanner;	
	//import com.questionInterface.*;

public class AdminFunctionalities {
	
	

	
	     public void getAllResult() {
	    	 try {
	 			Class.forName("com.mysql.cj.jdbc.Driver");
	 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quize", "root","suraj@19");
	 		   PreparedStatement ps = con.prepareStatement("select * from quizedemo left join results on quizedemo.id=results.id order by finalResult asc");
	 		   
	 		   ResultSet rs = ps.executeQuery();
	 		   while(rs.next()) {
	 		   System.out.println("First name is:- "+rs.getString("firstname"));
	 		   System.out.println("Last name is:- "+rs.getString("lastname"));
	           System.out.println("score is:- "+rs.getInt("finalResult"));
	 		   }
	              
	 		} catch (Exception e) {
	 			e.printStackTrace();
	 		}
	     }
	     public void getResultById() {
	    	 Scanner sc = new Scanner(System.in);
	         System.out.println("enter id to get result by id");
	           int a = sc.nextInt();
	         try {
	  			Class.forName("com.mysql.cj.jdbc.Driver");
	  			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quize", "root","suraj@19");
	  		   
	         PreparedStatement vs = con.prepareStatement("select * from results where id =?");
			   vs.setInt(1,a);
	         ResultSet rs = vs.executeQuery();
	         while(rs.next()) {
	      	   System.out.println("score is:- "+rs.getInt("finalResult"));
	         }
			   
			    
			} catch (Exception e) {
				e.printStackTrace();
			} 
	     }
	     public static void main(String[] args) {
			AdminFunctionalities ad = new AdminFunctionalities();
			System.out.println("All results by Ascending order");
			ad.getAllResult();
			ad.getResultById();
			
		}
	}

