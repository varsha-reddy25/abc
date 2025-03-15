package com.test.entity;

import java.util.Arrays;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user5")
/*
@NamedNativeQuery(name = "user5.firstName", 

		query = "select u from user5 u where u.firstName = ?1")
*/
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message = "First name is required")
	private String firstName;
	
	@NotEmpty(message = "Last name is required")
	private String lastName;
	
	@NotEmpty(message = "Please select gender")
	private String Gender;
	
	private String[] Food;
	
	@NotEmpty(message = "From city is required")
	private String cityFrom;
	
	@NotEmpty(message = "To city is required")
	private String cityTo;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotEmpty
	private String jDate;
	
	@NotEmpty
	private String[] seat;

	public User() {
	}

	
	 public User( String firstName,  String lastName,  String gender, String[] food,
			 String cityFrom,  String cityTo,  String[] seat, String jDate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		Food = food;
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
		this.seat = seat;
		this.jDate = jDate;
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


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String[] getFood() {
		return Food;
	}


	public void setFood(String[] food) {
		Food = food;
	}


	public String getCityFrom() {
		return cityFrom;
	}


	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}


	public String getCityTo() {
		return cityTo;
	}


	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}


	public String[] getSeat() {
		return seat;
	}


	public void setSeat(String[] seat) {
		this.seat = seat;
	}

	
	

	public String getjDate() {
		return jDate;
	}


	public void setjDate(String jDate) {
		this.jDate = jDate;
	}


	public boolean validate(String u1, String p1) 
	    { 
	        if (u1.equals(cityTo)) 
	            return true; 
	        else
	            return false; 
	    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Gender=" + Gender
				+ ", Food=" + Arrays.toString(Food) + ", cityFrom=" + cityFrom + ", cityTo=" + cityTo + ", jDate="
				+ jDate + ", seat=" + Arrays.toString(seat) + "]";
	} 
	
}
