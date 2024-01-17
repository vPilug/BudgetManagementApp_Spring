package com.budgetManagement.dao.repository;

import com.budgetManagement.dao.entity.Income;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Repository
public interface IncomeRepository extends CrudRepository<Income, Long> {
    void deleteById(UUID id);
    Income findById(UUID id);

    List<Income> findByDateBetween(LocalDate startDate, LocalDate endDate);
}
