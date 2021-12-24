package starter.test;

import java.sql.SQLException;

import starter.persistance.DatabaseConnection;
import starter.presentation.controller.ControllerUser;

public class Main {
	public static void main(String[] args) {
		try {
			DatabaseConnection con = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/framework_crud", "root", "saidderri", "com.mysql.jdbc.Driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new ControllerUser().getDisplayTable();
	}
	
}
