package com.budgetManagement.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table(name = "expenses")
@Getter
@Setter
public class Expense {
    @Id
    private UUID id;
    private LocalDate date;
    private double amount;
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnore
    private Category category;

}
