package com.designpattern.controller;

import java.util.List;

import com.designpattern.model.Database;
import com.designpattern.model.Person;
import com.designpattern.view.MainFrame;

/**
 * Apply MVC Pattern (Controller)
 * 
 * @author taila
 *
 */
public class Controller {

	private Database database;
	private MainFrame mainFrame;

	public Controller(MainFrame mainFrame) {
		this.database = new Database();
		this.mainFrame = mainFrame;
	}

	public void addPerson(String personName, String personRole) {
		Person person = new Person(personName, personRole);
		this.database.addPerson(person);
	}

	public void removePerson(Person person) {
		this.database.removePerson(person);
	}

	public List<Person> getPersonFromDatabase() {
		return this.database.getPersons();
	}

	public void refreshScreen() {
		List<Person> personList = getPersonFromDatabase();
		this.mainFrame.clearText();

		for (Person person : personList) {
			this.mainFrame.refreshTextArea(person.getName(), person.getRole());
		}
	}

	public void resetTextArea() {
		List<Person> personList = getPersonFromDatabase();
		this.mainFrame.clearText();
		personList.removeAll(this.getPersonFromDatabase());
	}

}
