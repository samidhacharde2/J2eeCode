//Third Way to Connect Jdbc to Mysql

package com.jspider.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc3 {

	public static void main(String args[]) {
		
		try {
		//Step 1: Load the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Loading the db_info File in FileReader Object
			FileReader fileReader=new FileReader("F:\\j2eeQSP\\Jdbc\\src\\com\\jspider\\resource\\db_info.properties");
			
			//Loading the file as Properties of jdbc
			Properties properties=new Properties();
			properties.load(fileReader);
			
		//Step 2: Open the Connection
			Connection connection=DriverManager.getConnection("jdbc://mysql://localhost:3306/wej4", properties);
			
	    //Step 3: Create/Prepare the Statment
			Statement statement=connection.createStatement();
			
			ResultSet resultSet=statement.executeQuery("Select * From student");
			
		//Process The Result
			while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" | "
			                  +resultSet.getString(2)+" | "
			                  +resultSet.getString(3)+" | "
			                  +resultSet.getLong(4)+" | "
			                  +resultSet.getString(5));
			}
			
		//Step 5: Close the Connection
			connection.close();
			statement.close();
			resultSet.close();
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
