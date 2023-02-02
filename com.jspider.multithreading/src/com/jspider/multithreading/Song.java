package com.jspider.multithreading;

public class Song {
	
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
	public  void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return SongName;
	}
	public  void setSongName(String i) {
		this.SongName = i;
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
		return "Song [id=" + id + ", SongName=" + SongName + ", MovieName=" + MovieName + ", SingerName=" + SingerName
				+ ", Comoser=" + Comoser + ", Lyrics=" + Lyrics + ", Duration=" + Duration + "]";
	}
	
	

}
