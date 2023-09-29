package com.sacral.mortgage.controller;

import com.sacral.mortgage.model.Loan;
import com.sacral.mortgage.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/prequalify")
    public Loan preQualifyLoan(@RequestParam String identification, @RequestParam double proofOfIncome,
                               @RequestParam String creditHistory, @RequestParam String employmentDetails) {
        return loanService.preQualifyLoan(identification, proofOfIncome, creditHistory, employmentDetails);
    }

    @PutMapping("/approve/{loanId}")
    public Loan approveLoan(@PathVariable Long loanId) {
        return loanService.approveLoan(loanId);
    }

    @PutMapping("/disburse/{loanId}")
    public Loan disburseLoan(@PathVariable Long loanId) {
        return loanService.disburseLoan(loanId);
    }

    // Additional methods for loan approval and disbursement
}