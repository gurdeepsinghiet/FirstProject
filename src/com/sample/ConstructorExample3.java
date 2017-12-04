package com.sample;

public class ConstructorExample3 {
	
	static int x;
	static String y;
	static double z;
	
	ConstructorExample3(){
		x=12;
		y="world";
		z=19.65;
	}
	ConstructorExample3(int x,String y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	
	public static void main(String[] args) {
		ConstructorExample3 ce1=new ConstructorExample3();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		ConstructorExample3 ce=new ConstructorExample3(2,"Hi",23.34);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		ConstructorExample3 ce3=new ConstructorExample3(12,"Hi bnm",27.34);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
