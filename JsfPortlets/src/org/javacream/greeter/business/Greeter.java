package org.javacream.greeter.business;

public class Greeter {

	public String greet(String message) {
		return new StringBuilder(message).reverse().toString();
	}
}
