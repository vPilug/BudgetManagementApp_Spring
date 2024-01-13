package com.budgetManagement.service;
import com.budgetManagement.dao.repository.IncomeRepository;
import com.budgetManagement.dto.IncomeDto;
import com.budgetManagement.dto.converter.IncomeConverter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IncomeService {
    private final IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public List<IncomeDto> getAllIncomes(){
        return IncomeConverter.incomeListToIncomeDtoList(incomeRepository.findAll());
    }
}
