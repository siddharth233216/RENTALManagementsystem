package com.core;

import java.time.LocalDate;

public class Owner
{
	private String fName,lName,email,address,adhar;
	private int mob;
	private double rent;
	private Property property;
	private boolean isAvail;
	private LocalDate date;
	public Owner(String fName, String lName, String email, String address, String adhar, int mob, double rent,
			Property property, LocalDate date) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.address = address;
		this.adhar = adhar;
		this.mob = mob;
		this.rent = rent;
		this.property = property;
		this.isAvail = true;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Owner [fName=" + fName + ", lName=" + lName + ", email=" + email + ", address=" + address + 
		", adhar=" + adhar + ", mob=" + mob + ", rent=" + rent + ", isAvail=" + isAvail + ", date=" + date + "]";}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	public boolean isAvail() {
		return isAvail;
	}
	public void setAvail(boolean isAvail) {
		this.isAvail = isAvail;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	
	
}
