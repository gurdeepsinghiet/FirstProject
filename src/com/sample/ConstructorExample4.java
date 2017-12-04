package com.sample;

public class ConstructorExample4 {
	
	static int x;
	static double y;
	static double m;
	static String s;
	
	ConstructorExample4(int y, double m){
		
		x=y;
		this.m=m;
	}
	

	ConstructorExample4(String s){
		this.s=s;
	}
	
	public static void main(String[] args) {
		ConstructorExample4 bn=new ConstructorExample4("Hello world");
		System.out.println(s);
	}

}
