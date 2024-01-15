package com.budgetManagement.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;
@Data
@Builder
public class CategoryDto {
    private UUID id;
    @NotNull
    private String name;
}
