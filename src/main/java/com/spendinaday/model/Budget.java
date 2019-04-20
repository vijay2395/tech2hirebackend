package com.spendinaday.model;

import java.sql.Date;

public class Budget {

	

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

	public Integer getBudgetid() {
		return budgetid;
	}

	public void setBudgetid(Integer budgetid) {
		this.budgetid = budgetid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String username;
	private Integer expenses;
	
	private String category;
	
	private Integer budgetid;
	
	private Date date;

}
