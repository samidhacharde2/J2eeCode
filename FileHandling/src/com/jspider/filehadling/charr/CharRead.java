package com.jspider.filehadling.charr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharRead {

	public static void main(String[] args) {
		
		File file=new File("char_file.txt");
		
		if(file.exists()) {
			System.out.println(file.getName()+"Already Exist");
		
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
			FileReader fileReader=new FileReader(file);
			System.out.println(file.canRead());
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
