package com.adobe.sample.entity;

public class Test {
	
	public static void main(String[] args){
		Employee e1 = new Employee(1, "Rakesh");
		Employee e2 = new Employee(1, "Rakesh");
		Employee e3 = e1;
		
		System.out.println(e1 == e2); //false
		System.out.println(e1.equals(e2)); //true but returns false without over-riding
	}

}
