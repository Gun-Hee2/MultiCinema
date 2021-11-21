package com.one.multicinemaback.dto;

public class SnackBarDto {
	
	String product;
	String content;
	int price;
	String category;
	
	public SnackBarDto() {
		
	}

	public SnackBarDto(String product, String content, int price, String category) {
		super();
		this.product = product;
		this.content = content;
		this.price = price;
		this.category = category;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "SnackBarDto [product=" + product + ", content=" + content + ", price=" + price + ", category="
				+ category + "]";
	}
	
	
	
	
	
	
	
	

}
