package com.budgetManagement.service;

import com.budgetManagement.dao.entity.Category;
import com.budgetManagement.dao.entity.Expense;
import com.budgetManagement.dao.repository.CategoryRepository;
import com.budgetManagement.dao.repository.ExpenseRepository;
import com.budgetManagement.dto.ExpenseCreateDto;
import com.budgetManagement.dto.ExpenseDto;
import com.budgetManagement.dto.converter.ExpenseConverter;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
    private final CategoryRepository categoryRepository;


    public ExpenseService(ExpenseRepository expenseRepository, CategoryRepository categoryRepository) {
        this.expenseRepository = expenseRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<ExpenseDto> getAllExpenses(){
        return ExpenseConverter.expenseListToExpenseDtoList(expenseRepository.findAll());
    }

    public ExpenseDto createExpense(ExpenseCreateDto expenseDto){
        Expense expense = new Expense();
        expense.setId(UUID.randomUUID());
        expense.setDate(expenseDto.getDate());
        expense.setAmount(expenseDto.getAmount());
        expense.setDescription(expenseDto.getDescription());
        Category category = categoryRepository.findByName(expenseDto.getCategoryName())
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
        expense.setCategory(category);
        expenseRepository.save(expense);
        return ExpenseConverter.expenseToExpenseDto(expense);
    }

}
