package com.budgetManagement.dto;

import com.budgetManagement.dao.entity.Category;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;
@Data
@Builder
public class ExpenseCreateDto {
    @Null
    private UUID id;
    @NotNull(message = "date must be provided")
    private LocalDate date;
    @NotNull(message = "amount must be provided")
    @Min(message = "Amount must be positive", value = 1)
    private double amount;
    @NotNull(message = "description must be provided")
    private String description;
    @NotNull(message = "category must be provided")
    private String categoryName;
}
