package com.jspider.multiplayercasestudyhibernate.dto;

import java.sql.SQLException;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SongsDTO {
	@Id	
	private static Scanner scanner =new Scanner(System.in);
    private static int result;
	
    @GeneratedValue(strategy = GenerationType.AUTO)
	private static int id;
    
    @Column(name="SongName")
	private static String name;
	private static String singer;
	private static int duration;
	private static String movie_album;
	private static String lyricist;
	private static String composer;



	public void addSongs() {
		
			
			System.out.println("Enter the song id : ");
//			id = scanner.nextInt();
			
			System.out.println("Enter the song name : ");
			name = scanner.next();
			
			System.out.println("Enter the song singer : ");
			singer = scanner.next();
			
			System.out.println("Enter the song duration : ");
			duration = scanner.nextInt();
			
			System.out.println("Enter the song movie/album : ");
			movie_album = scanner.next();
			
			System.out.println("Enter the song lyricist : ");
			lyricist = scanner.next();
			
			System.out.println("Enter the song composer : ");
			composer = scanner.next();

			if (result != 0) {
				System.out.println(name + " successfully added to playlist");
			}
			
	

	}

	public void removeSongs() {

		
	}
}
