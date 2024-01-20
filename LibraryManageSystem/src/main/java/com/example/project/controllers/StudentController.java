package com.example.project.controllers;

import com.example.project.dtos.CreateStudentRequest;
import com.example.project.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public void createStudent(@RequestBody @Valid CreateStudentRequest createStudentRequest){
        studentService.create(createStudentRequest.to());
    }
}
