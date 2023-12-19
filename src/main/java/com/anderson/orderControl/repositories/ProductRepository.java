package com.anderson.orderControl.repositories;

import com.anderson.orderControl.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
