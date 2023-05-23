package com.validation;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.core.Owner;
import com.core.Property;
import com.exception.OwnerException;

public interface Validations 
{
	/*
	  String fName, String lName, String email, String address, 
	  int adhar, int mob, double rent,
	   Property property, LocalDate date
	 */
	public static Owner validateAll(String fName,String lName,String email,String address,String adhar,int mob,double rent,
			String prop, String date, Map<String,Owner> rentMap) throws OwnerException {
		checkForDup(adhar,rentMap); 
		LocalDate validD = parseDate(date);
		Property validP = parseProperty(prop);
		
		return new Owner (fName,lName,email,address,adhar,mob,rent,validP,validD);
		
	}
	
	
	static LocalDate parseDate(String date) throws OwnerException
	{

		if(LocalDate.parse(date).isBefore(LocalDate.now())) {
			return LocalDate.parse(date);
			
		}
		
		throw new OwnerException("Invalid date..");
	}
	
	static Property parseProperty(String property) throws OwnerException {
		return Property.valueOf( property.toUpperCase());
		
		
	}
	static void checkForDup(String adhar,Map<String,Owner>rent) throws OwnerException {
		if(rent.containsKey(adhar)) 
			throw new OwnerException ("rented out");
		
		
	}
	
	
}
