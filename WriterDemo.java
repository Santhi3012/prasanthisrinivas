package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		//Data
		String msg  = "Welcome to RISE";
		String msg1 = "Welcome to java full stack";
		
		//To write into a file
		FileWriter fw = new FileWriter("Demo.txt",true);
		
		//To write
		fw.write(msg);
		//fw.write(msg1);
		
		//confirmation 
		System.out.println("Operation Success");
		
		//Close the objects
		fw.close();
	}

}
