import java.time.LocalDateTime;

public record Transaction(LocalDateTime dateTime, TransactionType type, double amount, double balanceAfter) {
    @Override
    public String toString() {
        return "%s | %-8s | ₹%.2f | Balance: ₹%.2f"
                .formatted(dateTime, type, amount, balanceAfter);
    }
}
