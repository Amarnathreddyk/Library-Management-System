package com.example.project.repositories;

import com.example.project.models.Book;
import com.example.project.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByGenre(Genre genre);
    List<Book> findByName(String name);
}
