package starter.presentation.model;

import java.util.ArrayList;

import starter.metier.User;

public class TableModelUser extends TableModelManager<User> {

	public TableModelUser(ArrayList<User> modelList) {
		super(modelList);
	}

	@Override
	public int getColumnCount() {
		return 2;
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0 : return super.modelList.get(rowIndex).getId();
		case 1 : return modelList.get(rowIndex).getName();
		default : return null;
		}	
	}
	
	@Override
	public String getColumnName(int columnIndex ) {
		switch(columnIndex) {
		case 0 : return "id";
		case 1 : return "name";
		default : return null;
		}
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex ) {
		switch(columnIndex) {
		case 0 : return Integer.class;
		case 1 : return String.class;
		default : return Object.class;
		}
	}
	
}
