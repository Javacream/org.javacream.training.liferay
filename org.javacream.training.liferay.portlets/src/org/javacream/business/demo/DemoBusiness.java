package org.javacream.business.demo;

import java.util.LinkedList;
import java.util.List;

public class DemoBusiness {

	private static LinkedList<String> DATA;
	static{
		DATA = new LinkedList<String>();
		DATA.add("Emil");
		DATA.add("Hugo");
	}
	public static List<String> getData(){
		return DATA;
	}

	public static void addData(String name){
		DATA.addFirst(name);
	}
}
