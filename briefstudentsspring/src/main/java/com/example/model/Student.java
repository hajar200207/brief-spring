package com.example.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String name;
	private String registrationNumber;
    private String email;
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
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", registrationNumber=" + registrationNumber + ", email="
				+ email + "]";
	}
    
    
    
}
