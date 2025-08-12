import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private final String accountHolderName;
    private final String accountNumber;
    protected double balance;
    private final List<Transaction> transactionHistory = new ArrayList<>();

    public Account(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        addTransaction(TransactionType.DEPOSIT, initialBalance);
    }

    public final void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction(TransactionType.DEPOSIT, amount);
            System.out.println("✅ Successfully deposited ₹%.2f".formatted(amount));
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    public abstract void withdraw(double amount);

    protected void addTransaction(TransactionType type, double amount) {
        transactionHistory.add(new Transaction(java.time.LocalDateTime.now(), type, amount, balance));
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("\n📜 Transaction History for " + accountHolderName);
        transactionHistory.forEach(System.out::println);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
