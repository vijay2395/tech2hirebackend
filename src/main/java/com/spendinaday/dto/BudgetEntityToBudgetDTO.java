package com.spendinaday.dto;

import org.springframework.stereotype.Component;

import com.spendinaday.entity.BudgetEntity;
import com.spendinaday.model.Budget;

@Component
public class BudgetEntityToBudgetDTO {

	
	public Budget convertBudgetEntityToBudget(BudgetEntity budgetentity)
	{
		Budget budget=new Budget();
		
		budget.setExpenses(budgetentity.getExpenses());
		budget.setCategory(budgetentity.getCategory());
		budget.setDate(budgetentity.getDate());
		budget.setBudgetid(budgetentity.getBudgetid());
		budget.setUsername(budgetentity.getUsername());
		
		return budget;
		
		
	}
}
