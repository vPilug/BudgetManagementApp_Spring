package com.budgetManagement.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class IncomeDto {
private UUID id;
private LocalDate date;
private double amount;
private String source;

}
