package com.sacral.mortgage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String identification;
	private String proofOfIncome;
	private String creditHistory;
	private String employmentDetails;
	private double annualIncome;
	private int creditScore;
	private double paymentAmount;
	private String vendorName;
	private double vehicleAssessmentValue;
	private String reasonForDenial;

	public User() {
	}

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

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public double getVehicleAssessmentValue() {
		return vehicleAssessmentValue;
	}

	public void setVehicleAssessmentValue(double vehicleAssessmentValue) {
		this.vehicleAssessmentValue = vehicleAssessmentValue;
	}

	public String getReasonForDenial() {
		return reasonForDenial;
	}

	public void setReasonForDenial(String reasonForDenial) {
		this.reasonForDenial = reasonForDenial;
	}

}

The reason for the denial field in the User model is used to store the reason for the denial of the mortgage application. It is used to track and log reasons for the denial of applications.