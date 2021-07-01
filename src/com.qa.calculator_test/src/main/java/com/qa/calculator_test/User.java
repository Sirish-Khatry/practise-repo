package com.qa.calculator_test;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String forename;
	private String surname;
	private int age;
	private String email;
	private int telephoneNo;
//	private ArrayList<Middlename> middlename;
	private List<String> middlename;
	
	
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(int telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
//	public ArrayList<Middlename> getMiddlename() {
//		return middlename;
//	}
	public List<String> getMiddlename(){
		return middlename;
		
	}
//	public void setMiddlename(ArrayList<Middlename> middlename) {
//		this.middlename = middlename;
//	}
	public void setMiddlename(List<String> middlename) {
		this.middlename = middlename;
	}
	@Override
	public String toString() {
		return "User [forename=" + forename + ", surname=" + surname + ", age=" + age + ", email=" + email
				+ ", telephoneNo=" + telephoneNo + ", middlename=" + middlename + "]";
	}
	
	public void printDetails() {		
		System.out.println("Forname: " + this.forename + ", Surname: " + this.surname + ", Age: " + this.age + ", Email: " + this.email+ ", Telephone: " + this.telephoneNo + ", Middlename: " + this.getMiddlename());
	}
	
	

}
