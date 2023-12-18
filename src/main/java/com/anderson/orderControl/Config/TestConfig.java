package com.anderson.orderControl.Config;

import com.anderson.orderControl.entities.User;
import com.anderson.orderControl.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Anderson", "anderson@gmail.com", "9999999", "123456");
        User u2 = new User(null, "Alexandre", "alexandre@gmail.com", "9888888", "678901");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
