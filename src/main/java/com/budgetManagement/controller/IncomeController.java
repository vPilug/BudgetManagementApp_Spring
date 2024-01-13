package com.budgetManagement.controller;
import com.budgetManagement.dto.IncomeDto;
import com.budgetManagement.service.IncomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/incomes")
public class IncomeController {
    private final IncomeService incomeService;

    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }
    @GetMapping("/all")
    public List<IncomeDto> getAllIncomes(){
        return incomeService.getAllIncomes();

    }


}
