//Writing To a File

package com.jspider.filehadling.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWrite {

	public static void main(String[] args) {

		File file=new File("byte_File.txt");
		
		if(file.exists()) {
			System.out.println(file.getName()+"Alredy Exist");
				
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(file.getName()+"is Create");
    	}
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			try {
				fileOutputStream.write(45);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Data Written to file Successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
