package com.one.multicinemaback.dto;

public class ActorDto {
	private String actor;
	private int age;
	private String country;
	private String career;
	
	ActorDto(){
		
	}

	public ActorDto(String actor, int age, String country, String career) {
		super();
		this.actor = actor;
		this.age = age;
		this.country = country;
		this.career = career;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
	
}
