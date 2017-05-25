package com.example.genericsex.java;

public class GenericsClassDemo<T> {

	private T t;
	
	public void setValue(T t){
		
		this.t = t;
	}
	public T getValue() {
		return t;
	}
	public static void main(String[] args) {
		
		GenericsClassDemo<Integer> obj = new GenericsClassDemo<Integer>();
		obj.setValue(10);
		System.out.println(obj.getValue());
		GenericsClassDemo<String> obj1 = new GenericsClassDemo<String>();
		obj1.setValue("Ten");
		System.out.println(obj1.getValue());
			
	}

}
