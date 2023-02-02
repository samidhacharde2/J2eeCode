package com.jspider.jdbc.insert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcInsert {

	private static Connection connection;
	private static Statement statement;
	private static int result;
	private static FileReader fileReader;
	private static Properties properties;
	private static String query;
	private static String filePath;
	private static String driverPath="com.mysql.cj.jdbc.Driver";
	private static String db_url="Jdbc:mysql://localhost:3306/wejm4";
	
	public static void main(String[] args) {
		try {
			Class.forName(driverPath);
			
			filePath="F:\\j2eeQSP\\Jdbc\\src\\resource\\db_info.properties";
			
			fileReader = new FileReader(filePath);
			
			properties=new Properties();
			properties.load(fileReader);
			
			connection=DriverManager.getConnection(db_url, properties);
			
			statement=connection.createStatement();
			
			query="insert into students values (104,'Amit','amit@gmail.com',98232588756,'Pune')";
			
			result=statement.executeUpdate(query);
			System.out.println(result+"rows.affected");
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
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
	

