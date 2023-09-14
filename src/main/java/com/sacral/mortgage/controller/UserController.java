package com.sacral.mortgage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sacral.mortgage.model.User;
import com.sacral.mortgage.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	public User findByVerification(String identification, String proofOfIncome, String creditHistory,
			String employmentDetails) {
		return userService.findByVerification(identification, proofOfIncome, creditHistory, employmentDetails);
	}

	public List<User> findByEligibility(double annualIncome, int creditScore) {
		return userService.findByEligibility(annualIncome, creditScore);
	}

	public List<User> findByPaymentApproval(double paymentAmount) {
		return userService.findByPaymentApproval(paymentAmount);
	}

	public User findByVendorConfirmation(String vendorName, double paymentAmount) {
		return userService.findByVendorConfirmation(vendorName, paymentAmount);
	}

	public List<User> findByVehicleAssessment(double vehicleAssessmentValue) {
		return userService.findByVehicleAssessment(vehicleAssessmentValue);
	}

	public void greetUser() {
		userService.greetUser();
	}

	public String verifyIdentityAndAddress(String input) {
		return userService.verifyIdentityAndAddress(input);
	}

	public String validateCreditEvaluation(double annualIncome, int creditScore) {
		return userService.validateCreditEvaluation(annualIncome, creditScore);
	}

	public String paymentApproval(double paymentAmount, double vehicleAssessmentValue) {
		return userService.paymentApproval(paymentAmount, vehicleAssessmentValue);
	}

	public String vendorConfirmation(String vendorName, double paymentAmount) {
		return userService.vendorConfirmation(vendorName, paymentAmount);
	}

	public void closeApplication() {
		userService.closeApplication();
	}

	public String insufficientFunds(double paymentAmount) {
		return userService.insufficientFunds(paymentAmount);
	}
}