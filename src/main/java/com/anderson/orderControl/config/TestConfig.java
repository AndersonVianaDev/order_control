package com.anderson.orderControl.config;

import com.anderson.orderControl.entities.Order;
import com.anderson.orderControl.entities.User;
import com.anderson.orderControl.entities.enums.OrderStatus;
import com.anderson.orderControl.repositories.OrderRepository;
import com.anderson.orderControl.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Anderson", "anderson@gmail.com", "9999999", "123456");
        User u2 = new User(null, "Alexandre", "alexandre@gmail.com", "9888888", "678901");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
