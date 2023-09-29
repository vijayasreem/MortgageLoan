package com.sacral.mortgage.model;

import javax.persistence.*;

@Entity
@Table(name = "loan")
public class Loan {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;
    
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;
    
    @Column(name = "loan_amount_requested")
    private double loanAmountRequested;
    
    @Column(name = "vehicle_value")
    private double vehicleValue;
    
    // Getters and Setters
    
    public Long getLoanId() {
        return loanId;
    }
    
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public double getLoanAmountRequested() {
        return loanAmountRequested;
    }
    
    public void setLoanAmountRequested(double loanAmountRequested) {
        this.loanAmountRequested = loanAmountRequested;
    }
    
    public double getVehicleValue() {
        return vehicleValue;
    }
    
    public void setVehicleValue(double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }
}