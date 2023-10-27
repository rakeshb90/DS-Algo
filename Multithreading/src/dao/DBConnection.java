package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection CONNECTION=null;
	public static Connection getConnection() {
		if(CONNECTION == null) {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			CONNECTION = DriverManager.getConnection("jdbc:mysql://localhost:3306/rkdb",
					"root","rk123");
			}
			catch(Exception e) {
				System.out.println("There is issue: "+e);
			}
		}
			return CONNECTION;
	}

}
