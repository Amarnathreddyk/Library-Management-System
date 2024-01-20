package com.example.project.dtos;

import com.example.project.models.TransactionType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IntiateTransactionRequest {

    private Integer adminId;
    private Integer studentId;

    private Integer bookId;

    private TransactionType transactionType;

}
