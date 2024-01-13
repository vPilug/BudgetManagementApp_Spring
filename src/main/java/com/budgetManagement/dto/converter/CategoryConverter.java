package com.budgetManagement.dto.converter;

import com.budgetManagement.dao.entity.Category;
import com.budgetManagement.dto.CategoryDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.StreamSupport;

public class CategoryConverter {
    public static CategoryDto categoryToCategoryDto(Category category){
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
    public static List<CategoryDto> categoryListToCategoryListDto(Iterable<Category> categories){
        return StreamSupport.stream(categories.spliterator(),false)
                .map(CategoryConverter::categoryToCategoryDto)
                .toList();
    }
}
