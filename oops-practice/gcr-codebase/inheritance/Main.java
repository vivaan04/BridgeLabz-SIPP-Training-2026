public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("BA1001", "Alice Sharma", 1200.00);
        BankAccount account2 = new BankAccount("BA1002", "Rohan Mehta", 500.00);
        BankAccount account3 = new BankAccount("BA1003", "Priya Singh", 2000.00);

        // Simulate 5 transactions for each account
        account1.deposit(300.00);
        account1.withdraw(150.00);
        account1.withdraw(2000.00); // overdraft attempt
        account1.deposit(450.00);
        account1.withdraw(500.00);

        account2.withdraw(100.00);
        account2.deposit(250.00);
        account2.withdraw(800.00); // overdraft attempt
        account2.deposit(100.00);
        account2.withdraw(200.00);

        account3.deposit(500.00);
        account3.withdraw(750.00);
        account3.withdraw(100.00);
        account3.deposit(150.00);
        account3.withdraw(1800.00);

        // Print statements
        account1.getStatement();
        account2.getStatement();
        account3.getStatement();

        System.out.printf("Total accounts created: %d%n", BankAccount.getTotalAccounts());
    }
}
