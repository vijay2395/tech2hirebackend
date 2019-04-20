package com.spendinaday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spendinaday.model.Budget;
import com.spendinaday.service.BudgetService;


@RestController
@CrossOrigin()
public class BudgetController {

	
	@RequestMapping("/budget")
	public String getMsg() {
		// TODO Auto-generated method stub
		return "Welcome to Spend in a Day API!";
		
	}
	
	
	@Autowired
	BudgetService budgetService;
	
	@RequestMapping("/budget/addbudget")
	private String addBudgetToUser(@RequestBody Budget budget) {
		// TODO Auto-generated method stub
		budgetService.addBudgetToUser(budget);
		
		return null;
	}
	
	@GetMapping("/budget/getBudget/{userid}")
	private Budget getUser(@PathVariable("userid") Integer id) {
		// TODO Auto-generated method stub
		Budget budget=budgetService.getBudgetOfUserUsingUserid(id);
		
		return budget;
	}
}
