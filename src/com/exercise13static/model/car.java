package com.exercise13static.model;

public class car
{
	private String serialNumber;
	private int numberDoors;
	private boolean isCoupe;
	private String brand;
	
	
	public car()
	{
		
	}
	
	public car (String serialNumber, int numberDoors)
	{
		this.serialNumber= serialNumber;
		this.numberDoors=numberDoors;
	}
	
	
	public String getSerialNumber()
	{
		return serialNumber;
		
	}
	
	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber=serialNumber;
	}
	
	public int getNumberDoors()
	{
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors)
	{
		this.numberDoors=numberDoors;
	}
	public void carIsCoupe(boolean isCoupe)
	{
		this.isCoupe=isCoupe;
		if (this.isCoupe)
		{	
			this.numberDoors=2;
		}
	}
	
	public String ToString()
	{
		return "serial number" + this.serialNumber+ " number doors "  + numberDoors;
	}
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	
	
	

}
