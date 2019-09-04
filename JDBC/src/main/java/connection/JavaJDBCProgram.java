package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJDBCProgram {

	
	
	/*create a connection
	create statement 
	execute statement
	close connection
	*/
	public static void main(String[] args) throws SQLException {
		 
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skopic","root","Kumar777@");
	 
		Statement stmt = con.createStatement();
		
		 String s ="INSERT INTO phani VALUE (6, 'skopicl', 23000)";
		
		//String s ="UPDATE phani SET ename='skopic nani' where id=3";
		
	//	String s ="DELETE FROM phani where id=6";
		
		stmt.execute(s);
		
		con.close();
		
		System.out.println(" code ended ");
		

	}

}
