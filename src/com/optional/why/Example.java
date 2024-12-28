package com.optional.why;

//why optional class

public class Example {
	
	public static String getData() {
		return null;
	}
	
	public static void main(String[]args) {
		
		String s="java";
		s=getData();    //method calling
		if(s.contains("j")) {
			System.out.println("Inside if block");
		}
	}

}
