package com.jspider.filehadling;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
		File file=new File("demo.txt");
		
		if(file.exists()) {
			file.delete();
			System.out.println("File is Deleted");
		}else {
			System.out.println("File Does not exist");
		}
	}
	

}
