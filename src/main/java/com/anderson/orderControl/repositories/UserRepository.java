package com.anderson.orderControl.repositories;

import com.anderson.orderControl.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
