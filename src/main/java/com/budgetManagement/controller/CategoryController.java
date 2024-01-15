package com.budgetManagement.controller;

import com.budgetManagement.dto.CategoryCreateDto;
import com.budgetManagement.dto.CategoryDto;
import com.budgetManagement.service.CategoryService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    public List<CategoryDto> getAllCategories(){
        return categoryService.getAllCategories();
    }
    @PostMapping("/add")
        public CategoryDto addCategory(@Valid @RequestBody CategoryCreateDto categoryDto){
            return categoryService.createCategory(categoryDto);
        }
    @DeleteMapping("/delete/{id}")
    @Transactional
    public void deleteCategory(@PathVariable UUID id){
        categoryService.deleteCategory(id);
    }
}
