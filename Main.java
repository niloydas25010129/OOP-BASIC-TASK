import java.util.ArrayList;

class Account {
    int accountNumber;
    String customerName;
    double balance;
    Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    void displayAccount() {
        System.out.println("Account No: " + accountNumber + ", Name: " + customerName + ", Balance: " + balance);
    }
}

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();
    void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account added: " + acc.customerName);
    }
    void removeAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.accountNumber == accountNumber) {
                accounts.remove(acc);
                System.out.println("Account removed: " + acc.customerName);
                return;
            }
        }
        System.out.println("Account not found!");
    }
    void displayAllAccounts() {
        System.out.println("----- All Accounts -----");
        for (Account acc : accounts) {
            acc.displayAccount();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account(1001, "Messi", 99995000);
        Account a2 = new Account(1002, "Neymar", 8883000);
        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.displayAllAccounts();
        a1.deposit(2000);
        a2.withdraw(1000);
        bank.removeAccount(1001);
        bank.displayAllAccounts();
    }
}
