package com.budgetManagement.dao.repository;

import com.budgetManagement.dao.entity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByName(String name);
    Optional<Category> deleteById(UUID id);

}
