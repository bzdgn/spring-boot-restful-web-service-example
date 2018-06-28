package com.levent.consultantapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consultant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	private boolean isAssigned;
	private String client;

	public Consultant() {}

	public Consultant(Long id, String firstName, String lastName, int age, boolean isAssigned, String client) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.isAssigned = isAssigned;
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAssigned() {
		return isAssigned;
	}

	public void setAssigned(boolean isAssigned) {
		this.isAssigned = isAssigned;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return String.format("Consultant Id: %s\nFirst Name: %s\nLast Name: %s\nAge: %d\nAssigned: %s\nClient: %s\n\n",
				id, firstName, lastName, age, isAssigned, isAssigned == true ? client : "N/A");
	}

}
