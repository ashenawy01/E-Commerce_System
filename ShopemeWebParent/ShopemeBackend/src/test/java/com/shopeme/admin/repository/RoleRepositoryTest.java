package com.shopeme.admin.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.shopeme.common.entity.Role;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // To connect to the real database
@Rollback(value = false) // To commit changes
class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;
    @Test
    public void CreateRoleTest(){
        Role role = new Role(0, "Admin", "Manage Everything");
        Role savedRole = roleRepository.save(role);
        assertEquals(1, savedRole.getId());
    }
}