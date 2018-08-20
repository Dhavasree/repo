package com.name;

public class Mainclass {

	public static void main(String[] args) 
	{
		name n1=new name();
		name2 n2=new name2();
		
		n1.setPriority(Thread.MIN_PRIORITY);
		n2.setPriority(Thread.MAX_PRIORITY);
		
		n1.start();
		n2.start();
		
		/*System.out.println("n1  "+n1.getName());
		System.out.println("n2  "+n2.getName());*/
		
		
		
		/*System.out.println("n1  "+n1.getPriority());
		System.out.println("n2  "+n2.getPriority());
		n1.setName("my name is n1");
		System.out.println("n1 name  "+ n1.getName());*/
	}

}
