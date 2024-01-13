package com.budgetManagement.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table(name = "incomes")
@Getter

public class Income {
    @Id
    private UUID id;
    private LocalDate date;
    private double amount;
    private String source;

}
