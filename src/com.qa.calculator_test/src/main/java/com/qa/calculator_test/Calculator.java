package com.qa.calculator_test;

public class Calculator {
	
	private int num1, num2;
	
	public Calculator(){
		
	}
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add(int num1, int num2) {
		
		return num1 + num2;
	}

	public int substract(int num1, int num2) {
	
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		
		return num1 * num2;
	}

	public int divide(int num1, int num2) {

		return num1 / num2;
	}

	public int modulo(int num1, int num2) {
		
		return num1 % num2;
	}






}
