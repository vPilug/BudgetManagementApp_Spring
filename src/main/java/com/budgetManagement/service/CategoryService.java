package com.budgetManagement.service;

import com.budgetManagement.dao.repository.CategoryRepository;
import com.budgetManagement.dto.CategoryDto;
import com.budgetManagement.dto.converter.CategoryConverter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public List<CategoryDto> getAllCategories(){
        return CategoryConverter.categoryListToCategoryListDto(categoryRepository.findAll());
    }
}
