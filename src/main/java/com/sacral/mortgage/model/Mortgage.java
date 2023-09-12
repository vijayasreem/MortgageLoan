package com.sacral.mortgage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mortgage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String welcomeMessage;
    private String identityVerification;
    private double annualIncome;
    private int creditScore;
    private double paymentAmount;
    private String vendorInfoVerified;
    private String fundsAvailable;
    private String paymentApproved;
    private String thankYouMessage;

    public Mortgage() {

    }

    public Mortgage(String welcomeMessage, String identityVerification, double annualIncome, int creditScore, double paymentAmount, String vendorInfoVerified, String fundsAvailable, String paymentApproved, String thankYouMessage) {
        this.welcomeMessage = welcomeMessage;
        this.identityVerification = identityVerification;
        this.annualIncome = annualIncome;
        this.creditScore = creditScore;
        this.paymentAmount = paymentAmount;
        this.vendorInfoVerified = vendorInfoVerified;
        this.fundsAvailable = fundsAvailable;
        this.paymentApproved = paymentApproved;
        this.thankYouMessage = thankYouMessage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getIdentityVerification() {
        return identityVerification;
    }

    public void setIdentityVerification(String identityVerification) {
        this.identityVerification = identityVerification;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getVendorInfoVerified() {
        return vendorInfoVerified;
    }

    public void setVendorInfoVerified(String vendorInfoVerified) {
        this.vendorInfoVerified = vendorInfoVerified;
    }

    public String getFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(String fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    public String getPaymentApproved() {
        return paymentApproved;
    }

    public void setPaymentApproved(String paymentApproved) {
        this.paymentApproved = paymentApproved;
    }

    public String getThankYouMessage() {
        return thankYouMessage;
    }

    public void setThankYouMessage(String thankYouMessage) {
        this.thankYouMessage = thankYouMessage;
    }
}