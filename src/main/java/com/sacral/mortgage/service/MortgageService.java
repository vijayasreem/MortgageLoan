package com.sacral.mortgage.service;

import org.springframework.stereotype.Service;

import com.sacral.mortgage.model.User;
import com.sacral.mortgage.repository.UserRepository;

@Service
public class MortgageService {
    private final UserRepository userRepository;

    public MortgageService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public User findUserByIdentification(String identification) {
        return userRepository.findUserByIdentification(identification);
    }

    public User findUserByProofOfIncome(String proofOfIncome) {
        return userRepository.findUserByProofOfIncome(proofOfIncome);
    }

    public User findUserByCreditHistory(String creditHistory) {
        return userRepository.findUserByCreditHistory(creditHistory);
    }

    public User findUserByEmploymentDetails(String employmentDetails) {
        return userRepository.findUserByEmploymentDetails(employmentDetails);
    }

    public User findUserByLoanAmount(Double loanAmount) {
        return userRepository.findUserByLoanAmount(loanAmount);
    }

    public User findUserByInterestRate(Double interestRate) {
        return userRepository.findUserByInterestRate(interestRate);
    }

    public User findUserByRepaymentPeriod(Double repaymentPeriod) {
        return userRepository.findUserByRepaymentPeriod(repaymentPeriod);
    }

    public User findUserByAssessmentValue(Double assessmentValue) {
        return userRepository.findUserByAssessmentValue(assessmentValue);
    }

    public User findUserByApprovedLoanAmount(Double approvedLoanAmount) {
        return userRepository.findUserByApprovedLoanAmount(approvedLoanAmount);
    }

    public User findUserByVendorName(String vendorName) {
        return userRepository.findUserByVendorName(vendorName);
    }

    public User findUserByPaymentAmount(Double paymentAmount) {
        return userRepository.findUserByPaymentAmount(paymentAmount);
    }

    public User findUserByAnnualIncome(Double annualIncome) {
        return userRepository.findUserByAnnualIncome(annualIncome);
    }

    public User findUserByCreditScore(Integer creditScore) {
        return userRepository.findUserByCreditScore(creditScore);
    }

    public User findUserByPaymentApproved(Boolean paymentApproved) {
        return userRepository.findUserByPaymentApproved(paymentApproved);
    }

    public void openDocumentVerificationApp() {
        System.out.println("Opening document verification app...");
        System.out.println("Welcome to the document verification app!");
    }

    public String verifyIdentityAndAddress(String input) {
        if (input.equalsIgnoreCase("yes")) {
            return "Identity and address verified. You are eligible for banking services.";
        } else {
            return "Document verification is incomplete and not eligible for banking services.";
        }
    }

    public String validateCreditEvaluation(Double annualIncome, Integer creditScore) {
        if (annualIncome >= 30000 && creditScore >= 700) {
            return "Congrats! You are eligible for a credit score with a high limit.";
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            return "You are eligible for a credit score with a moderate limit.";
        } else {
            return "Sorry, you are not eligible for a credit score.";
        }
    }

    public String determinePaymentApproval(Double paymentAmount, Double assessmentValue) {
        if (paymentAmount <= 1000.0) {
            return "Payment automatically approved.";
        } else if (paymentAmount <= assessmentValue) {
            return "Vehicle assessment passed and the disbursed amount.";
        } else {
            return "Vehicle assessment failed and the loan amount cannot exceed the vehicle value.";
        }
    }

    public String verifyVendorInformation(