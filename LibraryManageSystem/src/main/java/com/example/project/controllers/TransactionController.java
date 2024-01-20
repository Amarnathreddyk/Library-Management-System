package com.example.project.controllers;

import com.example.project.dtos.IntiateTransactionRequest;
import com.example.project.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TransactionController {
    //  ISSUE A  BOOK
    //  RETURN A BOOK
    //  YOU HAVE TO PAY THE FINE LATE SUBMISSION
    //  EXTENDING THE TIMELINE OF A BOOK

//    @Value("students.max.books.allowed")
//    private int booklimit;

    @Autowired
    TransactionService transactionService;


    @PostMapping("/transaction")
    public String initiateTransaction(@RequestBody @Valid IntiateTransactionRequest txnRqst) throws Exception {
        return transactionService.handleTxn(txnRqst);
    }
}
