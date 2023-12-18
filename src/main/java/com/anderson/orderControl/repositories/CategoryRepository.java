package com.anderson.orderControl.repositories;

import com.anderson.orderControl.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
