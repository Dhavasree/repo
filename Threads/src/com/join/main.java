package com.join;

public class main {

	public static void main(String[] args) 
	{
		Mainclass t1=new Mainclass();
		Mainclass t2=new Mainclass();
		Mainclass t3=new Mainclass();
		t1.start();
		
		
		t2.start();
		
		t3.start();
		try 
	    {
			t3.join();
	    } 
	catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

	}

}
