package com.cg.clone;

public class kit implements Cloneable 
{

public static void main(String[] args) throws CloneNotSupportedException 
{
	DogName c=new DogName("sgfrf");
	DogName c1=(DogName)c.clone();
	
	System.out.println(c1.dname);
}
}
