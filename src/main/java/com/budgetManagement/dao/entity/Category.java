package com.budgetManagement.dao.entity;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;
@Entity
@Table(name = "categories")
@Getter
public class Category {
    @Id
    private UUID id;
    @Column(unique = true)
    private String name;

}
