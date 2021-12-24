package starter.presentation.controller;

import java.util.ArrayList;

import starter.metier.User;
import starter.metier.UserManager;
import starter.presentation.model.TableModelManager;
import starter.presentation.model.TableModelUser;
import starter.presentation.views.DisplayTable;

public class ControllerUser extends ControllerManager<User, Integer> {

	private static ArrayList<User> users = new UserManager().getAll();
	private static TableModelManager<User> model = new TableModelUser(users);
	private static DisplayTable displayTableUser = new DisplayTable(model);

	public ControllerUser() {
		super(displayTableUser);
		//TODO Auto-generated constructor stub
	}
	
}
