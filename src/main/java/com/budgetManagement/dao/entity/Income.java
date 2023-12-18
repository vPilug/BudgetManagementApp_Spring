package com.budgetManagement.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.UUID;
@Entity
public class Income {
    @Id
    private UUID id;
    private LocalDate date;
    private double amount;
    private String source;
}
