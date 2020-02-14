package com.pratu.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message="user name should not be empty")
	@Size(min=1,max=10,message="name should be in between 0-10")
	private String username;

	@NotBlank(message="password should not be empty")
	@Size(min=1,max=15,message="password should be in between 0-15")
	private String password;

	@NotBlank(message="email should not be empty")
	@Email(message="invalid format")
	private String email;

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
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(
			@NotBlank(message = "user name should not be empty") @Size(min = 1, max = 10, message = "name should be in between 0-10") String username,
			@NotBlank(message = "password should not be empty") @Size(min = 1, max = 15, message = "password should be in between 0-15") String password,
			@NotBlank(message = "email should not be empty") @Email(message = "invalid format") String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}





}
