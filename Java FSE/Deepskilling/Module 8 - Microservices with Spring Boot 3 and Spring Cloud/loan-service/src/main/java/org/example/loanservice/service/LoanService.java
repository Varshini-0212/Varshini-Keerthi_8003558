package org.example.loanservice.service;

import org.example.loanservice.model.Loan;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public Loan getLoan(String loanNumber) {

        return new Loan(
                loanNumber,
                "Home Loan",
                500000.0
        );
    }
}