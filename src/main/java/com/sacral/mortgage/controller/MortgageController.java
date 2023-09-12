package com.sacral.mortgage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sacral.mortgage.model.User;
import com.sacral.mortgage.service.MortgageService;

public class MortgageController {
    @Autowired
    private MortgageService mortgageService;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        return mortgageService.findUserById(id);
    }

    @GetMapping("/user/identification")
    public User getUserByIdentification(@RequestParam String identification) {
        return mortgageService.findUserByIdentification(identification);
    }

    @GetMapping("/user/proof-of-income")
    public User getUserByProofOfIncome(@RequestParam String proofOfIncome) {
        return mortgageService.findUserByProofOfIncome(proofOfIncome);
    }

    @GetMapping("/user/credit-history")
    public User getUserByCreditHistory(@RequestParam String creditHistory) {
        return mortgageService.findUserByCreditHistory(creditHistory);
    }

    @GetMapping("/user/employment-details")
    public User getUserByEmploymentDetails(@RequestParam String employmentDetails) {
        return mortgageService.findUserByEmploymentDetails(employmentDetails);
    }

    @GetMapping("/user/loan-amount")
    public User getUserByLoanAmount(@RequestParam Double loanAmount) {
        return mortgageService.findUserByLoanAmount(loanAmount);
    }

    @GetMapping("/user/interest-rate")
    public User getUserByInterestRate(@RequestParam Double interestRate) {
        return mortgageService.findUserByInterestRate(interestRate);
    }

    @GetMapping("/user/repayment-period")
    public User getUserByRepaymentPeriod(@RequestParam Double repaymentPeriod) {
        return mortgageService.findUserByRepaymentPeriod(repaymentPeriod);
    }

    @GetMapping("/user/assessment-value")
    public User getUserByAssessmentValue(@RequestParam Double assessmentValue) {
        return mortgageService.findUserByAssessmentValue(assessmentValue);
    }

    @GetMapping("/user/approved-loan-amount")
    public User getUserByApprovedLoanAmount(@RequestParam Double approvedLoanAmount) {
        return mortgageService.findUserByApprovedLoanAmount(approvedLoanAmount);
    }

    @GetMapping("/user/vendor-name")
    public User getUserByVendorName(@RequestParam String vendorName) {
        return mortgageService.findUserByVendorName(vendorName);
    }

    @GetMapping("/user/payment-amount")
    public User getUserByPaymentAmount(@RequestParam Double paymentAmount) {
        return mortgageService.findUserByPaymentAmount(paymentAmount);
    }

    @GetMapping("/user/annual-income")
    public User getUserByAnnualIncome(@RequestParam Double annualIncome) {
        return mortgageService.findUserByAnnualIncome(annualIncome);
    }

    @GetMapping("/user/credit-score")
    public User getUserByCreditScore(@RequestParam Integer creditScore) {
        return mortgageService.findUserByCreditScore(creditScore);
    }

    @GetMapping("/user/payment-approved")
    public User getUserByPaymentApproved(@RequestParam Boolean paymentApproved) {
        return mortgageService.findUserByPaymentApproved(paymentApproved);
    }

    @PostMapping("/document-verification")
    public void openDocumentVerificationApp() {
        mortgageService.openDocumentVerificationApp();
    }