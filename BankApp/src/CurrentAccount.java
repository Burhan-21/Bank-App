public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 10000;

    public CurrentAccount(String name, String number, double initialBalance) {
        super(name, number, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            addTransaction(TransactionType.WITHDRAW, amount);
            System.out.println("🏦 Successfully withdrawn ₹%.2f".formatted(amount));
        } else {
            System.out.println("❌ Overdraft limit reached.");
        }
    }
}
