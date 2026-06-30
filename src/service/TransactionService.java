package service;

import model.BankAccount;
import model.Transaction;
import exception.InvalidAmountException;
import exception.InsufficientBalanceException;
import utils.Constants;

/**
 * Service for transaction processing
 * Handles deposit, withdrawal, and transfer operations
 */
public class TransactionService {
    private int transactionCounter = 0;
    
    /**
     * Process deposit transaction
     */
    public void processDeposit(BankAccount account, double amount)
            throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        
        account.deposit(amount);
        Transaction transaction = new Transaction(
                generateTransactionId(),
                account.getAccountNumber(),
                Constants.TRANSACTION_TYPE_DEPOSIT,
                amount,
                "Deposit to " + account.getAccountNumber()
        );
        transaction.setBalanceAfter(account.getBalance());
        account.addTransaction(transaction);
    }
    
    /**
     * Process withdrawal transaction
     */
    public void processWithdraw(BankAccount account, double amount)
            throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }
        
        if (amount > account.getBalance()) {
            throw new InsufficientBalanceException("Insufficient balance. Available: " + account.getBalance());
        }
        
        account.withdraw(amount);
        Transaction transaction = new Transaction(
                generateTransactionId(),
                account.getAccountNumber(),
                Constants.TRANSACTION_TYPE_WITHDRAWAL,
                amount,
                "Withdrawal from " + account.getAccountNumber()
        );
        transaction.setBalanceAfter(account.getBalance());
        account.addTransaction(transaction);
    }
    
    /**
     * Process transfer transaction
     */
    public void processTransfer(BankAccount fromAccount, BankAccount toAccount, double amount)
            throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Transfer amount must be positive");
        }
        
        if (amount > fromAccount.getBalance()) {
            throw new InsufficientBalanceException("Insufficient balance for transfer");
        }
        
        // Process withdrawal from source
        fromAccount.withdraw(amount);
        Transaction fromTransaction = new Transaction(
                generateTransactionId(),
                fromAccount.getAccountNumber(),
                Constants.TRANSACTION_TYPE_TRANSFER,
                amount,
                "Transfer to " + toAccount.getAccountNumber()
        );
        fromTransaction.setBalanceAfter(fromAccount.getBalance());
        fromAccount.addTransaction(fromTransaction);
        
        // Process deposit to destination
        toAccount.deposit(amount);
        Transaction toTransaction = new Transaction(
                generateTransactionId(),
                toAccount.getAccountNumber(),
                Constants.TRANSACTION_TYPE_TRANSFER,
                amount,
                "Transfer from " + fromAccount.getAccountNumber()
        );
        toTransaction.setBalanceAfter(toAccount.getBalance());
        toAccount.addTransaction(toTransaction);
    }
    
    /**
     * Generate unique transaction ID
     */
    private String generateTransactionId() {
        return "TXN" + System.currentTimeMillis() + (++transactionCounter);
    }
}
