package com.cg.abstractfactory;

public class AbstractFactoryPattern 
{
	public static AbstractFactory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("ANIMAL"))
	      {
	         return new Animalfac();
	      }
	      
	      else if(choice.equalsIgnoreCase("SCHOOL"))
	      {
	         return new Schoolfac();
	      }
	      
	      return null;
	   }
}
