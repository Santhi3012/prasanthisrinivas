//serialization
package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWithRealOject {

	public static void main(String[] args) throws IOException {
		//create object
		Employee e =new Employee(1001,"Santhi",900047628);
		
		//To Write object info into a file
		FileOutputStream fos = new FileOutputStream("Employeeinfo.txt");
		
		//To write an object 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//To write
		oos.writeObject(e);
		
		//cofirmation
		System.out.println("Operation Success");
		
		//close object
		oos.close();
		fos.close();
		

	}

}
