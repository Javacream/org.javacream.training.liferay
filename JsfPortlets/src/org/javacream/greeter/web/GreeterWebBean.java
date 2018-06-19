package org.javacream.greeter.web;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.javacream.greeter.business.Greeter;

@ManagedBean
@ViewScoped
public class GreeterWebBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private transient Greeter greeter;

	{
		greeter = new Greeter();
	}

	private String greeterMessage = "CHANGE ME";
	private String greeting = "NOTHING";

	public String getGreeterMessage() {
		return greeterMessage;
	}

	public void setGreeterMessage(String greeterMessage) {
		this.greeterMessage = greeterMessage;
	}

	public String getGreeting() {
		return greeting;
	}

	public String webGreet() {
		greeting = greeter.greet(greeterMessage);
		return null;
	}

}
