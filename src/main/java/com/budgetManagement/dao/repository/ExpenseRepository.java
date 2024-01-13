package com.budgetManagement.dao.repository;

import com.budgetManagement.dao.entity.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
