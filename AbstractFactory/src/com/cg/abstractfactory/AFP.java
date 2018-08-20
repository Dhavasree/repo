package com.cg.abstractfactory;

public class AFP {
	   public static void main(String[] args) 
	   {
		   
		      AbstractFactory animal = AbstractFactoryPattern.getFactory("ANIMAL");
		      
		      Animal a1 = animal.getanimal("Cat");
		      a1.animal();
		      
		      Animal a2 = animal.getanimal("Dog");
		      a2.animal();
		      
		      Animal a3 = animal.getanimal("Squirrel");
		      a3.animal();

		      
		      
		      AbstractFactory school = AbstractFactoryPattern.getFactory("SCHOOL");

		      School s1 = school.getschool("A");
		      s1.name();

		      School s2 = school.getschool("B");
		      s2.name();

		      School s3 = school.getschool("C");
		      s3.name();
		   }
		}