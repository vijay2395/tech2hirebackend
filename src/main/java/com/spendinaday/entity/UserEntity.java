package com.spendinaday.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserEntity {

	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;


public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

@Column(name="mail")	
private String email;
	
@Column(name="budget")	
private String budget;
	
@Id
@Column(name="username")		
private String username;


public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getBudget() {
	return budget;
}

public void setBudget(String budget) {
	this.budget = budget;
}

	
	
	
}
