package com.example.designpattern.adapter;

public class ClassCAdapter extends ClassA {
	private ClassC classC; // association, not inheritance
	                       // cf. No multiple inheritance allowed in Java
	
	public ClassCAdapter() {
		classC = new ClassC();
	}
	public void request() {
		// ...
		
		classC.anothorSpecificRequest();
		
		// ...
	}
}
