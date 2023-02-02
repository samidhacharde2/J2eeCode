package com.jspider.filehadling.charr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharWrite {

	public static void main(String[] args) {
		
		File file=new File("char_file.txt");
		
		if(file.exists()) {
			System.out.println(file.getName()+"Already exists");
	
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
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("Data From the File Handling Program");
			System.out.println("Data Written to file Successfully");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
