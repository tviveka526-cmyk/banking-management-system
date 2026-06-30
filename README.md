# Banking Management System

## 🏦 Overview

A comprehensive Java-based Banking Management System with a modern GUI, designed for managing customer accounts, transactions, and banking operations. This is an enterprise-level project suitable for final-year engineering students.

## 📋 Features

### Core Banking Operations
- ✅ Create customer accounts
- ✅ Deposit money
- ✅ Withdraw money
- ✅ Money transfers between accounts
- ✅ View transaction history
- ✅ Check account balance
- ✅ View all customers

### Exception Handling
- ✅ Account not found
- ✅ Insufficient balance
- ✅ Invalid amount input
- ✅ Duplicate account prevention

### GUI Components
- ✅ Splash screen with loading animation
- ✅ Login authentication
- ✅ Dashboard with quick stats
- ✅ Sidebar navigation
- ✅ Modern rounded buttons and text fields
- ✅ Transaction reports
- ✅ Customer management panel

## 🏗️ Project Structure

```
BankManagementSystem/
├── src/
│   ├── app/                    # Application entry point
│   ├── model/                  # Data models (BankAccount, Customer, Transaction)
│   ├── service/                # Business logic (BankService, AccountService, TransactionService)
│   ├── repository/             # Data persistence (BankRepository)
│   ├── exception/              # Custom exceptions
│   ├── validator/              # Input validation
│   ├── ui/                     # GUI components and panels
│   ├── components/             # Reusable UI components
│   └── utils/                  # Utility functions and constants
└── README.md
```

## 🛠️ Technology Stack

| Component | Technology |
|-----------|------------|
| **Language** | Java 8+ |
| **GUI Framework** | Swing (JFrame, JPanel, JButton) |
| **Data Storage** | ArrayList in-memory (extensible to database) |
| **Architecture** | Layered MVC Pattern |
| **Exception Handling** | Custom Exceptions |
| **Validation** | Input Validator |

## 📦 Package Descriptions

### `app`
- **Main.java** - Application entry point

### `model`
- **BankAccount.java** - Bank account entity
- **Customer.java** - Customer entity
- **Transaction.java** - Transaction entity

### `service`
- **BankService.java** - Overall bank operations
- **AccountService.java** - Account-specific operations
- **TransactionService.java** - Transaction processing

### `repository`
- **BankRepository.java** - Data access layer

### `exception`
- **AccountNotFoundException.java** - Account not found error
- **InvalidAmountException.java** - Invalid amount error
- **InsufficientBalanceException.java** - Insufficient balance error

### `validator`
- **InputValidator.java** - Input validation utility

### `ui`
- **SplashScreen.java** - Startup splash screen
- **LoginFrame.java** - Login authentication
- **DashboardFrame.java** - Main dashboard
- **CreateAccountPanel.java** - Account creation UI
- **DepositPanel.java** - Deposit transaction UI
- **WithdrawPanel.java** - Withdrawal transaction UI
- **TransferPanel.java** - Transfer transaction UI
- **CustomerPanel.java** - Customer management UI
- **TransactionPanel.java** - Transaction view UI
- **ReportPanel.java** - Report generation UI
- **SettingsPanel.java** - Settings UI

### `components`
- **RoundedButton.java** - Custom button with rounded corners
- **RoundedTextField.java** - Custom text field with rounded corners
- **Sidebar.java** - Navigation sidebar
- **Header.java** - Top header component
- **DashboardCard.java** - Dashboard statistics card
- **StatusBar.java** - Bottom status bar

### `utils`
- **Constants.java** - Application constants
- **DateUtil.java** - Date and time utilities
- **FileUtil.java** - File I/O operations

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- IDE (IntelliJ IDEA, Eclipse, or NetBeans) or Command Line

### Compilation & Execution

#### Windows PowerShell:
```powershell
cd BankManagementSystem
cd src
javac *.java
java app.Main
```

#### macOS/Linux Terminal:
```bash
cd BankManagementSystem
cd src
javac *.java
java app.Main
```

## 📚 Learning Objectives

By building this project, you'll learn:

✅ **OOP Concepts**
- Inheritance, Encapsulation, Polymorphism, Abstraction

✅ **Design Patterns**
- Repository Pattern, Service Layer Pattern, MVC

✅ **Exception Handling**
- Custom exceptions, Try-catch, Throws

✅ **Collections**
- ArrayList, HashMap for data management

✅ **GUI Development**
- Swing components, Event handling, Layout managers

✅ **Code Organization**
- Package structure, Layered architecture

✅ **Debugging**
- Error tracking, Testing, Troubleshooting

## 📝 Usage Example

```java
// Create a bank service
BankService bankService = new BankService();

// Create a customer
bankService.createCustomer("C001", "John", "Doe", 
                          "john@email.com", "9876543210", "123 Main St");

// Create an account
bankService.createAccount("ACC001", "SAVINGS", "C001");

// Deposit money
bankService.deposit("ACC001", 5000.0);

// Get account details
BankAccount account = bankService.getAccount("ACC001");
System.out.println("Balance: " + account.getBalance());
```

## 🔒 Default Login Credentials
- **Username:** admin
- **Password:** admin

## 🐛 Troubleshooting

### Compilation Error: Package not found
- Ensure all Java files are in the `src` directory
- Compile using `javac *.java` from the `src` directory

### Runtime Error: Main class not found
- Ensure Main.java is in the `src/app` directory
- Run using `java app.Main` from the `src` directory

## 📄 License

This project is for educational purposes.

## 👨‍💼 Author

Created by: Banking Management System Development Team

## 📞 Support

For issues and questions, please refer to the project documentation or contact the development team.

---

**Happy Coding! 🚀**
