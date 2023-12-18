package com.anderson.orderControl.repositories;

import com.anderson.orderControl.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
