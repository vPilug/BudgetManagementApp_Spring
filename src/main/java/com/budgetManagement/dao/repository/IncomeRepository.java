package com.budgetManagement.dao.repository;

import com.budgetManagement.dao.entity.Income;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IncomeRepository extends CrudRepository<Income, Long> {
}
