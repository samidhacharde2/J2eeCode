package com.jspide.musicplayerjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class SongApp {

//	private static Connection connection;
//	private static FileReader filereader;
//	private static String filepath = "F:\\j2eeQSP\\musicplayerjdbc\\src\\src\\main\\resources\\db_info.properties";
//	private static Properties properties;
//	private Scanner sc = new Scanner(System.in);
	
	private int id;
	private String SongName;
	private String MovieName;
	private String SingerName;
	private String Comoser;
	private String Lyrics;
	private double Duration;
	 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return SongName;
	}
	public void setSongName(String songName) {
		SongName = songName;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getSingerName() {
		return SingerName;
	}
	public void setSingerName(String singerName) {
		SingerName = singerName;
	}
	public String getComoser() {
		return Comoser;
	}
	public void setComoser(String comoser) {
		Comoser = comoser;
	}
	public String getLyrics() {
		return Lyrics;
	}
	public void setLyrics(String lyrics) {
		Lyrics = lyrics;
	}
	public double getDuration() {
		return Duration;
	}
	public void setDuration(double duration) {
		Duration = duration;
	}
	
	
	@Override
	public String toString() {
		return "SongApp [id=" + id + ", SongName=" + SongName + ", MovieName=" + MovieName + ", SingerName="
				+ SingerName + ", Comoser=" + Comoser + ", Lyrics=" + Lyrics + ", Duration=" + Duration + "]";
	}
	Scanner sc = new Scanner(System.in);
	ArrayList<SongApp> list = new ArrayList<>();
	
	public void addSong() {
		System.out.println("How many songs you want to add");
		int addCount = sc.nextInt();
		for (int i = 0; i < addCount; i++) {
			SongApp song = new SongApp();
			System.out.println("Enter the Id for song:");
			song.setId(sc.nextInt());

			System.out.println("Enter the name of song");
			song.setSongName(sc.next());

			System.out.println("Enter the singer name");
			song.setSingerName(sc.next());

			System.out.println("Enter the movie name of the song");
			song.setMovieName(sc.next());

			System.out.println("Enter the name of composer");
			song.setLyrics(sc.next());

			System.out.println("Enter the duration time of the song");
			song.setDuration(sc.nextDouble());

			list.add(song);
		}
	}

	public void displayAllSongs() {
		if (list.isEmpty()) {
			System.out.println("Add song then you will get songlist");
			addSong();
		}
		for (SongApp song : list) {
			System.out.println(song.getSongName());
		}
	}

	public void removeSong() {
		if (list.isEmpty()) {
			System.out.println("Add songs then remove");
			addSong();
		}
		System.out.println("select song to remove");
		displayAllSongs();
		int removeId = sc.nextInt();
		System.out.println(list.get(removeId - 1).getSongName() + "remove successfully");
		list.remove(removeId - 1);
		displayAllSongs();
	}

	public void updateSong() {
		if (list.isEmpty()) {
			System.out.println("add song then update");
			addSong();
		}
		System.out.println("select song to update");
		displayAllSongs();
		int update = sc.nextInt();
		list.remove(update - 1);
		SongApp song1 = new SongApp();

		System.out.println("Enter the Id for song");
		SongApp song = new SongApp();
		song.setId(sc.nextInt());

		System.out.println("Enter the name of song");
		SongApp song2 = new SongApp();
		song2.setSongName(sc.next());

		System.out.println("Enter the singer name");
		SongApp song3 = new SongApp();
		song3.setSingerName(sc.next());

		System.out.println("Enter the movie name of song");
		SongApp song4 = new SongApp();
		song4.setMovieName(sc.next());

		System.out.println("Enter the name of composer");
		SongApp song5 = new SongApp();
		song5.setComoser(sc.next());

		System.out.println("Enter the name of lyrics");
		SongApp song6 = new SongApp();
		song6.setLyrics(sc.next());

		System.out.println("Enter the duration time of song");
		double duration = sc.nextDouble();
		song2.setDuration(duration);

		list.add(update - 1, song2);
		System.out.println(list.get(update - 1).getSongName() + "update the song detail succesfully");
	}

	public void chooseToPlay() {
		if (list.isEmpty()) {
			System.out.println("Add songs then play");
			addSong();

		}
		System.out.println("Select song to play ");
		displayAllSongs();
		int play = sc.nextInt();
		System.out.println("Playing song" + list.get(play - 1).getSongName());
	}

	public void playAllSongs() {
		if (list.isEmpty()) {
			System.out.println("Add songs then play");
			addSong();

		}
		System.out.println("playing all songs");
		for (SongApp song : list) {
			System.out.println(song.getSongName());
		}
	}

	public void playRandomSong() {
		if (list.isEmpty()) {
			System.out.println("Add songs then play");
			addSong();
		}
		System.out.println("playing random songs");
		double number = Math.random();
		int random = (int) (number * 10) + 1;
		if (random > list.size()) {
			random = 1;
		}
		System.out.println("playing song" + list.get(random).getSongName());
		
		

	}
	public Properties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}
	public PreparedStatement prepareStatement(String property) {
		// TODO Auto-generated method stub
		return null;
	}
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
		
		
		
		
		
		
		
		
		
		
		
		


////		SongApp obj = new SongApp();
////		obj.getConn();
//SongOperation obj1 = new SongOperation();
//int ch;
//char str;
//while (true) {
//		System.out.println("**********************Main Menu***********************");
//		System.out.println("1.Create Song");
//		System.out.println("2.Remove Song");
//		System.out.println("3.update Song details");
//		System.out.println("4.Delete Song");
//		System.out.println("5.display Song list");
//		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your choice");
//		ch = sc.nextInt();
//		switch (ch) {
//		case 1: {
//			obj1.createSong();
//			System.out.println("========================================");
//			break;
//		}
//		case 2: {
//			try {
//				obj1.removeSong();
//				System.out.println("========================================");
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			break;
//		}
//		case 3: {
//			try {
//				obj1.updateSongDetails();
//				System.out.println("========================================");
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			break;
//		}
//		case 4: {
//			try {
//				obj1.displaySong();
//				System.out.println("========================================");
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			break;
//		}
//		default:
//			System.out.println("");
//		}
//		System.out.println("Do you want continue(y/n): ");
//		str = sc.next().charAt(0);
//		if (str == 'n') {
//			System.exit(0);
//		}
//} catch (SQLException e1) {
//	// TODO Auto-generated catch block
//	e1.printStackTrace();
//}}
//	public System getProperties() {
//		return null;
//	}
//	public Object getConnection() {
//		return null;
	
//		}}


