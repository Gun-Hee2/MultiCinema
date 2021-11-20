package com.one.multicinemaback.dto;

public class MovieDto {
	private String title;
	private String genre;
	private String content;
	private String director;
	private String odate;
	private int score;
	
	public MovieDto(){
	}
	
	public MovieDto(String title, String genre, String content, String director, String odate, int score) {
		super();
		this.title = title;
		this.genre = genre;
		this.content = content;
		this.director = director;
		this.odate = odate;
		this.score = score;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "MovieDto [title=" + title + ", genre=" + genre + ", content=" + content + ", director=" + director
				+ ", odate=" + odate + ", score=" + score + "]";
	}
}
