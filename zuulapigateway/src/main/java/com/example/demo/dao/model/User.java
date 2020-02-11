package com.example.demo.dao.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {
	
	private Long Id;
	private String username;
	private String password;
	private String email;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	 public User() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	public User(Long id, String username, String password, String email) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	
	
	
	

}
