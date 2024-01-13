package com.budgetManagement.dto.converter;

import com.budgetManagement.dao.entity.Expense;
import com.budgetManagement.dto.ExpenseDto;

import java.util.List;
import java.util.stream.StreamSupport;

public class ExpenseConverter {
    public static ExpenseDto expenseToExpenseDto(Expense expense){
        return ExpenseDto.builder()
                .id(expense.getId())
                .date(expense.getDate())
                .amount(expense.getAmount())
                .description(expense.getDescription())
                .category(expense.getCategory())
                .build();
    }

    public static List<ExpenseDto> expenseListToExpenseDtoList(Iterable<Expense> expenses){
        return StreamSupport.stream(expenses.spliterator(),false)
                .map(ExpenseConverter::expenseToExpenseDto)
                .toList();
    }
}
