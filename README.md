# Bank Account Simulation

Welcome! This is a **console-based Bank Account Simulation** written in Java 17, developed as part of the **Elevate Labs Java Developer Internship Task 5**.  
The project simulates real-world banking operations while practicing **OOP concepts, inheritance, encapsulation, polymorphism**, and modern Java features like **records**, **enums**, and **enhanced switch expressions**.

---

## Features
- Create **Savings** or **Current** accounts with an initial balance  
- Deposit money with live balance updates  
- Withdraw money with:
  - **Minimum balance rule** (Savings accounts)
  - **Overdraft limit** (Current accounts)  
- Maintain and display **transaction history** using immutable `record` objects  
- **Menu-driven console UI** with user-friendly prompts and validation  
- Utilizes **Java 17 features**:
  - `record` for immutable transactions  
  - `enum` for transaction types  
  - Enhanced `switch` expressions for clear menu handling  
- Runs until the user opts to exit  

---

## Getting Started

### Prerequisites
- **Java 17** or later installed (tested with Java 17 and Java 18)  
- Code editor such as **VS Code** or **IntelliJ IDEA Community Edition**  
- Access to a **Terminal** or **Command Prompt**  

---

### How to Compile & Run
1. Clone this repository or download all `.java` files  
   (`TransactionType.java`, `Transaction.java`, `Account.java`, `SavingsAccount.java`, `CurrentAccount.java`, `BankApp.java`) into the same folder.  
2. Open a **Terminal/Command Prompt** in that folder.  
3. Compile all Java files:
4. Run the application:

💡 **Tip:** Make sure your terminal’s *current directory* is the same folder where your `.java` files are located before running commands.  

---

## Usage
1. When you start the program, you’ll be prompted for:
- Account holder name
- Account number
- Initial balance
- Account type (Savings or Current)  
2. You’ll then see the menu:

  1.Deposit
  2. Withdraw
  3. Check Balance
  4. Transaction History
  5. Exit

3. Choose an option by entering the corresponding number.  
4. Follow prompts to enter amounts or choices.  
5. Withdrawals are validated against account rules:  
- Savings accounts must keep a **minimum balance**  
- Current accounts cannot exceed the **overdraft limit**  
6. The transaction history will list:
- Date & time
- Transaction type
- Amount
- Balance after transaction  

---

## Code Structure
- **`Transaction`** — A Java 17 `record` for immutable transaction details (timestamp, type, amount, resulting balance).  
- **`TransactionType`** — An `enum` for clear categorization (`DEPOSIT`, `WITHDRAW`).  
- **`Account`** — Abstract superclass with deposit logic, common fields, and transaction recording.  
- **`SavingsAccount`** — Extends `Account`, enforces minimum balance.  
- **`CurrentAccount`** — Extends `Account`, supports overdraft up to a set limit.  
- **`BankApp`** — Main entry point, handles the interactive menu and user input.  

---

## Modern Java Concepts Used
- **Java 17 `record`** — For concise, immutable representation of transactions  
- **Enums** — To define fixed transaction types without magic strings  
- **Enhanced `switch` expressions** — For neat and readable menu logic  
- **Inheritance & method overriding** — Implementing different withdrawal rules  
- **Encapsulation** — Restricting data access and ensuring controlled updates  
- **Polymorphism** — Dynamic method dispatch based on account type  

---

## What I Learned
- Applying **OOP principles** (encapsulation, inheritance, polymorphism) in practice  
- Designing **account hierarchies** with shared logic in abstract classes  
- Using **records & enums** to create simple yet powerful data models  
- Building **menu-driven console applications** with proper validation and messages  
- Structuring code for maintainability and clarity  

---

## Example Session

Enter account holder name: Alice
Enter account number: 1001
Initial balance: 5000
Choose account type (1: Savings | 2: Current): 1

--- 🏦 Bank Menu ---

  1.Deposit
  2. Withdraw
  3. Check Balance
  4. Transaction History
  5. Exit

Enter choice: 1
Enter deposit amount: 1500
✅ Successfully deposited ₹1500.00

Enter choice: 2
Enter withdrawal amount: 300
💸 Successfully withdrawn ₹300.00

Enter choice: 4

📜 Transaction History for Alice
2025-08-12T17:05:32.123 | DEPOSIT | ₹5000.00 | Balance: ₹5000.00
2025-08-12T17:06:10.456 | DEPOSIT | ₹1500.00 | Balance: ₹6500.00
2025-08-12T17:07:05.789 | WITHDRAW | ₹300.00 | Balance: ₹6200.00

Enter choice: 5
👋 Exiting... Have a nice day!


---

## FAQ / Common Errors
- **"Invalid deposit amount"** → Amount must be greater than zero  
- **"Withdrawal denied"** → Savings min balance or Current overdraft limit exceeded  
- **"Invalid choice"** → Menu choice must be a valid number between 1 and 5  

---

## Interview Prep Questions
- What is **inheritance** in Java?  
- Difference between **method overriding** and **method overloading**  
- What is **encapsulation** and why use it?  
- Can static methods be overridden? Why/why not?  
- What is **runtime polymorphism**?  
- Difference between **class** and **object**  
- Benefits of **abstract classes** in Java  
- Usage and benefits of `record` in Java 17  

---

## License

This is a learning-focused project. Feel free to adapt, enhance, or repurpose it in any way that suits your needs.
