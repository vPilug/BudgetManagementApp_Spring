package com.budgetManagement.controller;

import com.budgetManagement.dto.ExpenseDto;
import com.budgetManagement.service.ExpenseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/all")
    public List<ExpenseDto> getAllExpenses(){
    return expenseService.getAllExpenses();
    }
}
