package com.collectionobjectsinjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Teacher {
	private int id;
	private String name;
	private List<String> contacts;
	private Set<String> subjects;
	private Map<String,String> address;
	private Properties timetable;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	public Set<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	public Properties getTimetable() {
		return timetable;
	}
	public void setTimetable(Properties timetable) {
		this.timetable = timetable;
	}
	
	
}
