import java.util.Scanner;

class ATM {
    double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(1000);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                atm.checkBalance();
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double amt = sc.nextDouble();
                atm.deposit(amt);
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                double amt = sc.nextDouble();
                atm.withdraw(amt);
            } else if (choice == 4) {
                System.out.println("Exiting... Thank you!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
        sc.close();
    }
}