package com.jspider.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {

		File file = new File("student.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
			Student student = new Student();
			student.setId(1);
			student.setName("Sami");
			student.setEmail("s@gmail.com");
			student.setAddress("Pune");

			ObjectOutputStream objOutStr = new ObjectOutputStream(fileOutputStream);
			objOutStr.writeObject(student);
			System.out.println("Object Written to File Successfully");
			objOutStr.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
