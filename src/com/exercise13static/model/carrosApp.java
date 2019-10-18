package com.exercise13static.model;

public class carrosApp
{

	public static void main(String[] args) 
	
	{
		car Jorge = new car("63514392", 2);
		car uriel = new car("84626434", 2);
		car gallo = new car("63252492", 2);
		car manuel = new car("31101997", 2);
		car alicia = new car("78430347", 4);
		car david = new car("73298373", 4);
		car Helio = new car("6254165", 4);
		car pablo = new car("6436751", 4);
		car ary = new car("97265453", 4);
		car ale = new car("76235984", 2);
		
		Jorge.setSerialNumber("1");
		Jorge.setNumberDoors(4);
		uriel.setSerialNumber("2");
		uriel.setNumberDoors(4);
		gallo.setSerialNumber("3");
		gallo.setNumberDoors(4);
		manuel.setSerialNumber("4");
		manuel.setNumberDoors(4);
		alicia.setSerialNumber("5");
		alicia.setNumberDoors(4);
		david.setSerialNumber("6");
		david.setNumberDoors(4);
		Helio.setSerialNumber("7");
		Helio.setNumberDoors(4);
		pablo.setSerialNumber("8");
		pablo.setNumberDoors(4);
		ary.setSerialNumber("9");
		ary.setNumberDoors(4);
		ale.setSerialNumber("10");
		ale.setNumberDoors(4);
		
		
		System.out.println("jorge: "+Jorge.ToString());
		System.out.println("uriel: "+uriel.ToString());
		System.out.println("gallo: "+gallo.ToString());
		System.out.println("manuel: "+manuel.ToString());
		System.out.println("alicia: "+alicia.ToString());
		System.out.println("david: "+david.ToString());
		System.out.println("Helio: "+Helio.ToString());
		System.out.println("pablo: "+pablo.ToString());
		System.out.println("ary: "+ary.ToString());
		System.out.println("ale: "+ale.ToString());
		System.out.println("jorge: "+Jorge.ToString());
		
				
		

	}

}
