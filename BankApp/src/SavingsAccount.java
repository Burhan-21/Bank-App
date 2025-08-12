public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String name, String number, double initialBalance) {
        super(name, number, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            addTransaction(TransactionType.WITHDRAW, amount);
            System.out.println("💸 Successfully withdrawn ₹%.2f".formatted(amount));
        } else {
            System.out.println("❌ Withdrawal denied. Maintain minimum ₹%.2f balance.".formatted(MIN_BALANCE));
        }
    }
}
