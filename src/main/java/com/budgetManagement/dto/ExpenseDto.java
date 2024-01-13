package com.budgetManagement.dto;

import com.budgetManagement.dao.entity.Category;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;
@Data
@Builder
public class ExpenseDto {
    private UUID id;
    private LocalDate date;
    private double amount;
    private String description;
    private Category category;
}
