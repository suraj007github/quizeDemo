package questionInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultset {
	static final String url= "jdbc:mysql://localhost:3306/quize";

	public static void main(String[] args)
		throws ClassNotFoundException
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, "root", "suraj@19");

			Statement stmt = conn.createStatement();

			
			int result = stmt.executeUpdate("insert into results(id,finalResult)"+ "values('7','8')");

			
			if (result > 0)
				System.out.println("successfully inserted");

			else
				System.out.println(
					"unsucessful insertion ");

			
			conn.close();
		}

		catch (SQLException e) {
			System.out.println(e);
		}
	}
}

