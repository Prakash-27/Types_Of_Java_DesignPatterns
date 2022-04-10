package com.DesignPattern;

public class Singleton {
	
	//In OOPS, a Singleton class is a class that can have only once object (instance of the class) at a Time.
	
	//How to design Singleton class:
	//1. make Constructor as Private.
	//2. write a public static method getInstance() that has return type of Object of this singleton class (Lazy Instance)
	
	//Difference b/w Normal class and Singleton class:
	//For Normal class we use Constructor whereas for Singleton class we use getInstance() method for instantiation 

	private static Singleton singleton_Instance = null;
	public String str;
	
	
	private Singleton() {
		str = "Hey I am Using Singleton Pattern";
	}
	
	public static Singleton getInstance() {
		if(singleton_Instance == null) {
		singleton_Instance = new Singleton();
		}
		return singleton_Instance;
	}
	
	public static void main(String[] args) {

		//Here i am calling the getInstance() by using the class name Singleton.getInstance();
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println("-----------------toUpperCase--------------------");
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		System.out.println("-----------------toLowerCase--------------------");
		
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}
