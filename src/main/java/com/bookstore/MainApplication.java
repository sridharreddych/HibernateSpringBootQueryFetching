package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.queries();
        };
    }
}

/*
 * 
 * Query Fetching

Description: This application is an example of how to write a query via JpaRepository, EntityManager and Session.

Key points:

for JpaRepository use @Query or Spring Data Query Creation
for EntityManager and Session use the createQuery() method
 * 
 * 
 */
