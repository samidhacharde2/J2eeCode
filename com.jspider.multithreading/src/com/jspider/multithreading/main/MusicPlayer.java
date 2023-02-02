package com.jspider.multithreading.main;

import java.util.Scanner;

import com.jspider.multithreading.SongOperation;


public class MusicPlayer {
	SongOperation songOperation=new SongOperation();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		MusicPlayer music=new MusicPlayer();
		boolean loop=true;
		while (loop) {
			music.musicPlayer11();
			loop=false;
		}
	}
	public void musicPlayer11() {
		System.out.println("Select option: \n1.Play \n2.Add/Remove \n3.Edit \n4.Exit");
		int choose=sc.nextInt();
		switch(choose) {
		case 1:
			songOperation.chooseToPlay();
			break;
			
		case 2:
			songOperation.playAllSongs();
			break;
		
		case 3:
			songOperation.playRandomSong();
			break;
			
		default:
			System.out.println("Invalid choice");
			break;
		}
		
		
		switch (sc.nextInt()) {
			case 1: 
				songOperation.addSong();
				break;
				
			case 2:
				songOperation.removeSong();
				break;
			
				
		case 3:
			songOperation.updateSong();
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
		
		
	}
	musicPlayer11();
	}
	}

