package services;

public class SecurityService {
    // Validate the provided PIN for the current session/user.
    public boolean checkPin(int pin) {
        System.out.println("Checking PIN...");
        return pin == 1111;
    }
}
