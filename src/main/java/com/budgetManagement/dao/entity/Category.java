package com.budgetManagement.dao.entity;
import jakarta.persistence.*;
import java.util.UUID;
@Entity
public class Category {
    @Id
    private UUID id;
    @Column(unique = true)
    private String name;



}
