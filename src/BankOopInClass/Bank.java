package BankOopInClass;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    ArrayList<Account> accounts = new ArrayList<>();
    public void createAccountFor(String firstName, String lastName, String pin) {
        int accountNumber = accounts.size()+1;
        Account newAccount = new Account(1, firstName+" "+lastName, pin);
        accounts.add(newAccount);
    }
    public int getNumberOfCustomers() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        return accounts.get(accountNumber-1);
    }

    public BigDecimal checkBalance(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);
       // findAccount(2).getBalance("1234");
    }

    public void depositInto(int accountNumber, BigDecimal amount) {
        //Account account = findAccount(accountNumber);
       // account.deposit(amount);
        findAccount(accountNumber).deposit(amount);
    }

    public void withdrawFrom(int accountNumber, BigDecimal amount, String pin) {
        findAccount(accountNumber).withdraw(amount, pin);

    }

    public void transfer(BigDecimal amount, int senderAccountNumber, int receiverAccountNumber, String senderPIN) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        senderAccount.withdraw(amount,senderPIN);
        receiverAccount.deposit(amount);
    }

    public void closeAccountFor(int accountNumber) {
        //Account
    }
}