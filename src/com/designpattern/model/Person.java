package com.designpattern.model;

/**
 * Apply MVC Pattern (Model)
 * 
 * @author taila
 *
 */
public class Person {

	private String name;
	private String role;
	
	public Person(String name, String role) {
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
