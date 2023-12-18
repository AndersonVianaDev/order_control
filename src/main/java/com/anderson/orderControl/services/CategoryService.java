package com.anderson.orderControl.services;

import com.anderson.orderControl.entities.Category;
import com.anderson.orderControl.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepositor;

    public List<Category> findAll() {
        return categoryRepositor.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = categoryRepositor.findById(id);
        return obj.get();
    }
}
