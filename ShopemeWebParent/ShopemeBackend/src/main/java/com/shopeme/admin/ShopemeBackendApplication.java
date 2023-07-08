package com.shopeme.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan({"com.shopeme.common.entity", "com.shopeme.admin.repository"})
public class ShopemeBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopemeBackendApplication.class, args);
    }

}
