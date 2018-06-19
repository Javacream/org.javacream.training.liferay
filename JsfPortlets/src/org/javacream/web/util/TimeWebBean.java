package org.javacream.web.util;

import java.io.Serializable;
import java.util.Date;

public class TimeWebBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Date time;
	
	{
		time = new Date();
	}
	
	public String getTime(){
		return time.toString();
	}
}
