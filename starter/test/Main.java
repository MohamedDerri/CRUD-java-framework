package starter.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import starter.persistance.DatabaseConnection;
import starter.presentation.controller.ControllerUser;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> holder = new ArrayList<String>();

		try {
			File configFile = new File("/Users/mderri/Desktop/java_CRUD_Framework/starter/configFile.txt");
			Scanner myReader = new Scanner(configFile);

			while (myReader.hasNextLine()) {
			  String line = myReader.nextLine();
			  holder.add(line);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred !");
			e.printStackTrace();
			
		}
		
		String username = holder.get(0);
		String password = holder.get(1);
		String host = holder.get(2);
		System.out.println(host);
		
		try {
			DatabaseConnection con = DatabaseConnection.getInstance("jdbc:mysql://"+host+":3306/framework_crud", username, password, "com.mysql.cj.jdbc.Driver");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		new ControllerUser().getDisplayTable();
	}
	
}
