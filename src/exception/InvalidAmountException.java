package exception;

/**
 * Custom exception thrown for invalid transaction amounts
 */
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
    
    public InvalidAmountException(String message, Throwable cause) {
        super(message, cause);
    }
}
