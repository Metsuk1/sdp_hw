import services.AccountService;
import services.BalanceService;
import services.SecurityService;

/**
 * Usage of Facade pattern
 * The client works with a simple interface, and all checks take place inside.
 */
public class Main {
    public static void main(String[] args) {
        // Create subsystem service instances
        AccountService accountService = new AccountService();
        SecurityService securityService = new SecurityService();
        BalanceService balanceService = new BalanceService();

        // Case 1: successful withdrawal
        System.out.println("---Case 1: Successful withdrawal---");
        BankFacade facade1 = new BankFacade("12345", 1111, accountService, securityService, balanceService);
        facade1.withdrawCash(300.0); // expected: success
        System.out.println();

        // Case 2: wrong PIN
        System.out.println("---Case 2: Wrong PIN---");
        BankFacade facade2 = new BankFacade("12345", 9999, accountService, securityService, balanceService);
        facade2.withdrawCash(100.0); // expected: authentication failed
        System.out.println();

        // Case 3: account not found
        System.out.println("Case 3: Account not found");
        BankFacade facade3 = new BankFacade("00000", 1111, accountService, securityService, balanceService);
        facade3.withdrawCash(50.0); // expected: account not found
        System.out.println();

        // Case 4: insufficient funds (balance was reduced by case 1)
        System.out.println("Case 4: Insufficient funds");
        BankFacade facade4 = new BankFacade("12345", 1111, accountService, securityService, balanceService);
        facade4.withdrawCash(800.0); // after previous successful 300 withdrawal, remaining balance is 700 -> insufficient for 800
        System.out.println();

        // Show final balance for demonstration
        System.out.println("Final mock balance: " + balanceService.getBalance());
    }
}
