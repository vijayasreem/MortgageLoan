package com.sacral.mortgage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identification;
    private String proofOfIncome;
    private String creditHistory;
    private String employmentDetails;
    private Double loanAmount;
    private Double interestRate;
    private Double repaymentPeriod;
    private Double assessmentValue;
    private Double approvedLoanAmount;
    private String vendorName;
    private Double paymentAmount;
    private Double annualIncome;
    private Integer creditScore;
    private Boolean paymentApproved;
    private Boolean paymentProcessIncomplete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getProofOfIncome() {
        return proofOfIncome;
    }

    public void setProofOfIncome(String proofOfIncome) {
        this.proofOfIncome = proofOfIncome;
    }

    public String getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(String creditHistory) {
        this.creditHistory = creditHistory;
    }

    public String getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(String employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getRepaymentPeriod() {
        return repaymentPeriod;
    }

    public void setRepaymentPeriod(Double repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public Double getAssessmentValue() {
        return assessmentValue;
    }

    public void setAssessmentValue(Double assessmentValue) {
        this.assessmentValue = assessmentValue;
    }

    public Double getApprovedLoanAmount() {
        return approvedLoanAmount;
    }

    public void setApprovedLoanAmount(Double approvedLoanAmount) {
        this.approvedLoanAmount = approvedLoanAmount;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Boolean isPaymentApproved() {
        return paymentApproved;
    }

    public void setPaymentApproved(Boolean paymentApproved) {
        this.paymentApproved = paymentApproved;
    }

    public Boolean isPaymentProcessIncomplete() {
        return paymentProcessIncomplete;
    }

    public void setPaymentProcessIncomplete(Boolean paymentProcessIncomplete) {
        this.paymentProcessIncomplete = paymentProcessIncomplete;
    }
}