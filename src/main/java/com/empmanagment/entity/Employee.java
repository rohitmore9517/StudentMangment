package com.empmanagment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String FirstName;
	private String LastName;
	private String Email;
	
	public Employee(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
	}
	
	public Employee() {
		super();
	}

	public int getIn() {
		return id;
	}
	public void setIn(int in) {
		this.id = in;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Employee [in=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + "]";
	}
	
	
	
}
