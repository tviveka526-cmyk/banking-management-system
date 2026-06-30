package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Represents a bank account
 * Stores account details, balance, and transaction history
 */
public class BankAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String accountNumber;
    private String accountType;  // Savings, Checking, etc.
    private double balance;
    private String customerId;
    private ArrayList<Transaction> transactionHistory;
    private boolean isActive;
    
    // Constructor
    public BankAccount(String accountNumber, String accountType, String customerId) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customerId = customerId;
        this.balance = 0.0;
        this.isActive = true;
        this.transactionHistory = new ArrayList<>();
    }
    
    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    // Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setActive(boolean active) {
        isActive = active;
    }
    
    // Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public void addTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }
    
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", customerId='" + customerId + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
