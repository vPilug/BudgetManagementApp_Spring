package com.budgetManagement.dto.converter;

import com.budgetManagement.dao.entity.Income;
import com.budgetManagement.dto.IncomeDto;

import java.util.List;
import java.util.stream.StreamSupport;

public class IncomeConverter {
    public static IncomeDto incomeToIncomeDto(Income income) {
        return IncomeDto.builder()
                .id(income.getId())
                .date(income.getDate())
                .amount(income.getAmount())
                .source(income.getSource())
                .build();
    }
    public static List<IncomeDto> incomeListToIncomeDtoList(Iterable<Income> incomes) {
        return StreamSupport.stream(incomes.spliterator(), false)
                .map(IncomeConverter::incomeToIncomeDto)
                .toList();
    }
}
