public class BankAccount {
    private double balance;
    private static final double WARNING_THRESHOLD = 100.0;  // assuming warning if balance is less than 100

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            checkBalanceWarning();
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                checkBalanceWarning();
            } else {
                System.out.println("Error: Insufficient funds.");
            }
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    private void checkBalanceWarning() {
        if (balance < WARNING_THRESHOLD) {
            System.out.println("Warning: Your balance is below the recommended threshold. Current balance: " + balance);
        }
    }

    public static void main(String[] args) {
        // Testing the BankAccount class
        BankAccount account = new BankAccount(150.0);
        account.deposit(50.0);
        account.withdraw(190.0);
        account.withdraw(10.0);  // This will trigger a warning
    }
}

