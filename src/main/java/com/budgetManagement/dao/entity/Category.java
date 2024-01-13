package com.budgetManagement.dao.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Entity
@Table(name = "categories")
@Getter
@Setter
public class Category {
    @Id
    private UUID id;
    @Column(unique = true)
    private String name;

}
