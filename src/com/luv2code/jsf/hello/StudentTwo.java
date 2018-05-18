package com.luv2code.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	
	private String firstName;
	private String lastName;
	private String country;
	
	//no-arg constructor
	public StudentTwo(){
		countryOptions = new ArrayList<>();
		countryOptions.add("Brazil");
		countryOptions.add("Germany");
		countryOptions.add("India");
		countryOptions.add("Canada");
		countryOptions.add("USA");
	}
	
	//getters and setters for country list
	public List<String> getCountryOptions() {
		return countryOptions;
	}

	//list of countries for the drop-down list
	List<String> countryOptions;
	
	//getters and setters
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
