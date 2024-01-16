package com.budgetManagement.dao.repository;
import com.budgetManagement.dao.entity.Expense;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
    void deleteById(UUID id);
    Expense findById(UUID id);

}
