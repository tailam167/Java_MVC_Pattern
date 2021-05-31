package com.designpattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Apply MVC Pattern (Model)
 * 
 * @author taila
 *
 */
public class Database {

	private List<Person> personList;

	public Database() {
		this.personList = new ArrayList<>();
	}

	public void addPerson(Person person) {
		this.personList.add(person);
	}

	public void removePerson(Person person) {
		this.personList.remove(person);
	}

	public List<Person> getPersons() {
		return this.personList;
	}

}
