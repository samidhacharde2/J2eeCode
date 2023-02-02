package com.jspider.jdbc.insert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcInsert2 {

	private static Connection connection;
	private static Statement statement;
	private static int result;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filePath;
	
	public static void main(String[] args) {
		try {
			
		filePath="F:\\j2eeQSP\\Jdbc\\src\\resource\\db_info.properties";
			
		fileReader=new FileReader(filePath);
		
		properties=new Properties();
		properties.load(fileReader);
		
		Class.forName(properties.getProperty("drivePath"));
		
		connection=DriverManager.getConnection(properties.getProperty("db_url"), properties);
		
		statement=connection.createStatement();
		
		result=statement.executeUpdate(properties.getProperty("query"));
		System.out.println(result+"rows.affected");
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			if(connection != null) {
				
					connection.close();
				} 
				if(statement != null) {
					statement.close();
				}}
				
				catch (SQLException e) {
					e.printStackTrace();
				}
		
	         }
	     }
	}
	

