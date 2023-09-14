, indicating the reason for the denial

package com.sacral.mortgage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sacral.mortgage.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.identification = ?1 AND u.proofOfIncome = ?2 AND u.creditHistory = ?3 AND u.employmentDetails = ?4")
	User findByVerification(String identification, String proofOfIncome, String creditHistory, String employmentDetails);

	@Query("SELECT u FROM User u WHERE u.annualIncome >= ?1 AND u.creditScore >= ?2")
	List<User> findByEligibility(double annualIncome, int creditScore);

	@Query("SELECT u FROM User u WHERE u.paymentAmount <= ?1")
	List<User> findByPaymentApproval(double paymentAmount);

	@Query("SELECT u FROM User u WHERE u.vendorName = ?1 AND u.paymentAmount = ?2")
	User findByVendorConfirmation(String vendorName, double paymentAmount);

	@Query("SELECT u FROM User u WHERE u.vehicleAssessmentValue >= ?1")
	List<User> findByVehicleAssessment(double vehicleAssessmentValue);

}