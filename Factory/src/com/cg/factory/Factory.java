package com.cg.factory;

public class Factory 
{
	   public Animals getanimal(String animal)
	   
	   {
	      if(animal == null)
	      {
	         return null;
	      }		
	      if(animal.equalsIgnoreCase("DOG"))
	      {
	         return new Dog();
	         
	      } else if(animal.equalsIgnoreCase("CAT"))
	      {
	         return new Cat();
	         
	      } else if(animal.equalsIgnoreCase("SQUIRREL"))
	      {
	         return new Squirrel();
	      }
	      
	      return null;
	   }
}
