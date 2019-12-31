package org.uvsq.ds.springmvc101.person;

import java.util.Map;

public class Person implements Comparable<Person>{

	private Long id;
	private String firstname;
	private String lastname;
	private Map<String, Integer> participationPerProjectName;
	private String login;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLogin() {
		return login;
	}
	public Map<String, Integer> getParticipationPerProjectName() {
		return participationPerProjectName;
	}
	public void setParticipationPerProjectName(Map<String, Integer> participationPerProjectName) {
		this.participationPerProjectName = participationPerProjectName;
	}
	@Override
	public int compareTo(Person o) {
		return this.login.compareTo(o.login);
	}
		
}

