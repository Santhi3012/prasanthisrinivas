package com.array;

public class ArraysDemo {
	public static void main(String[] args) {
		
		//literal syntax
		String[] names = {"Kiran","Rahul","Mohan","Kumar"};
		//To get specific index value
		System.out.println(names[1]);
		//Array index position starts from 0 onwards  
		
		//To get all elements
		//enhanced for loop(for each loop)
		for(String name:names) {
			System.out.println(name);
		}
		
		//object syntax
		int rollnos[]  = new int[3];
		rollnos[0] = 1001;
		rollnos[1] = 1002;
		rollnos[2] = 1003;
		rollnos[3] = 1004;
		System.out.println(rollnos[3]);
	
	}
	
	
}
