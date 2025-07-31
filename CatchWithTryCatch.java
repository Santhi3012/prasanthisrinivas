package com.Exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CatchWithTryCatch {

	public static void main(String[] args) throws IOException {
		
		int a = 10,b = 0;
		try {
			System.out.println(a/b);
		}//try
		catch(Exception e) {
			
			//writing data into a file
			try {
				FileWriter fw = new FileWriter("Exceptioninfo.txt");
				Date d = new Date();
				//Convert Exception Object data into String
				String msg = e.toString();
				String msg1 = e.toString();
				
				//To write
				fw.write(msg);
				fw.write(msg1);
				
				//Confirmation
				System.out.println("Operation Success");
				
				//To close object
				fw.close();
				} //try
				catch (IOException e1) {
					e1.printStackTrace();
				}//catch
		}//catch
	}
}
	
		
		
	


