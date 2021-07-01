package com.qa.calculator_test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalcularUnitTest {

 Calculator calculator;
 
 
 @Before
 public void init() {
	 this.calculator = new Calculator();
 }
 
 @Test
 public void addTest() {
	 int num1 = 3;
	 int num2 = 10;
	 int expectedResult = 13;
	 
	 int actualResult = calculator.add(num1, num2);
	 
	 assertEquals(expectedResult, actualResult);
 }
 
 @Test
 public void substractTest() {
	 int num1 = 10;
	 int num2 = 3;
	 int expectedResult = 7;
	 
	 int actualResult = calculator.substract(num1, num2);
	 
	 assertEquals(expectedResult, actualResult);
 }
 
 @Test
 public void multiplyTest() {
	 int num1 = 3;
	 int num2 = 10;
	 int expectedResult = 30;
	 
	 int actualResult = calculator.multiply(num1, num2);
	 
	 assertEquals(expectedResult, actualResult);
 }
 
 @Test
 public void divideTest() {
	 int num1 = 15;
	 int num2 = 3;
	 int expectedResult = 5;
	 
	 int actualResult = calculator.divide(num1, num2);
	 
	 assertEquals(expectedResult, actualResult);
 }
 
 @Test
 public void moduloTest() {
	 int num1 = 15;
	 int num2 = 2;
	 int expectedResult = 1;
	 
	 int actualResult = calculator.modulo(num1, num2);
	 
	 assertEquals(expectedResult, actualResult);
 }

}


