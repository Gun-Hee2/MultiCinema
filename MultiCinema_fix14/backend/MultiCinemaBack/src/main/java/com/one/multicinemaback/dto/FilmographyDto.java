package com.one.multicinemaback.dto;

public class FilmographyDto {
	private int fseq;
	private int faid;
	
	public FilmographyDto(){
		
	}

	public FilmographyDto(int fseq, int faid) {
		super();
		this.fseq = fseq;
		this.faid = faid;
	}

	public int getFseq() {
		return fseq;
	}

	public void setFseq(int fseq) {
		this.fseq = fseq;
	}

	public int getFaid() {
		return faid;
	}

	public void setFaid(int faid) {
		this.faid = faid;
	}

	@Override
	public String toString() {
		return "FilmographyDto [fseq=" + fseq + ", faid=" + faid + "]";
	}
	
	
}
