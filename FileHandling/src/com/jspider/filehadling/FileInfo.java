package com.jspider.filehadling;

import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String[] args) {
		
	
	File file=new File("file_Info.txt");
	
	if(file.exists()) {
		System.out.println(file.getName()+"File Already Exist");
		System.out.println(file.getAbsolutePath()+"File Path");
	}else {
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath()+"File Created");
	}
	if(file.canRead()) {
		System.out.println("File is Readable");
	}else {
		System.out.println("File is Not Readable");
	}
	if(file.canWrite()) {
		System.out.println("File is Writeable");
	}else {
		System.out.println("File is not Writeable");
	}
	if(file.canExecute()) {
		System.out.println("File is Created");
	}else {
		System.out.println("File is not Executable");
	}
}
}