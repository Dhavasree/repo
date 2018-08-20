package com.cg.clone;

public class clone implements Cloneable
{
String name;
int id;
String address;
clone(String name, int id, String address)
{
	this.name=name;
	this.id=id;
	this.address=address;
}
	
public Object clone() throws CloneNotSupportedException
{
	return super.clone();
}
public static void main(String[] args) throws CloneNotSupportedException 
{
	clone c=new clone("dfgdf", 12,"karur");
clone c1=(clone)c.clone();

System.out.println(c.name+" "+c.id+" "+c.address);
System.out.println(c1.name+" "+c1.id+" "+c1.address);
}
}
