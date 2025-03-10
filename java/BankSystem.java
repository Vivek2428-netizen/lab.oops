// Base class: Bank Account
class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println(accountHolder + " Balance: $" + balance);
    }
}

// Derived class: Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate;
    private double threshold = 5000;

    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        if (balance >= threshold) {
            double interest = (balance * interestRate) / 100;
            balance += interest;
            System.out.println("Interest applied to " + accountHolder + ": $" + interest);
        } else {
            System.out.println("Interest not applied, balance below threshold.");
        }
    }
}

// Derived class: Current Account
class CurrentAccount extends BankAccount {
    private double minBalance = 1000;
    private double penalty = 50;

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw, minimum balance requirement not met.");
        }
    }

    public void applyPenalty() {
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println(accountHolder + " incurred a penalty of $" + penalty);
        }
    }
}

// Main Class: Bank System Simulation
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Alice", 6000, 5);
        CurrentAccount current = new CurrentAccount("Bob", 900);

        System.out.println("=== Initial Balances ===");
        savings.displayBalance();
        current.displayBalance();

        System.out.println("\n=== Transactions ===");
        savings.deposit(1000);
        savings.withdraw(2000);
        savings.applyInterest();
        savings.displayBalance();

        current.withdraw(500);
        current.applyPenalty();
        current.displayBalance();
    }
}
