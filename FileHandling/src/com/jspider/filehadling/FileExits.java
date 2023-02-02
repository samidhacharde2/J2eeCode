package com.jspider.filehadling;

import java.io.File;
import java.io.IOException;

public class FileExits {

	public static void main(String[] args) {
		
		File file=new File("F:\\j2eeQSP\\FileHandling\\Demo1.txt");
	
	if(file.exists()) {
		System.out.println("File Already Exist");
	}else {
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
		System.out.println("File NOt Found");
	}

}
}