package com.budgetManagement.service;

import com.budgetManagement.dao.repository.ExpenseRepository;
import com.budgetManagement.dto.ExpenseDto;
import com.budgetManagement.dto.converter.ExpenseConverter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;


    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<ExpenseDto> getAllExpenses(){
        return ExpenseConverter.expenseListToExpenseDtoList(expenseRepository.findAll());
    }
}
