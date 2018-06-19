package org.javacream.people.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.javacream.people.business.PeopleController;
import org.javacream.people.business.Person;

@ManagedBean
@ViewScoped
public class CreatePersonWebBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Person person;

	public Person getPerson() {
		if (person == null) {
			person = new Person();
		}
		return person;
	}

	public String create() {
		PeopleController.addPerson(getPerson());
		return "people";
	}
}
