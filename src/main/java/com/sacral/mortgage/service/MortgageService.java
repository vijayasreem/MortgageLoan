A method must be added to close the Document Verification App and thank the user for using the service

package com.sacral.mortgage.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sacral.mortgage.repository.MortgageRepository;

@Service
public class MortgageService {
	
	@Autowired
	private MortgageRepository mortgageRepository;
	
	// Method to open the Document Verification App and greet the user with a welcoming message
	public Optional<Mortgage> openDocumentVerificationApp() {
		return mortgageRepository.openDocumentVerificationApp();
	}
	
	// Method to verify identity and address as "yes" or "no" using the provided input
	public Optional<Mortgage> verifyIdentityAddress(String input) {
		return mortgageRepository.verifyIdentityAddress(input);
	}
	
	// Method to validate credit evaluation
	public Optional<Mortgage> validateCreditEvaluation(double income, int creditScore) {
		return mortgageRepository.validateCreditEvaluation(income, creditScore);
	}
	
	// Method to determine whether the payment is approved based on the payment amount
	public Optional<Mortgage> paymentApproval(double vehicleValue) {
		return mortgageRepository.paymentApproval(vehicleValue);
	}
	
	// Method to verify the vendor information
	public Optional<Mortgage> verifyVendorInformation() {
		return mortgageRepository.verifyVendorInformation();
	}
	
	// Method to confirm funds availability
	public Optional<Mortgage> confirmFundsAvailability() {
		return mortgageRepository.confirmFundsAvailability();
	}
	
	// Method to grant payment approval
	public Optional<Mortgage> grantPaymentApproval() {
		return mortgageRepository.grantPaymentApproval();
	}
	
	// Method to close the Document Verification App and thank the user for using the service
	public Optional<Mortgage> closeDocumentVerificationApp() {
		return mortgageRepository.closeDocumentVerificationApp();
	}
	
}