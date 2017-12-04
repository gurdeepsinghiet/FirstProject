package com.sample;

public class ConstructorExample2 {
	
	static int x;
	static String y;
	static double z;
	
	ConstructorExample2(){
		
		x=12;
		y="Hello";
		z=12.45;
	}
	
	public static void main(String[] args) {
		ConstructorExample2 ce2=new ConstructorExample2();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
