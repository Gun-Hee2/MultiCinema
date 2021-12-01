package com.one.multicinemaback.dto;

public class SnackBarDto {
	private String product;
	private String category;
	private String content;
	private int price;
	
	public SnackBarDto() {
		
	}

	public SnackBarDto(String product, String category, String content, int price) {
		super();
		this.product = product;
		this.category = category;
		this.content = content;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	@Override
	public String toString() {
		return "SnackBarDto [product=" + product + ", category=" + category + ", content=" + content + ", price="
				+ price + "]";
	}
	
	
	
}
