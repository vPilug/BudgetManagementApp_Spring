package com.budgetManagement.service;
import com.budgetManagement.dao.entity.Income;
import com.budgetManagement.dao.repository.IncomeRepository;
import com.budgetManagement.dto.IncomeCreateDto;
import com.budgetManagement.dto.IncomeDto;
import com.budgetManagement.dto.converter.IncomeConverter;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class IncomeService {
    private final IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public List<IncomeDto> getAllIncomes(){
        return IncomeConverter.incomeListToIncomeDtoList(incomeRepository.findAll());
    }

    public IncomeDto createIncome (@Valid IncomeCreateDto incomeDto){
        Income income = new Income();
        income.setId(UUID.randomUUID());
        income.setDate(incomeDto.getDate());
        income.setAmount(incomeDto.getAmount());
        income.setSource(incomeDto.getSource());
        incomeRepository.save(income);
        return IncomeConverter.incomeToIncomeDto(income);
    }
    public void deleteIncome(UUID id){
        incomeRepository.deleteById(id);
    }

    public IncomeDto editIncome(IncomeDto incomeDto){
        Income foundIncome = incomeRepository.findById(incomeDto.getId());
        foundIncome.setDate(incomeDto.getDate());
        foundIncome.setAmount(incomeDto.getAmount());
        foundIncome.setSource(incomeDto.getSource());
        incomeRepository.save(foundIncome);
        return IncomeConverter.incomeToIncomeDto(foundIncome);
    }
    public List<IncomeDto> filterIncomesByDate(LocalDate startDate, LocalDate endDate) {
        List<Income> filteredIncomes = incomeRepository.findByDateBetween(startDate, endDate);
        return filteredIncomes.stream()
                .map(IncomeConverter::incomeToIncomeDto)
                .toList();
    }
}
