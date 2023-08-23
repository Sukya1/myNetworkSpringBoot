package com.mynetwork.mynetwork.network;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity //Ensures that instances of the customer class are stored in the database (entity will be mapped to a table called Person)
public class Person {
	
	@jakarta.persistence.Id //allows JPA to recognize this as the objects primary key
	@GeneratedValue(strategy=GenerationType.AUTO) //indicates the id should be generated automatically
	private Long Id;
	
	private String firstName; 
	private String lastName; 
	private String company;
	private String gradYear; 
	private String linkedin; 
	private String mobileNumber; 
	private String connectionType;
	
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, String company, String gradYear, String linkedin, String mobileNumber,
			String connectionType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.gradYear = gradYear;
		this.linkedin = linkedin;
		this.mobileNumber = mobileNumber;
		this.connectionType = connectionType;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGradYear() {
		return gradYear;
	}
	public void setGradYear(String gradYear) {
		this.gradYear = gradYear;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", company=" + company
				+ ", gradYear=" + gradYear + ", linkedin=" + linkedin + ", mobileNumber=" + mobileNumber
				+ ", connectionType=" + connectionType + "]";
	}
	
}
