package com.budgetManagement.controller;
import com.budgetManagement.dto.IncomeCreateDto;
import com.budgetManagement.dto.IncomeDto;
import com.budgetManagement.service.IncomeService;
import jakarta.annotation.Nullable;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

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
    @DeleteMapping("/delete/{id}")
    @Transactional
    public void deleteIncome(@PathVariable UUID id){
    incomeService.deleteIncome(id);
    }
    @PutMapping
    public IncomeDto editIncome(@Valid @RequestBody IncomeDto incomeDto){
        return incomeService.editIncome(incomeDto);
    }
    @GetMapping("/filterByDate")
    public List<IncomeDto> filterIncomesByDate(
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        return incomeService.filterIncomesByDate(startDate, endDate);
    }
}
