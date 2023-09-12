A method must be added to close the Document Verification App and thank the user for using the service

package com.sacral.mortgage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.mortgage.model.Mortgage;
import com.sacral.mortgage.service.MortgageService;

@RestController
public class MortgageController {

	@Autowired
	private MortgageService mortgageService;
	
	// Method to open the Document Verification App and greet the user with a welcoming message
    @GetMapping("/openDocumentVerificationApp")
    public Optional<Mortgage> openDocumentVerificationApp() {
    	return mortgageService.openDocumentVerificationApp();
    }
    
    // Method to verify identity and address as "yes" or "no" using the provided input
    @GetMapping("/verifyIdentityAddress")
    public Optional<Mortgage> verifyIdentityAddress(@RequestParam String input) {
    	return mortgageService.verifyIdentityAddress(input);
    }
    
    // Method to validate credit evaluation
    @GetMapping("/validateCreditEvaluation")
    public Optional<Mortgage> validateCreditEvaluation(@RequestParam double income, @RequestParam int creditScore) {
    	return mortgageService.validateCreditEvaluation(income, creditScore);
    }
    
    // Method to determine whether the payment is approved based on the payment amount
    @GetMapping("/paymentApproval")
    public Optional<Mortgage> paymentApproval(@RequestParam double vehicleValue) {
    	return mortgageService.paymentApproval(vehicleValue);
    }
    
    // Method to verify the vendor information
    @GetMapping("/verifyVendorInformation")
    public Optional<Mortgage> verifyVendorInformation() {
    	return mortgageService.verifyVendorInformation();
    }
    
    // Method to confirm funds availability
    @GetMapping("/confirmFundsAvailability")
    public Optional<Mortgage> confirmFundsAvailability() {
    	return mortgageService.confirmFundsAvailability();
    }
    
    // Method to grant payment approval
    @GetMapping("/grantPaymentApproval")
    public Optional<Mortgage> grantPaymentApproval() {
    	return mortgageService.grantPaymentApproval();
    }
    
    // Method to close the Document Verification App and thank the user for using the service
    @GetMapping("/closeDocumentVerificationApp")
    public Optional<Mortgage> closeDocumentVerificationApp() {
    	return mortgageService.closeDocumentVerificationApp();
    }
    
}