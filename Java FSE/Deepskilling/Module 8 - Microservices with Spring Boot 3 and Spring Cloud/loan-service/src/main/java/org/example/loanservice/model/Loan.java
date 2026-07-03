package org.example.loanservice.model;

public class Loan {

    private String loanNumber;
    private String loanType;
    private double amount;

    public Loan() {
    }

    public Loan(String loanNumber, String loanType, double amount) {
        this.loanNumber = loanNumber;
        this.loanType = loanType;
        this.amount = amount;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}