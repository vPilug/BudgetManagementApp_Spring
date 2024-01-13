package com.budgetManagement.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Builder;
import lombok.Data;


import java.util.UUID;
@Data
@Builder
public class CategoryCreateDto {
    @Null
    private UUID id;
    @NotNull(message = "name must be provided")
    private String name;
}
