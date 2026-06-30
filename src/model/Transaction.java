package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents a single transaction
 * Records transaction details: type, amount, date, description
 */
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String transactionId;
    private String accountNumber;
    private String transactionType;  // DEPOSIT, WITHDRAWAL, TRANSFER
    private double amount;
    private LocalDateTime transactionDate;
    private double balanceAfter;
    private String description;
    private boolean isSuccessful;
    
    // Constructor
    public Transaction(String transactionId, String accountNumber, String transactionType,
                      double amount, String description) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = LocalDateTime.now();
        this.description = description;
        this.isSuccessful = true;
    }
    
    // Getters
    public String getTransactionId() {
        return transactionId;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getTransactionType() {
        return transactionType;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
    
    public double getBalanceAfter() {
        return balanceAfter;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean isSuccessful() {
        return isSuccessful;
    }
    
    // Setters
    public void setBalanceAfter(double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }
    
    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }
    
    // Methods
    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return transactionDate.format(formatter);
    }
    
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", balanceAfter=" + balanceAfter +
                ", isSuccessful=" + isSuccessful +
                '}';
    }
}
