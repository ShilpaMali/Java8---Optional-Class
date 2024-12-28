package com.optional.implement;

import java.util.Optional;

//How to implement optional class concept

public class Example {
	
	public static Optional<String> getData(){
		return Optional.ofNullable(null);   //null value to getData() method
	}
	
	public static void main(String[]args) {
		Optional<String> s= getData();  //method calling
		if(s.isPresent()) { //if value is present
			System.out.println("s contain value:" +s);
		}else {
			System.out.println("s does not contain any value");
		}
	}
	

}
