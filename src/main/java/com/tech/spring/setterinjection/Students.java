package com.tech.spring.setterinjection;

import java.util.Iterator;
import java.util.List;

public class Students {
	private String name;
	private int id;
	private List<String> names;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public void displayStudentDetails() {
		System.out.println(id+" "+name);
		System.out.println("Nicknames : ");
		
		Iterator<String> itr= names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
