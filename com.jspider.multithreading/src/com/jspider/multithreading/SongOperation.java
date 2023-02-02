package com.jspider.multithreading;

import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation {
	Scanner sc = new Scanner(System.in);
	ArrayList<Song> list = new ArrayList<>();

	public void addSong() {
		System.out.println("How many songs you want to add");
		int addCount = sc.nextInt();
		for (int i = 0; i < addCount; i++) {
			Song song = new Song();
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
		for (Song song : list) {
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
		Song song1 = new Song();

		System.out.println("Enter the Id for song");
		Song song = new Song();
		song.setId(sc.nextInt());

		System.out.println("Enter the name of song");
		Song song2 = new Song();
		song2.setSongName(sc.next());

		System.out.println("Enter the singer name");
		Song song3 = new Song();
		song3.setSingerName(sc.next());

		System.out.println("Enter the movie name of song");
		Song song4 = new Song();
		song4.setMovieName(sc.next());

		System.out.println("Enter the name of composer");
		Song song5 = new Song();
		song5.setComoser(sc.next());

		System.out.println("Enter the name of lyrics");
		Song song6 = new Song();
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
		for (Song song : list) {
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

}
