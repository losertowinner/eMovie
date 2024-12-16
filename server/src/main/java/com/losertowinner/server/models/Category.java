package com.losertowinner.server.models;

import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    
}

interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByTitle(String title);
}