class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;
    private String accountType;

    public BankAccount(String name, String accountNumber, double balance, String accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transferred $" + amount + " to " + recipient.name + ". Your new balance: $" + balance);
        } else {
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", "12345", 1000, "Savings");
        BankAccount account2 = new BankAccount("Bob", "67890", 500, "Checking");

        account1.deposit(200);
        account1.withdraw(100);
        account1.transfer(account2, 300);
    }
}