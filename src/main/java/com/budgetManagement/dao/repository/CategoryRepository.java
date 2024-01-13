package com.budgetManagement.dao.repository;

import com.budgetManagement.dao.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
