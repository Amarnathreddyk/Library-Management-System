package com.example.project.services;

import com.example.project.models.Author;
import com.example.project.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {


    @Autowired
    AuthorRepository authorRepository;
    public Author checkOrCreate(Author author){
        Author retrivedAuthor = authorRepository.findByEmail(author.getEmail());
        if(retrivedAuthor == null){
            // you dont have this author
            authorRepository.save(author);
            return author;
        }
        return retrivedAuthor;
    }
}
