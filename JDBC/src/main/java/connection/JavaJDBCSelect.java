package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJDBCSelect {
	
	/*create a connection
	create statement 
	execute statement
	store result in result set
	close connection
	*/
	
	
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skopic","root","Kumar777@");
		 
		Statement stmt = con.createStatement();
		
		 String s ="select email,user_id,display_name from users";
		 
		 ResultSet rs = stmt.executeQuery(s);
		 
		 while(rs.next()) {
			
			 int id=rs.getInt("user_id");
			 String s1= rs.getString("email");
			 String s2= rs.getString("display_name");
			 
		//	 System.out.println(id+ " "+ s1+ " " + s2 );
			 	
			 if (s1.equalsIgnoreCase("santramsardar@gmail.com")) {
				 
				 System.out.println("new user is created ");
			 }
			
		 }
			
			con.close();
			
			System.out.println(" code ended ");
	}

}
