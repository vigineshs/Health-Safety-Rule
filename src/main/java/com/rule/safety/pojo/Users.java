package com.rule.safety.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	public Users() {
		
	}

	public Users(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role= role;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid", unique=true, nullable=false)
	private Integer userID;
	
	@Column(name="username", unique=true, nullable=false, length=45)
	private String username;
	
	@Column(name="password", unique=true, nullable=false, length=45)
	private String password;

	@Column(name="role", unique=true, nullable=false, length=45)
	private String role;
	
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
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
	
}
