package com.sync;

public class main {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();  
		MyThread3 t3=new MyThread3();  
		t1.start();  
		t3.start();  
	}

}
