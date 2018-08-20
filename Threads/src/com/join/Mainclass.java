package com.join;

public class Mainclass extends Thread
{
	public void run()
	{
			for(int i=1;i<5;i++)
			{
				
			try
			{
			Thread.sleep(100);	
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			System.out.println(i);
			}
	}

}
