package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Represents a bank customer
 * Stores customer personal information and linked accounts
 */
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private ArrayList<String> accountNumbers;  // Links to BankAccounts
    
    // Constructor
    public Customer(String customerId, String firstName, String lastName, 
                   String email, String phoneNumber, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.accountNumbers = new ArrayList<>();
    }
    
    // Getters
    public String getCustomerId() {
        return customerId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public ArrayList<String> getAccountNumbers() {
        return accountNumbers;
    }
    
    // Setters
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // Methods
    public void addAccount(String accountNumber) {
        accountNumbers.add(accountNumber);
    }
    
    public void removeAccount(String accountNumber) {
        accountNumbers.remove(accountNumber);
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
