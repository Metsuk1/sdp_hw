package services;

public class BalanceService {
    // Holds the balance
    private double balance = 1000.0f;

    // Check if there are sufficient funds for the requested amount
    public boolean hasSufficientFunds(double amount) {
        return balance >= amount;
    }

    // Withdraw the amount from the balance
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds (should be pre-checked)");
        }
        balance -= amount;
        System.out.println("Pull of: " + amount + " tg. balance: " + balance);
    }

    // Getter for testing / display.
    public double getBalance() {
        return balance;
    }
}
