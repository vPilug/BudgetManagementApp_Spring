package com.budgetManagement.service;

import com.budgetManagement.dao.entity.Category;
import com.budgetManagement.dao.repository.CategoryRepository;
import com.budgetManagement.dto.CategoryCreateDto;
import com.budgetManagement.dto.CategoryDto;
import com.budgetManagement.dto.converter.CategoryConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    public List<CategoryDto> getAllCategories(){
        return CategoryConverter.categoryListToCategoryListDto(categoryRepository.findAll());
    }
    public CategoryDto createCategory(CategoryCreateDto categoryDto){
        Category category = new Category();
        category.setId(UUID.randomUUID());
        category.setName(categoryDto.getName());
        categoryRepository.save(category);
        return CategoryConverter.categoryToCategoryDto(category);
    }
}
