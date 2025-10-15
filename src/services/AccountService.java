package services;

public class AccountService {
    // Check if the account exists and is active.
    public boolean checkAccount(String accountNumber) {
        System.out.println("Checking account number: ...");
        // In a real system, query a DB. Here we simulate: only "12345" exists.
        return accountNumber.equals("12345");
    }
}
