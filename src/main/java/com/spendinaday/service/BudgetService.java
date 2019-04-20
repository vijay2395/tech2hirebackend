package com.spendinaday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spendinaday.dto.BudgetEntityToBudgetDTO;
import com.spendinaday.entity.BudgetEntity;
import com.spendinaday.model.Budget;
import com.spendinaday.repository.BudgetRepository;

@Service
public class BudgetService {

	
	@Autowired
	BudgetRepository budgetRepo;
	
	@Autowired
	BudgetEntityToBudgetDTO budgetDto;
	

		
	public void addBudgetToUser(Budget budget) {
		// TODO Auto-generated method stub
		
		
	}

	public Budget getBudgetOfUserUsingUserid(Integer id) {
		// TODO Auto-generated method stub
	BudgetEntity budgetEntity=budgetRepo.findBybudgetid(id);
	
	Budget budget=budgetDto.convertBudgetEntityToBudget(budgetEntity);
	
	return budget;
	}

	
	
}
