package com.one.multicinemaback.dto;  

public class TicketDto {
	private String tid;	
	private int msnum; 
	private String id;		// 유저 id
	private String title;	// 영화 제목
	private String bdate;	// 구매시간
	private String sdate;	// 시작시간
	private String edate;	// 끝나는시간
	private String theater; // 상영관
	private String snum;	// 좌석번호
	private int price;		// 금액
	
	public TicketDto() {
	}

	public TicketDto(String tid, int msnum, String id, String title, String bdate, String sdate, String edate,
			String theater, String snum, int price) {
		super();
		this.tid = tid;
		this.msnum = msnum;
		this.id = id;
		this.title = title;
		this.bdate = bdate;
		this.sdate = sdate;
		this.edate = edate;
		this.theater = theater;
		this.snum = snum;
		this.price = price;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public int getMsnum() {
		return msnum;
	}

	public void setMsnum(int msnum) {
		this.msnum = msnum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
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

	public String getTheater() {
		return theater;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TicketDto [tid=" + tid + ", msnum=" + msnum + ", id=" + id + ", title=" + title + ", bdate=" + bdate
				+ ", sdate=" + sdate + ", edate=" + edate + ", theater=" + theater + ", snum=" + snum + ", price="
				+ price + "]";
	}

	
	
}
