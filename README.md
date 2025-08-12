# Bank Account Simulation (Java 17+)

Welcome! This is a console-based Bank Account Simulation written in Java 17, developed as part of the Elevate Labs Java Developer Internship Task 5.
The project simulates real-world banking operations while practicing OOP concepts, inheritance, encapsulation, polymorphism, and modern Java features like records, enums, and enhanced switch expressions.

Features
Create Savings or Current accounts with initial balance

Deposit money with live balance updates

Withdraw money with minimum balance (Savings) or overdraft limit (Current) rules

Maintain and display transaction history using immutable record data types

Menu-driven console UI with user-friendly messages

Utilizes Java 17 features such as:

record for immutable transactions

enum for transaction types

Enhanced switch expressions for clean menu navigation

Runs continuously until the user chooses to exit

Getting Started
Prerequisites
Java 17 or later installed (tested on Java 17 & 18)

Code editor such as VS Code or IntelliJ IDEA Community Edition

Access to a Terminal or Command Prompt

How to Compile & Run
Clone or download the repository, or copy all .java files
(TransactionType.java, Transaction.java, Account.java, SavingsAccount.java, CurrentAccount.java, BankApp.java) into the same folder.

Open your Terminal or Command Prompt in that folder.

Compile the Java files with:

text
javac *.java
Run the application with:

text
java BankApp
💡 Tip: Ensure your terminal’s working directory is the same as where your .java files are stored.

Usage
On running, a bank menu appears with options to deposit, withdraw, check balance, view transaction history, or exit.

Enter the number corresponding to your choice.

Follow prompts to enter amounts where required.

The program validates rules to:

Prevent invalid deposits/withdrawals

Enforce minimum balance (Savings) or overdraft limit (Current)

The transaction history feature logs every deposit/withdrawal with a timestamp.

Runs continuously until the exit option is selected.

Code Structure
Transaction — Java 17 record representing an immutable transaction with date, type, amount, and resulting balance.

TransactionType — Enum for transaction types (DEPOSIT, WITHDRAW).

Account — Abstract superclass containing common account operations & protected balance.

SavingsAccount — Extends Account with minimum balance constraint.

CurrentAccount — Extends Account with overdraft limit.

BankApp — Contains the CLI loop, handles user interaction and menu navigation.

Modern Java Concepts Used
Java record for concise, immutable transaction representation

Enums for clear transaction type management

Enhanced switch expressions for readable menu logic

Inheritance & method overriding for specialized account types

Encapsulation to protect account details

Polymorphism to handle account type selection dynamically

What I Learned
Applying core OOP principles with modern Java syntax

Designing an inheritance hierarchy for maintainability

Using records & enums to simplify data handling

Building an interactive CLI application with validation

Structuring code to separate domain logic and UI

Example Session
text
Enter account holder name: Alice
Enter account number: 1001
Initial balance: 5000
Choose account type (1: Savings | 2: Current): 1

--- 🏦 Bank Menu ---
1. Deposit
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
2025-08-12T17:05:32.123 | DEPOSIT  | ₹5000.00 | Balance: ₹5000.00
2025-08-12T17:06:10.456 | DEPOSIT  | ₹1500.00 | Balance: ₹6500.00
2025-08-12T17:07:05.789 | WITHDRAW | ₹300.00  | Balance: ₹6200.00

Enter choice: 5
👋 Exiting... Have a nice day!
FAQ / Common Errors
"Invalid deposit amount" — Enter a positive amount only

"Withdrawal denied" — Minimum balance (Savings) or overdraft limit (Current) exceeded

"Invalid choice" — Enter a menu option number (1–5) only

Interview Prep Questions (Cheat Sheet)
What is inheritance in Java?

Difference between method overriding & method overloading

What is encapsulation and why is it important?

Can we override static methods in Java? Why or why not?

What is runtime polymorphism?

Difference between a class and an object

Benefits of abstract classes in Java

License
This project is a learning resource created for Elevate Labs and is free to use, modify, and share.
