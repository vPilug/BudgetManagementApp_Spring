package com.budgetManagement.dao.repository;
import com.budgetManagement.dao.entity.Category;
import com.budgetManagement.dao.entity.Expense;
import org.springframework.data.repository.CrudRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
    void deleteById(UUID id);
    Expense findById(UUID id);
    List<Expense> findByDateBetween(LocalDate startDate, LocalDate endDate);
    List<Expense> findByCategory(Category category);
}
