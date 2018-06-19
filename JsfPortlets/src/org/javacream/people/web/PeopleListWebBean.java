package org.javacream.people.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.javacream.people.business.PeopleController;
import org.javacream.people.business.Person;

@ManagedBean
@ViewScoped
public class PeopleListWebBean {

	public List<Person> getPeople(){
		return PeopleController.getPeopleList();
	}
}
