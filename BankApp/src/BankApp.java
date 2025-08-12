import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter account holder name: ");
            String name = sc.nextLine();

            System.out.print("Enter account number: ");
            String accNumber = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Choose account type (1: Savings | 2: Current): ");
            int typeChoice = sc.nextInt();
            sc.nextLine();

            Account account = (typeChoice == 1)
                    ? new SavingsAccount(name, accNumber, balance)
                    : new CurrentAccount(name, accNumber, balance);

            int choice;
            do {
                System.out.println("\n--- 🏦 Bank Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter deposit amount: ");
                        account.deposit(sc.nextDouble());
                    }
                    case 2 -> {
                        System.out.print("Enter withdrawal amount: ");
                        account.withdraw(sc.nextDouble());
                    }
                    case 3 -> System.out.println("💰 Current Balance: ₹" + account.getBalance());
                    case 4 -> account.printTransactionHistory();
                    case 5 -> System.out.println("👋 Exiting... Have a nice day!");
                    default -> System.out.println("❌ Invalid choice.");
                }
            } while (choice != 5);
        }
    }
}
