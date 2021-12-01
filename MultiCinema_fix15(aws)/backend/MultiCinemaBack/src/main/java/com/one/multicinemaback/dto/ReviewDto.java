package com.one.multicinemaback.dto;

public class ReviewDto {

	private int rnum;
	private int seq;
	private String id;
	private String wdate;
	private String content;
	private int score;
	
	public ReviewDto() {
		
	}
	
	

	public ReviewDto(int rnum, int seq, String id, String wdate, String content, int score) {
		super();
		this.rnum = rnum;
		this.seq = seq;
		this.id = id;
		this.wdate = wdate;
		this.content = content;
		this.score = score;
	}



	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "ReviewDto [rnum=" + rnum + ", seq=" + seq + ", id=" + id + ", wdate=" + wdate + ", content=" + content
				+ ", score=" + score + "]";
	}
	
}
