package com.cg.abstractfactory;

public class Schoolfac extends AbstractFactory
{

	@Override
	 public School getschool (String school)
	 {
	
	 if(school == null)
	 {
         return null;
      }	
	 
	 if(school.equalsIgnoreCase("A"))
	 {
         return new SchoolA();
      }
	 
	 else if(school.equalsIgnoreCase("B"))
      {
         return new SchoolB();
      }
	 
      else if(school.equalsIgnoreCase("C"))
      {
         return new SchoolC();
      }
      return null;
	 }
	
	
	
	@Override
	Animal getanimal(String animal) 
	{
		return null;
	}

}
