package validator;

import exception.InvalidAmountException;

/**
 * Utility class for validating user input
 */
public class InputValidator {
    
    /**
     * Validate amount (must be positive and not zero)
     */
    public static void validateAmount(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive and greater than 0");
        }
        if (amount > 1000000) {
            throw new InvalidAmountException("Amount exceeds maximum limit");
        }
    }
    
    /**
     * Validate account number (should not be empty)
     */
    public static void validateAccountNumber(String accountNumber) throws InvalidAmountException {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new InvalidAmountException("Account number cannot be empty");
        }
    }
    
    /**
     * Validate email format
     */
    public static void validateEmail(String email) throws InvalidAmountException {
        if (email == null || !email.contains("@")) {
            throw new InvalidAmountException("Invalid email format");
        }
    }
    
    /**
     * Validate phone number
     */
    public static void validatePhoneNumber(String phone) throws InvalidAmountException {
        if (phone == null || phone.trim().isEmpty() || phone.length() < 10) {
            throw new InvalidAmountException("Invalid phone number");
        }
    }
}
