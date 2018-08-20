package com.cg.abstractfactory;

public class Animalfac extends AbstractFactory
{

	@Override
	School getschool(String school) 
	{
		return null;
	}

	
	
	@Override
	public Animal getanimal (String animal)
	{
		
	if(animal == null)
	{
        return null;
     }	
	
	 if(animal.equalsIgnoreCase("Cat"))
	 {
        return new Cat(); 
     }
	 
	 else if(animal.equalsIgnoreCase("Dog"))
     {
        return new Dog();
     }
	 
     else if(animal.equalsIgnoreCase("Squirrel"))
     {
        return new Squirrel();
     }
     
     return null;

}
	}
