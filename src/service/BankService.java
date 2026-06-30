package service;

import model.BankAccount;
import model.Customer;
import repository.BankRepository;
import exception.*;

import java.util.ArrayList;

/**
 * Business logic for overall bank operations
 * Coordinates between AccountService, TransactionService, and Repository
 */
public class BankService {
    private BankRepository repository;
    private AccountService accountService;
    private TransactionService transactionService;
    
    // Constructor
    public BankService() {
        this.repository = new BankRepository();
        this.accountService = new AccountService();
        this.transactionService = new TransactionService();
    }
    
    // Customer operations
    public void createCustomer(String customerId, String firstName, String lastName,
                               String email, String phoneNumber, String address) 
            throws InvalidAmountException {
        Customer customer = new Customer(customerId, firstName, lastName, email, phoneNumber, address);
        repository.addCustomer(customer);
    }
    
    public Customer getCustomer(String customerId) throws AccountNotFoundException {
        Customer customer = repository.getCustomer(customerId);
        if (customer == null) {
            throw new AccountNotFoundException("Customer not found: " + customerId);
        }
        return customer;
    }
    
    public ArrayList<Customer> getAllCustomers() {
        return repository.getAllCustomers();
    }
    
    // Account operations
    public void createAccount(String accountNumber, String accountType, String customerId)
            throws InvalidAmountException, AccountNotFoundException {
        Customer customer = getCustomer(customerId);
        BankAccount account = new BankAccount(accountNumber, accountType, customerId);
        repository.addAccount(account);
        customer.addAccount(accountNumber);
    }
    
    public BankAccount getAccount(String accountNumber) throws AccountNotFoundException {
        BankAccount account = repository.getAccount(accountNumber);
        if (account == null) {
            throw new AccountNotFoundException("Account not found: " + accountNumber);
        }
        return account;
    }
    
    public ArrayList<BankAccount> getAllAccounts() {
        return repository.getAllAccounts();
    }
    
    public ArrayList<BankAccount> getAccountsByCustomer(String customerId) 
            throws AccountNotFoundException {
        Customer customer = getCustomer(customerId);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        for (String accountNumber : customer.getAccountNumbers()) {
            accounts.add(getAccount(accountNumber));
        }
        return accounts;
    }
    
    // Transaction operations
    public void deposit(String accountNumber, double amount) 
            throws InvalidAmountException, AccountNotFoundException {
        BankAccount account = getAccount(accountNumber);
        transactionService.processDeposit(account, amount);
    }
    
    public void withdraw(String accountNumber, double amount)
            throws InvalidAmountException, InsufficientBalanceException, AccountNotFoundException {
        BankAccount account = getAccount(accountNumber);
        transactionService.processWithdraw(account, amount);
    }
    
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount)
            throws InvalidAmountException, InsufficientBalanceException, AccountNotFoundException {
        BankAccount fromAccount = getAccount(fromAccountNumber);
        BankAccount toAccount = getAccount(toAccountNumber);
        transactionService.processTransfer(fromAccount, toAccount, amount);
    }
}
