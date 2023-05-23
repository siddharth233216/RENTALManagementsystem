package com.core;

public enum Property 
{
		RK1(1000),BHK1(5000),BHK2(15000),BHK3(20000),BHK4(25000);
	private double rate;
	
	
	private Property(double rate) {
		this.rate=rate;
	}
	@Override
	public String toString()
	{
		return this.name()+"@"+this.rate;
	}
}
