package utils;

/**
 * Constants used throughout the application
 */
public class Constants {
    
    // Transaction types
    public static final String TRANSACTION_TYPE_DEPOSIT = "DEPOSIT";
    public static final String TRANSACTION_TYPE_WITHDRAWAL = "WITHDRAWAL";
    public static final String TRANSACTION_TYPE_TRANSFER = "TRANSFER";
    
    // Account types
    public static final String ACCOUNT_TYPE_SAVINGS = "SAVINGS";
    public static final String ACCOUNT_TYPE_CHECKING = "CHECKING";
    public static final String ACCOUNT_TYPE_BUSINESS = "BUSINESS";
    
    // Transaction limits
    public static final double MAX_TRANSACTION_AMOUNT = 1000000.0;
    public static final double MIN_TRANSACTION_AMOUNT = 0.01;
    
    // Interest rates (annual percentage)
    public static final double SAVINGS_INTEREST_RATE = 3.5;
    public static final double CHECKING_INTEREST_RATE = 0.5;
    public static final double BUSINESS_INTEREST_RATE = 2.0;
    
    // Fees
    public static final double OVERDRAFT_FEE = 35.0;
    public static final double TRANSFER_FEE = 1.0;
    
    // Messages
    public static final String SUCCESS_MESSAGE = "Operation successful";
    public static final String ERROR_MESSAGE = "Operation failed";
    public static final String WELCOME_MESSAGE = "Welcome to Banking Management System";
}
