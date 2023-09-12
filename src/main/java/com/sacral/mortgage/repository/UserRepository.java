, indicating the payment process is incomplete and not eligible for disbursement

package com.sacral.mortgage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sacral.mortgage.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.id = ?1")
    User findUserById(Long id);

    @Query("SELECT u FROM User u WHERE u.identification = ?1")
    User findUserByIdentification(String identification);

    @Query("SELECT u FROM User u WHERE u.proofOfIncome = ?1")
    User findUserByProofOfIncome(String proofOfIncome);

    @Query("SELECT u FROM User u WHERE u.creditHistory = ?1")
    User findUserByCreditHistory(String creditHistory);

    @Query("SELECT u FROM User u WHERE u.employmentDetails = ?1")
    User findUserByEmploymentDetails(String employmentDetails);

    @Query("SELECT u FROM User u WHERE u.loanAmount = ?1")
    User findUserByLoanAmount(Double loanAmount);

    @Query("SELECT u FROM User u WHERE u.interestRate = ?1")
    User findUserByInterestRate(Double interestRate);

    @Query("SELECT u FROM User u WHERE u.repaymentPeriod = ?1")
    User findUserByRepaymentPeriod(Double repaymentPeriod);

    @Query("SELECT u FROM User u WHERE u.assessmentValue = ?1")
    User findUserByAssessmentValue(Double assessmentValue);

    @Query("SELECT u FROM User u WHERE u.approvedLoanAmount = ?1")
    User findUserByApprovedLoanAmount(Double approvedLoanAmount);

    @Query("SELECT u FROM User u WHERE u.vendorName = ?1")
    User findUserByVendorName(String vendorName);

    @Query("SELECT u FROM User u WHERE u.paymentAmount = ?1")
    User findUserByPaymentAmount(Double paymentAmount);

    @Query("SELECT u FROM User u WHERE u.annualIncome = ?1")
    User findUserByAnnualIncome(Double annualIncome);

    @Query("SELECT u FROM User u WHERE u.creditScore = ?1")
    User findUserByCreditScore(Integer creditScore);

    @Query("SELECT u FROM User u WHERE u.paymentApproved = ?1")
    User findUserByPaymentApproved(Boolean paymentApproved);

}