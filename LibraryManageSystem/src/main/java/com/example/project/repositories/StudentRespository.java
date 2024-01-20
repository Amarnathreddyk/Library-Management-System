package com.example.project.repositories;

import com.example.project.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Integer> {
}
