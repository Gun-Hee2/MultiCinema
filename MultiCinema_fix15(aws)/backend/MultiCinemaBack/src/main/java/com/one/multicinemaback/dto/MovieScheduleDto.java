package com.one.multicinemaback.dto;

public class MovieScheduleDto {
	private int msnum;
	private String title;
	private String theater;
	private String sdate;
	private String edate;
	private int price;
	
	MovieScheduleDto() {
		
	}

	public MovieScheduleDto(int msnum, String title, String theater, String sdate, String edate, int price) {
		super();
		this.msnum = msnum;
		this.title = title;
		this.theater = theater;
		this.sdate = sdate;
		this.edate = edate;
		this.price = price;
	}

	public int getMsnum() {
		return msnum;
	}

	public void setMsnum(int msnum) {
		this.msnum = msnum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MovieScheduleDto [msnum=" + msnum + ", title=" + title + ", theater=" + theater + ", sdate=" + sdate
				+ ", edate=" + edate + ", price=" + price + "]";
	}
	
}
