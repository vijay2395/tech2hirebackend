package com.spendinaday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spendinaday.entity.BudgetEntity;

@Repository
public interface BudgetRepository extends JpaRepository<BudgetEntity, String>{

	public BudgetEntity findBybudgetid(Integer budgetid);
	
	
}
