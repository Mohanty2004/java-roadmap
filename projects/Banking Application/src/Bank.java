import java.util.ArrayList;
import java.util.Scanner;
public class Bank {
    private ArrayList<Account> accounts=new ArrayList<>();
    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account added successfully.");
    }
    public void deposit(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdraw(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }
        for (Account account : accounts) {
            account.displayInfo();
            System.out.println("-------------------");
        }
    }
}

    

