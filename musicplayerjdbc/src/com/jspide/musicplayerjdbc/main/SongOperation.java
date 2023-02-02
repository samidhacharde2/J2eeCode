package com.jspide.musicplayerjdbc.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import com.jspide.musicplayerjdbc.SongApp;

public class SongOperation {
	private static SongApp songApp;
	ArrayList<SongApp> list = new ArrayList<>();

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static FileReader fileReader;
	private static Properties properties;
	private static int result;
	private static ResultSet resultSet;
	private static String filePath = "F:\\j2eeQSP\\musicplayerjdbc\\src\\src\\main\\resources\\db_info.properties";
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			
			fileReader = new FileReader(filePath);
			
			properties = new Properties();
			properties.load(fileReader);
						
			connection = DriverManager.getConnection
					(properties.getProperty("dburl"),
							properties);
			
			preparedStatement = connection.prepareStatement
					(properties.getProperty("createSong"));
			
			resultSet=preparedStatement.executeQuery(filePath);
			
			int id;
			preparedStatement.setInt(1, id);
			String SongName;
			preparedStatement.setString(2, SongName);
			String MovieName;
			preparedStatement.setString(3, MovieName);
			String SingerName;
			preparedStatement.setString(4, SingerName);
			String Comoser;
			preparedStatement.setString(5, Comoser);
			String Lyrics;
			preparedStatement.setString(5, Lyrics);
			double Duration;
			preparedStatement.setDouble(5, Duration);
			
			int result = preparedStatement.executeUpdate();
			System.out.println(SongName + " is created succesfully");
		
			
			SongApp obj = new SongApp();
SongOperation obj1 = new SongOperation();
int ch;
char str;
while (true) {
		System.out.println("**********************Main Menu***********************");
		System.out.println("1.Create Song");
		System.out.println("2.Remove Song");
		System.out.println("3.update Song details");
		System.out.println("4.Delete Song");
		System.out.println("5.display Song list");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		ch = sc.nextInt();
		switch (ch) {
		case 1: {
			obj1.createSong();
			System.out.println("========================================");
			break;
		}
		case 2: {
			try {
				obj1.removeSong();
				System.out.println("========================================");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}
		case 3: {
			try {
				obj1.updateSongDetails();
				System.out.println("========================================");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}
		case 4: {
			try {
				obj1.displaySong();
				System.out.println("========================================");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}
		default:
			System.out.println("");
		}
		System.out.println("Do you want continue(y/n): ");
		str = sc.next().charAt(0);
		if (str == 'n') {
			System.exit(0);
		}
			
			

//	// Default no argument constructor
//	public SongOperation() {
//
//	}



	public void createSong() {
		System.out.println("=========TO create song enter below details===========");
		System.out.println("Enter the song ID: ");
		int id1 = scanner.nextInt();
		System.out.println("Enter the Song Name:\n ");
		String name1 = scanner.nextLine();
		System.out.println("Enter the Artist Name: \n");
		String artist1 = scanner.nextLine();
		System.out.println("Enter the song duration: \n");
		double duration1 = scanner.nextDouble();
		System.out.println("Enter the albulm name: \n");
		String album1 = scanner.nextLine();	
	}
	
	 public void createPlayList() {
		System.out.println("Enter the name for new PlayList: \n");
		String playListName=scanner.nextLine();
		
		preparedStatement = songApp.prepareStatement(songApp.getProperties().getProperty("findPlayList"));
		
		int result1;
		try {
			result1 = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(result1==0)
		{
			preparedStatement = songApp.getConnection().prepareStatement(songApp.getProperties().getProperty("createPlayList"));
			preparedStatement.setString(1, playListName);
			result=preparedStatement.executeUpdate();
		}
		else
		{
			System.out.println("Playlisyt is already present.");
		}
	}
	public void addSong() {
		System.out.println("Enter the playlist name: \n");
		String playlistname=scanner.nextLine();
		
		System.out.println("enter the song name to add into the playlist: \n");
		String songName=scanner.nextLine();
			
		System.out.println("");
		
//		preparedStatement = songName.prepareStatement
//				(songApp.getProperties().getProperty("addSong"));
	}

	public void removeSong()  {
		preparedStatement = songApp.getConnection().prepareStatement(songApp.getProperties().getProperty("removeSong"));

		System.out.println("Enter the song name which you want to remove: \n");
		String name1 = scanner.nextLine();
		preparedStatement.setString(1, name1);

		result = preparedStatement.executeUpdate();
		System.out.println("Song succesfully removed from the List");
	}

	public void updateSongDetails()   {
		System.out.println("******************You can only update album name:************************** \n");
		preparedStatement = songApp.getConnection()
				.prepareStatement(songApp.getProperties().getProperty("updateSongDetails"));
		System.out.println("Enter the song Id to update details: ");
		int id1 = scanner.nextInt();
		System.out.println("Enter the new album name: \n");
		String albumName = scanner.next();

		try {
			preparedStatement.setString(1, albumName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		preparedStatement.setInt(2, id1);
		result = preparedStatement.executeUpdate();
		System.out.println("Song details updated");
		System.out.println("Do you want to see (y/n)");
		char ch1 = scanner.next().charAt(0);
		if (ch1 == 'y') {
			this.displaySong();
		}
		System.out.println("**************************Thank you for an update****************************");
	}
  
	public void displaySong()  {
		resultSet = preparedStatement.executeQuery(songApp.getProperties().getProperty("displaySong"));
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1) + "|" + resultSet.getString(2) + "|" + resultSet.getString(3)
					+ "|" + resultSet.getString(4) + "|" + resultSet.getString(5));
		}
		
	}
	}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e3) {
			e3.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		
		}
		}

	void displaySong() {
		
	}

	private void updateSongDetails() {
		
	}

	private void removeSong() {
		
	}

	void createSong() {
		
	}

}
