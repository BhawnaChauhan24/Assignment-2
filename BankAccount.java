package advancejava;

public class BankAccount {
    // Private fields
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f. New balance: $%.2f.%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("Withdrew: $%.2f. New balance: $%.2f.%n", amount, balance);
            } else {
                System.out.println("Insufficient funds for this withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Balance: $%.2f%n", balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);

        // Display account details
        account.displayAccountDetails();

        // Simulate transactions
        account.deposit(250.0);
        account.withdraw(100.0);
        account.withdraw(1200.0);  // Should show insufficient funds
        account.deposit(-50.0);      // Should show invalid deposit
        account.withdraw(-25.0);     // Should show invalid withdrawal

        // Check final balance
        System.out.printf("Final Balance: $%.2f%n", account.getBalance());
    }
}
