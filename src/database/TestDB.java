package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
		String sql = "insert into user(username, password) values('ahrish', 'ahrish@123#')";
		//		b.	Create statement
		Statement stm = con.createStatement();
		//		c.	Execute sql
		stm.execute(sql);
		//		d.	close
		con.close();
		System.out.println("Success!");

	}
}
