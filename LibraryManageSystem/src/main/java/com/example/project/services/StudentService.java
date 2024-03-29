package com.example.project.services;


import com.example.project.models.Student;
import com.example.project.repositories.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRespository studentRespository;

    public void create(Student student){
        studentRespository.save(student);
    }

    public Student find(Integer id){
        Optional<Student> student = studentRespository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        // THROW SOME EXCEPTIONS
        return null;
    }
}
