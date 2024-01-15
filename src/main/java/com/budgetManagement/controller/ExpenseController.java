package com.budgetManagement.controller;

import com.budgetManagement.dto.ExpenseCreateDto;
import com.budgetManagement.dto.ExpenseDto;
import com.budgetManagement.service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public ExpenseDto addExpense(@Valid @RequestBody ExpenseCreateDto expenseDto){
        return expenseService.createExpense(expenseDto);
    }

}
