package com.jspider.filehadling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
		File file=new File("demo.txt");
		
	if(file.exists()){
		System.out.println("File Already Exist");
	}
	else {
		try {
			file.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("New File Created");
	}
	}
}
