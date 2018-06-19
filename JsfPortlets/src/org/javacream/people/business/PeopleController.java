package org.javacream.people.business;

import java.util.ArrayList;
import java.util.List;

public abstract class PeopleController {

	private static List<Person> people;
	
	static{
		people = new ArrayList<Person>();
		people.add(new Person("Radenkovic", "Petar"));
		people.add(new Person("Patzke", "Bernd"));
		people.add(new Person("Rebele", "Hans"));
	}
	
	public static Person addPerson(String lastname, String firstname){
		Person p = new Person(lastname, firstname);
		people.add(p);
		return p;
	}
	public static void addPerson(Person newPerson){
		people.add(newPerson);
	}
	public static List<Person> getPeopleList(){
		return people;
	}
	
}
