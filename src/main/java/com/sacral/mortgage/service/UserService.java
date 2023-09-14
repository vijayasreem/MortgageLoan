, indicating the reason for the denial

package com.sacral.mortgage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.mortgage.model.User;
import com.sacral.mortgage.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User findByVerification(String identification, String proofOfIncome, String creditHistory,
			String employmentDetails) {
		return userRepository.findByVerification(identification, proofOfIncome, creditHistory, employmentDetails);
	}

	public List<User> findByEligibility(double annualIncome, int creditScore) {
		return userRepository.findByEligibility(annualIncome, creditScore);
	}

	public List<User> findByPaymentApproval(double paymentAmount) {
		return userRepository.findByPaymentApproval(paymentAmount);
	}

	public User findByVendorConfirmation(String vendorName, double paymentAmount) {
		return userRepository.findByVendorConfirmation(vendorName, paymentAmount);
	}

	public List<User> findByVehicleAssessment(double vehicleAssessmentValue) {
		return userRepository.findByVehicleAssessment(vehicleAssessmentValue);
	}

	public void greetUser() {
		System.out.println("Welcome to the Document Verification App!");
	}

	public String verifyIdentityAndAddress(String input) {
		if (input.equals("yes")) {
			return "Identity and address are verified. You are eligible for banking services.";
		} else {
			return "Document verification is incomplete. You are not eligible for banking services.";
		}
	}

	public String validateCreditEvaluation(double annualIncome, int creditScore) {
		if (annualIncome >= 30000 && creditScore >= 700) {
			return "Congratulations! You are eligible for a credit score with a high limit.";
		} else if (annualIncome >= 20000 && creditScore >= 600) {
			return "Congratulations! You are eligible for a credit score with a moderate limit.";
		} else {
			return "Credit evaluation is not successful.";
		}
	}

	public String paymentApproval(double paymentAmount, double vehicleAssessmentValue) {
		if (paymentAmount <= 1000.0) {
			return "Payment approved.";
		} else if (paymentAmount <= vehicleAssessmentValue) {
			return "Vehicle assessment passed. Disbursed amount approved.";
		} else {
			return "Vehicle assessment failed. Loan amount cannot exceed the vehicle value.";
		}
	}

	public String vendorConfirmation(String vendorName, double paymentAmount) {
		if (vendorName.equals("") || paymentAmount == 0.0) {
			return "Vendor information verification failed.";
		} else {
			return "Funds availability confirmed. Payment approved. Vendor: " + vendorName + ". Payment Amount: " + paymentAmount;
		}
	}

	public void closeApplication() {
		System.out.println("Application closed successfully.");
	}

	public String insufficientFunds(double paymentAmount) {
		return "Insufficient funds for disbursement. Payment of " + paymentAmount + " cannot be approved.";
	}

}