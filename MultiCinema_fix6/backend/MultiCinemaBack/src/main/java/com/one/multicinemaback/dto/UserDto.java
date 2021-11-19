package com.one.multicinemaback.dto;

public class UserDto {
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String email;
	private String phone;
	private int auth;
	
	public UserDto() {
		
	}
	public UserDto(String id, String pw, String name, String birth, String email, String phone, int auth) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
		this.auth = auth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAuth() {
		return auth;
	}
	public void setAuth(int auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", pw=" + pw + ", name=" + name + ", birth=" + birth + ", email=" + email
				+ ", phone=" + phone + ", auth=" + auth + "]";
	}
	
}
