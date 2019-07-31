package com.flexon.bankSystem;

public class Calculator {
	// implement sum
	public static Integer sum(Integer x, Integer y){
		if (x == null || y == null){
			return null;
		}
			return x + y;
	}
	
	// implement subtraction
	public static Integer sub(Integer x, Integer y){
		if (x == null || y == null){
			return null;
		}
			return x - y;
	}
	
	// implement multiplication
	public static Integer multi(Integer x, Integer y){
		if (x == null || y == null){
			return null;
		}
			return x * y;
	}
	
	// implement division
	public static Integer div(Integer x, Integer y){
		if (x == null || y == null || y == 0){
			return null;
		}
			return x / y;
	}	
}
