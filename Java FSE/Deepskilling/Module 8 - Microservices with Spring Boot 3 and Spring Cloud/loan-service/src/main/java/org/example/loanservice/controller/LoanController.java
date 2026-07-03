package org.example.loanservice.controller;

import org.example.loanservice.model.Loan;
import org.example.loanservice.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping("/{loanNumber}")
    public Loan getLoan(@PathVariable String loanNumber) {
        return loanService.getLoan(loanNumber);
    }
}