package org.javacream.people.business;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String lastname;
	private String firstname;
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;

	}
	
	public String info(){
		return "Person: lastname=" + lastname + ", firstname=" + firstname;
	}
	public Person(String lastname, String firstname) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
	}
	public Person() {
		super();
	}
}
