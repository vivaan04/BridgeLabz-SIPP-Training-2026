public class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;
    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.printf("Deposited ", amount, accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.printf("Withdrawal of %.2f denied for %s: insufficient funds.%n", amount, accountNumber);
            return;
        }
        balance -= amount;
        System.out.printf("Withdrew %.2f from %s.%n", amount, accountNumber);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}