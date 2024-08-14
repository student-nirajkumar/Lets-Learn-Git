/*
Write the java code for the following classes and interface:

An abstract class Account that represents a bank account with a balance and an account number.
The class should have a constructor that takes the account number as a parameter and getter method for account number.

The class should also have an abstract method getBalance()
that returns the current balance of the account,and abstarct methid deposit(double amount)
that update the balance according to the amount given.

A subclass SavingsAccount that inherits from Account and represents a saving account that earns interest.
The class should have the constructor that takes the account number and the interest rate as parameters and a getter method for the interest rate.
The class should override the getBalance() method to return the balance plus the interest earned,and the deposit() method to update the balance accordingly.

Input Format-
		First line represents the account number
		Second line represents the interest rate 
		Third line reperesents the balance

Sample Input-
		123456789
		0.05
		1000

Sample Output-
		Savings Account created with account number 123456789
		Interest Rate of savings account: 0.05
		Balance in savings account: 1000.0 
*/

// Abstract class Account
abstract class Account {
    private String accountNumber;
    protected double balance;

    // Constructor to initialize the account number
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Abstract method to get the current balance
    public abstract double getBalance();

    // Abstract method to deposit money into the account
    public abstract void deposit(double amount);
}

// Subclass SavingsAccount that inherits from Account
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor to initialize the account number and interest rate
    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // Getter method for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Override the getBalance() method to return the balance plus interest
    @Override
    public double getBalance() {
        return balance + (balance * interestRate);
    }

    // Override the deposit() method to update the balance
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
}

// Main class to test the implementation
public class BankingDetails {
    public static void main(String[] args) {
        // Sample Input
        String accountNumber = "123456789";
        double interestRate = 0.05;
        double initialDeposit = 1000.0;

        // Creating a savings account with the given input
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, interestRate);
        savingsAccount.deposit(initialDeposit);

        // Displaying the output
        System.out.println("Savings Account created with account number: " + savingsAccount.getAccountNumber());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate());
        System.out.println("Balance: " + savingsAccount.getBalance());
    }
}














