package com.budgetManagement.controller;
import com.budgetManagement.dto.IncomeCreateDto;
import com.budgetManagement.dto.IncomeDto;
import com.budgetManagement.service.IncomeService;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public IncomeDto addIncome(@Valid @RequestBody IncomeCreateDto incomeDto){
    return incomeService.createIncome(incomeDto);
    }


}
