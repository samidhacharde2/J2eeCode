package com.jspider.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {

			FileInputStream fileInputStreamm = new FileInputStream("student.txt");

			ObjectInput objInStr = new ObjectInputStream(fileInputStreamm);

			Student student = (Student) objInStr.readObject();
			System.out.println(student);

			objInStr.close();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}
