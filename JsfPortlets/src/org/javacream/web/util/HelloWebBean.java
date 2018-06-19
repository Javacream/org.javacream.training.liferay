package org.javacream.web.util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="helloBean")
@RequestScoped
public class HelloWebBean {

	private String helloMessage = "HELLO!!!";

	public String getHelloMessage() {
		return helloMessage;
	}
}
