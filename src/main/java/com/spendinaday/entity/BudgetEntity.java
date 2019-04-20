package com.spendinaday.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="budgetdetails")
public class BudgetEntity {

	@Column(name="expensed")
	private Integer expenses;
	
	@Column(name="category")
	private String category;
	
	
	@Column(name="budgetid")
	private Integer budgetid;
	
	@Column(name="date")
	private Date date;

	@Id
	@Column(name="username")

	private String username;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getBudgetid() {
		return budgetid;
	}

	public void setBudgetid(Integer budgetid) {
		this.budgetid = budgetid;
	}


	public Integer getExpenses() {
		return expenses;
	}

	public void setExpenses(Integer expenses) {
		this.expenses = expenses;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}
