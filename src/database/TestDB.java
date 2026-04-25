package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException   {
		// register driver:
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// getConnection(url, un, psw)
		Connection con = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/javabroadwaytestdb",
			    "root",
			    "Naresh@123#"
			);
		
		// 1.	Insert sql:
		//		a.	Write sql
		//		b.	Create statement
		//		c.	Execute sql
		//		d.	close

	}
}
