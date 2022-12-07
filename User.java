package com.social.media.application.entities;

import java.time.LocalDate;

public class User {
	
	private Integer user_id;
	private String user_name;
	private LocalDate user_birth_date;
	public User(Integer user_id, String user_name, LocalDate user_birth_date) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_birth_date = user_birth_date;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public LocalDate getUser_birth_date() {
		return user_birth_date;
	}
	public void setUser_birth_date(LocalDate user_birth_date) {
		this.user_birth_date = user_birth_date;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_birth_date=" + user_birth_date + "]";
	}

}
