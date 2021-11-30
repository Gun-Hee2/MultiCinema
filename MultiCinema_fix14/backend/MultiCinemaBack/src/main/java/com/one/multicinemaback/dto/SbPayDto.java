package com.one.multicinemaback.dto;

public class SbPayDto {
	
	String tid;
	String id;
	String product;
	int count;
	int payprice;
	String sbdate;
	
	public SbPayDto() {
		
	}

	public SbPayDto(String tid, String id, String product, int count, int payprice, String sbdate) {
		super();
		this.tid = tid;
		this.id = id;
		this.product = product;
		this.count = count;
		this.payprice = payprice;
		this.sbdate = sbdate;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPayprice() {
		return payprice;
	}

	public void setPayprice(int payprice) {
		this.payprice = payprice;
	}

	public String getSbdate() {
		return sbdate;
	}

	public void setSbdate(String sbdate) {
		this.sbdate = sbdate;
	}

	@Override
	public String toString() {
		return "SbPayDto [tid=" + tid + ", id=" + id + ", product=" + product + ", count=" + count + ", payprice="
				+ payprice + ", sbdate=" + sbdate + "]";
	}

	
	
	

}
