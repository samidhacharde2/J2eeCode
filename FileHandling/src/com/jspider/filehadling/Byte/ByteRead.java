package com.jspider.filehadling.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteRead {

	public static void main(String[] args) {
     
		File file=new File("byte_File.txt");
		
		if(file.exists()) {
			System.out.println(file.getName()+"is Already Exist");
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(file.getName()+"is Created");
		}
		try {
			FileInputStream fileInputStream=new FileInputStream(file);
			int read;
			
				read = fileInputStream.read();
			
			System.out.println(read);
			System.out.println("Data read From file Successfully");
			fileInputStream.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}
