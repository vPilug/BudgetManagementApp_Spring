package com.budgetManagement.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class IncomeDto {
private UUID id;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private LocalDate date;
private double amount;
private String source;
}
