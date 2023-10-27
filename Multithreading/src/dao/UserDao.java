package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import entity.User;

public class UserDao {
	Connection conn=null;
	public int saveUser(User user) {
		int rows=0;
		conn = DBConnection.getConnection();
		try {
			PreparedStatement statement=conn.prepareStatement("INSERT INTO UserDetails VALUE(?,?,?)");
			 statement.setInt(1,user.getUserId());
			 statement.setString(2, user.getUserName());
			 statement.setString(3, user.getUserEmail());
			 rows = statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;
		
	}

}
