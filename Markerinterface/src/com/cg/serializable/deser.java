package com.cg.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class deser {
	 public static void main(String args[])throws Exception
	 {  
		 
		  FileInputStream fout=new FileInputStream("h.txt");  
		  ObjectInputStream out=new ObjectInputStream(fout);  
		  
		  Student s=(Student)out.readObject();  
		  System.out.println(s.id+" "+s.name+" "+s.age);  
	
}}
