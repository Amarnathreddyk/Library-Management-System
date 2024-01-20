package com.example.project.repositories;

import com.example.project.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
    // FIND BY EMAIL


    public Author findByEmail(String email);
}
