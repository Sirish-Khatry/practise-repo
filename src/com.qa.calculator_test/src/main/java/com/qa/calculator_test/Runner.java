package com.qa.calculator_test;

import java.util.ArrayList;
import java.util.List;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
//		Middlename middlename1 = new Middlename("Bhim");
//		Middlename middlename2 = new Middlename("Bahadur");
//		
//		Middlename middlename3 = new Middlename("Puri");
//		Middlename middlename4 = new Middlename("Bahadur");
//		
//		Middlename middlename5 = new Middlename("William");
//		
//		
//		ArrayList<Middlename> middlenames1 = new ArrayList<Middlename>();
//		middlenames1.add(middlename1);
//		middlenames1.add(middlename2);
//		
//		ArrayList<Middlename> middlenames2 = new ArrayList<Middlename>();
//		middlenames2.add(middlename3);
//		middlenames2.add(middlename4);
//		
//		ArrayList<Middlename> middlenames3 = new ArrayList<Middlename>();
//		middlenames3.add(middlename5);
		
		
		List<String> middleNames = List.of("Kc");
		
		
		user1.setForename("Sirish");
		user1.setSurname("Khatry");
		user1.setAge(22);
		user1.setEmail("skc@gmail.com");
		user1.setMiddlename(middleNames);
		
		user2.setForename("Manjina");
		user2.setSurname("Ban");
		user2.setAge(22);
		user2.setEmail("mban@gmail.com");
		user2.setMiddlename(List.of("Giri"));
		
		user3.setForename("John");
		user3.setSurname("Allen");
		user3.setAge(22);
		user3.setEmail("jal@gmail.com");
		user3.setMiddlename(List.of("William", "Johnson"));
		
		
		ArrayList<User> userList = new ArrayList<User>();
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		for(User u : userList) {
			System.out.println(u.toString());
		//	u.printDetails();
		}
		
		
	}
	
	

}
