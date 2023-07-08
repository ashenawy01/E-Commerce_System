package com.shopeme.admin.repository;

import com.shopeme.common.entity.Role;
import com.shopeme.common.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // To connect to the real database
@Rollback(value = false) // To commit changes
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void createUser() {
        User user = new User(0,"aa@aa.aa", "test123", "Abdelrhman", "Ali", "test123", true, null);
        User savedUser = userRepository.save(user);

        assertEquals(1, savedUser.getId());
    }
}