package com.example.genericsex.java;

public class GenericWildCardEx<T> {

	private T t;
	
	public void stVaule(T t) {
		this.t = t;
	}
	public T getValut(){
		return t;
	}
	
	public boolean compare(GenericWildCardEx<?extends Number> wcd) {
		if(t == wcd.t){
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
	
		GenericWildCardEx<Integer> obj1 = new GenericWildCardEx<Integer>();
		obj1.stVaule(10);

		GenericWildCardEx<String> obj2 = new GenericWildCardEx<String>();
		obj2.stVaule("Sriram");
		
		System.out.println("The value of first object is\t" + obj1.getValut());
		System.out.println("The value of second object is\t" + obj2.getValut());
		//System.out.println("The value of second object is\t" + obj1.compare(obj2));
	}

}
