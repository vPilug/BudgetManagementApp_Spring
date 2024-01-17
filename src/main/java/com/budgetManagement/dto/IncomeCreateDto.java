package com.budgetManagement.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;
@Data
@Builder
public class IncomeCreateDto {
    @Null
    private UUID id;
    @NotNull(message = "date must be provided")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    @NotNull(message = "amount must be provided")
    @Min(message = "Amount must be positive", value = 1)
    private double amount;
    @NotNull(message = "source must be provided")
    private String source;
}
