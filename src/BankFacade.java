import services.AccountService;
import services.BalanceService;
import services.SecurityService;

/**
 * BankFacade - the Facade class that simplifies interactions with the bank subsystem.
 * The client calls withdrawCash() and the facade coordinates: account check, PIN check,
 * balance check, then withdraw.
 */
public class BankFacade {
    private String accountNumber;
    private int pin;

    // Subsystem components used by the facade.
    private AccountService accountService = new AccountService();
    private SecurityService securityService = new SecurityService();
    private BalanceService balanceService = new BalanceService();

    // Constructor receives the credentials for this "session" and also subsystem instances.
    public BankFacade(String accountNumber, int pin,
                      AccountService accountService,
                      SecurityService securityService,
                      BalanceService balanceService) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.accountService = accountService;
        this.securityService = securityService;
        this.balanceService = balanceService;
    }

    /**
     * Simple method that represents the client action "withdraw cash".
     * It hides the sequence of internal operations required to complete a withdrawal.
     */
    public void withdrawCash(double amount) {
        System.out.println("Attempting to withdraw " + amount + " for account " + accountNumber);

        // Step 1: account existence check
        if (!accountService.checkAccount(accountNumber)) {
            System.out.println("Account not found or inactive.");
            return;
        }

        // Step 2: PIN / credentials check
        if (!securityService.checkPin(pin)) {
            System.out.println("Authentication failed (invalid PIN).");
            return;
        }

        // Step 3: funds check
        if (!balanceService.hasSufficientFunds(amount)) {
            System.out.println("Insufficient funds.");
            return;
        }

        // Step 4: perform the withdrawal
        balanceService.withdraw(amount);
        System.out.println("Withdrawal successful.");
    }



}
