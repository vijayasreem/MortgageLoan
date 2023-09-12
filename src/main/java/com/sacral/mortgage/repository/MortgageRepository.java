, asking for additional information to complete the payment processA method must be added to close the Document Verification App and thank the user for using the service

package com.sacral.mortgage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MortgageRepository extends JpaRepository<Mortgage, Long> {

	// Method to open the Document Verification App and greet the user with a welcoming message
	@Query("SELECT m FROM Mortgage m WHERE m.welcomeMessage IS NOT NULL")
	Mortgage openDocumentVerificationApp();
	
	// Method to verify identity and address as "yes" or "no" using the provided input
	@Query("SELECT m FROM Mortgage m WHERE m.identityVerification = :input")
	Mortgage verifyIdentityAddress(String input);
	
	// Method to validate credit evaluation
	@Query("SELECT m FROM Mortgage m WHERE m.annualIncome >= :income AND m.creditScore >= :creditScore")
	Mortgage validateCreditEvaluation(double income, int creditScore);
	
	// Method to determine whether the payment is approved based on the payment amount
	@Query("SELECT m FROM Mortgage m WHERE m.paymentAmount <= :vehicleValue")
	Mortgage paymentApproval(double vehicleValue);
	
	// Method to verify the vendor information
	@Query("SELECT m FROM Mortgage m WHERE m.vendorInfoVerified IS NOT NULL")
	Mortgage verifyVendorInformation();
	
	// Method to confirm funds availability
	@Query("SELECT m FROM Mortgage m WHERE m.fundsAvailable IS NOT NULL")
	Mortgage confirmFundsAvailability();
	
	// Method to grant payment approval
	@Query("SELECT m FROM Mortgage m WHERE m.paymentApproved IS NOT NULL")
	Mortgage grantPaymentApproval();
	
	// Method to close the Document Verification App and thank the user for using the service
	@Query("SELECT m FROM Mortgage m WHERE m.thankYouMessage IS NOT NULL")
	Mortgage closeDocumentVerificationApp();
	
}