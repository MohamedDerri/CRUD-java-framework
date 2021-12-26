package starter.presentation.controller;

import starter.presentation.model.TableModelManager;

import java.util.ArrayList;

import starter.presentation.views.DisplayTable;

public abstract class ControllerManager<T, typeId> {

	private DisplayTable displayTable;


	// @SuppressWarnings("unchecked")
	// public ControllerManager() {
	// 	this.model = new TableModelManager<>(allObjects);
	// 	this.displayTable = new DisplayTable(model);
	// 	// this.allObjects = allObjects;
	// }


	public ControllerManager(DisplayTable displayTable) {
		this.displayTable = displayTable;
	}


	public DisplayTable getDisplayTable() {
		return displayTable;
	}


	public void setDisplayTable(DisplayTable displayTable) {
		this.displayTable = displayTable;
	}

	
}