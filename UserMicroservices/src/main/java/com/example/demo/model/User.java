package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "username should not be blank")
	@Size(min = 0,max = 30,message = "user name should be in between 0-30")
	private  String username;

	@NotBlank(message = "password should not be empty")
	@Size(min = 0,max = 30,message = "password should be in between 0-30")
	@Column(unique = true)
	private String password;

	@NotBlank(message = "role should not be empty")
	@Size(min = 0,max = 15,message = "role should be in between 0-15")
	private String role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long id,
			@NotBlank(message = "username should not be blank") @Size(min = 0, max = 30, message = "user name should be in between 0-30") String username,
			@NotBlank(message = "password should not be empty") @Size(min = 0, max = 30, message = "password should be in between 0-30") String password,
			@NotBlank(message = "role should not be empty") @Size(min = 0, max = 15, message = "role should be in between 0-15") String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}




}
