
package com.sacral.mortgage.repository;

import com.sacral.mortgage.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

    @Query("SELECT l FROM Loan l WHERE l.customer.identification = :identification " +
            "AND l.customer.proofOfIncome = :proofOfIncome " +
            "AND l.customer.creditHistory = :creditHistory " +
            "AND l.customer.employmentDetails = :employmentDetails " +
            "AND l.vehicleValue >= l.loanAmountRequested")
    Loan preQualifyLoan(String identification, double proofOfIncome, String creditHistory, String employmentDetails);

    // Additional methods for loan approval and disbursement

    Loan findByLoanIdAndCustomerAcceptedIsTrue(Long loanId);

    Loan findByLoanIdAndCustomerAcceptedIsFalse(Long loanId);
}
