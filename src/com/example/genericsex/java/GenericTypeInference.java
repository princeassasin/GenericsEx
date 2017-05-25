package com.example.genericsex.java;

public class GenericTypeInference<X,Y> {
	
	private X first;
	private Y second;

	public GenericTypeInference(X a1, Y a2){
		
		first = a1;
		second = a2;
		
	}
	
	public X getFirst(){
		return first;
	}

	public Y getSecond(){
		return second;
	}

	public static void  main(String args [] ) {
		
		GenericTypeInference<String, Integer> obj1 = new GenericTypeInference<String, Integer>("sriram", 100);
		System.out.println("String is: " + obj1.getFirst());
		System.out.println("Integer is: " + obj1.getSecond());
		
		GenericTypeInference<Integer,String > obj2 = new GenericTypeInference<Integer, String>(100, "Sriram");
		System.out.println("The Integer is:" + obj2.getFirst());
		System.out.println("The String is:" + obj2.getSecond());
	}
}
