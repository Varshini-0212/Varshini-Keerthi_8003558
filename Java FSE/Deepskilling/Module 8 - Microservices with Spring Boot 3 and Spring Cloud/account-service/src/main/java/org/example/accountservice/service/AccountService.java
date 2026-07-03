package org.example.accountservice.service;

import org.example.accountservice.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account getAccount(String accountNumber) {

        return new Account(
                accountNumber,
                "Savings",
                25000.00
        );
    }
}