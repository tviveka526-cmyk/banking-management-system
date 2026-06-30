package repository;

import model.BankAccount;
import model.Customer;
import java.util.ArrayList;

/**
 * Repository for data persistence
 * Manages in-memory storage of customers and accounts
 * Can be extended to use database in future
 */
public class BankRepository {
    private ArrayList<Customer> customers;
    private ArrayList<BankAccount> accounts;
    
    // Constructor
    public BankRepository() {
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }
    
    // Customer operations
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public Customer getCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }
    
    public void updateCustomer(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerId().equals(customer.getCustomerId())) {
                customers.set(i, customer);
                return;
            }
        }
    }
    
    public void deleteCustomer(String customerId) {
        customers.removeIf(customer -> customer.getCustomerId().equals(customerId));
    }
    
    public ArrayList<Customer> getAllCustomers() {
        return new ArrayList<>(customers);
    }
    
    // Account operations
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
    
    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    
    public void updateAccount(BankAccount account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(account.getAccountNumber())) {
                accounts.set(i, account);
                return;
            }
        }
    }
    
    public void deleteAccount(String accountNumber) {
        accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
    }
    
    public ArrayList<BankAccount> getAllAccounts() {
        return new ArrayList<>(accounts);
    }
}
