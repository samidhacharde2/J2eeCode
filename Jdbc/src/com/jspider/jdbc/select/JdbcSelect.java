package com.jspider.jdbc.select;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcSelect {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static FileReader fileReader;
	private static Properties properties;
    private static String query;
	private static String filePath;
	private static String driverPath = "com.mysql.cj.jdbc.Driver";
	private static String db_url = "jdbc:mysql://localhost:3306/wejm4";
	
	
	public static void main(String[] args)  {
		try {
			Class.forName(driverPath);
			filePath="F:\\j2eeQSP\\Jdbc\\src\\com\\jspider\\jdbc\\select\\JdbcSelect.java";
			
			fileReader=new FileReader(filePath);
			
			properties=new Properties();
			properties.load(fileReader);
            
			connection=DriverManager.getConnection(db_url, properties);
			
			statement=connection.createStatement();
			
			query="Select * from student";
			
			resultSet=statement.executeQuery(query);
			
			
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" | "
						          +resultSet.getString(2)+" | "
						          +resultSet.getString(3)+" | "
						          +resultSet.getLong(4)+" | "
					          +resultSet.getString(5));
			}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if(connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
				}
				if (statement != null) {
					try {
						statement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(resultSet != null) {
					try {
						resultSet.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	
	}
}