package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
		
//		//------------------------------ 1.	Insert sql: ------------------------------------------
		//		a.	Write sql
//		String sql = "insert into user(username, password) values('rohan', 'rohan@123#')";
//		//		b.	Create statement
//		Statement stm = con.createStatement();
//		//		c.	Execute sql
//		stm.execute(sql);
//		//		d.	close
//		con.close();
//		System.out.println("Success!");
		
		
////		//------------------------------ 2.	Delete sql: ------------------------------------------
//		String sql = "delete from user where id = 7";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		con.close();
//		System.out.println("delete success!");
		
		
////		//------------------------------ 3.	update sql: ------------------------------------------
//		String sql = "update user set password = '12345' where id = 6";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		System.out.println("Update success!");
		
		
//		//------------------------------ 4.	Select sql: ------------------------------------------
		String sql = "select * from user";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while(rs.next()) {
			System.out.println("Id = "+ rs.getInt("id"));
			System.out.println("Name = "+ rs.getString("username"));
			System.out.println("Password = "+ rs.getString("password"));
			System.out.println("-----------------------------------");
		}

	}
}
