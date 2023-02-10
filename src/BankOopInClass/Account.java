package BankOopInClass;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;
    private int accountNumber;
    private String accountName;
    private String pin;


    public Account(int accountNumber, String accountName, String accountPin) {
        this.pin = accountPin;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void setBalance( BigDecimal balance) {
        this.balance = balance;


    }

    public void deposit(BigDecimal amount) {
       balance = balance.add(amount);
    }

    public BigDecimal getBalance(String pin) {
        if(!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid pin");
        return balance;
    }

    public void withdraw(BigDecimal amount, String pin) {
        if(!pin.equals(this.pin)) throw new IllegalArgumentException("Invalid pin");
        balance = balance.subtract(amount);
    }
    @Override
    public String toString(){
        return String.format("""
                =====================
                Account Name : %s
                Account Number: %s
                Account Balance: %s
                =====================
                """, accountName, accountNumber, balance.toPlainString());
    }
}
