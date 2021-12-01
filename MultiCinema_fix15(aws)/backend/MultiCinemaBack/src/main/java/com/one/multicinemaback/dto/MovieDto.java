package com.one.multicinemaback.dto;

public class MovieDto {
	private int seq;
	private String title;
	private String genre;
	private String content;
	private String director;
    private String odate;
    private float score;
   
    MovieDto() {
    	
    }

	public MovieDto(int seq, String title, String genre, String content, String director, String odate, float score) {
		super();
		this.seq = seq;
		this.title = title;
		this.genre = genre;
		this.content = content;
		this.director = director;
		this.odate = odate;
		this.score = score;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
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

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "MovieDto [seq=" + seq + ", title=" + title + ", genre=" + genre + ", content=" + content + ", director="
				+ director + ", odate=" + odate + ", score=" + score + "]";
	}
    
}
