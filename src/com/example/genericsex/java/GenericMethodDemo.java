package com.example.genericsex.java;

public class GenericMethodDemo {

	public <M> M dispaly(M val) {
		return val;
	}
	
	public static void main(String[] args) {
		
		GenericMethodDemo obj = new GenericMethodDemo();
		System.out.println("The Generic for string " + obj.dispaly("Sriram"));
		System.out.println("The Generic for interge " + obj.dispaly(10));
		System.out.println("The Generic for Boolean " + obj.dispaly(true));
		System.out.println("The Generic for Double " + obj.dispaly(19.99));
	}

}
