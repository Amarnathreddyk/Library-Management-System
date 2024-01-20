package com.example.project.services;

import com.example.project.models.Admin;
import com.example.project.repositories.AdminRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    AdminRespository adminRespository;

    public Admin find(Integer id){
        Optional<Admin> admin = adminRespository.findById(id);
        if(admin.isPresent()){
            return admin.get();
        }
        // THROW SOME EXCEPTIONS
        return null;
    }
}
