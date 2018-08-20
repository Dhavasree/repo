package com.cg.factory;

public class FactoryPattern 
{
	 public static void main(String[] args) 
	 {
	      Factory factory = new Factory();

	      Animals a1 = factory.getanimal("DOG");

	      a1.animal();

	      Animals a2 = factory.getanimal("CAT");

	      a2.animal();

	      Animals a3 = factory.getanimal("SQUIRREL");

	      a3.animal();
	   }
}
