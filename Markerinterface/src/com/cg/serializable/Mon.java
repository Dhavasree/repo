package com.cg.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Mon 
{  
	 public static void main(String args[])throws Exception
	 {  
		  Student s1 =new Student(211,"ravi",12);  
		  
		  FileOutputStream fout=new FileOutputStream("h.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		  out.writeObject(s1);  
		out.flush();  
		  System.out.println(s1.id+" "+s1.name+" "+s1.age);  
		 }  
		}  