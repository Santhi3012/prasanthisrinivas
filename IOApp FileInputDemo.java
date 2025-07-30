package com.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputDemo {
	
	public static void main(String[] args) throws IOException {
		
		//Data
		String msg  = "Welcome to java full stack";
		
		//To input data into file
		FileOutputStream fos  = new FileOutputStream("Input.txt");
		
		//convert string to byte
		byte[] b = msg.getBytes();
		
		//To write data
		fos.write(b);
		
		//for confirmation
		System.out.println("Operation Success");
		
		//close Objects
		fos.close();
		
	}

}
