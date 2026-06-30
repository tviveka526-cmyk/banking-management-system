package service;

import model.BankAccount;
import exception.InvalidAmountException;

/**
 * Service for account-specific operations
 * Handles account balance, status, and account-related validations
 */
public class AccountService {
    
    /**
     * Check if account is active
     */
    public boolean isAccountActive(BankAccount account) {
        return account != null && account.isActive();
    }
    
    /**
     * Get account balance
     */
    public double getAccountBalance(BankAccount account) throws InvalidAmountException {
        if (account == null) {
            throw new InvalidAmountException("Account is null");
        }
        return account.getBalance();
    }
    
    /**
     * Set account balance
     */
    public void setAccountBalance(BankAccount account, double newBalance) 
            throws InvalidAmountException {
        if (newBalance < 0) {
            throw new InvalidAmountException("Balance cannot be negative");
        }
        account.setBalance(newBalance);
    }
    
    /**
     * Deactivate account
     */
    public void deactivateAccount(BankAccount account) {
        account.setActive(false);
    }
    
    /**
     * Activate account
     */
    public void activateAccount(BankAccount account) {
        account.setActive(true);
    }
}
