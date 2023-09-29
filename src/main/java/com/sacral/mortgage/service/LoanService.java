package com.sacral.mortgage.service;

import com.sacral.mortgage.model.Loan;
import com.sacral.mortgage.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Loan preQualifyLoan(String identification, double proofOfIncome, String creditHistory, String employmentDetails) {
        return loanRepository.preQualifyLoan(identification, proofOfIncome, creditHistory, employmentDetails);
    }

    public Loan approveLoan(Long loanId) {
        Loan loan = loanRepository.findByLoanIdAndCustomerAcceptedIsFalse(loanId);
        loan.setCustomerAccepted(true);
        return loanRepository.save(loan);
    }

    public Loan disburseLoan(Long loanId) {
        Loan loan = loanRepository.findByLoanIdAndCustomerAcceptedIsTrue(loanId);
        loan.setDisbursed(true);
        return loanRepository.save(loan);
    }

    // Additional methods for loan approval and disbursement
}