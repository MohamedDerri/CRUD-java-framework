package starter.persistance;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;

import starter.metier.User;

public class DaoUser implements Dao<User, Integer> {

	@Override
	public User save(User object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getObject(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteObject(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateObject(Integer id, User newObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getAll() {
		ArrayList<User> users = new ArrayList<User>();
		try {
			Statement st = (Statement) DatabaseConnection.getInstance().getConnection().createStatement();
			String query = "select * from user";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				User user = new User();
			 
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				
				users.add(user);
			}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
}
