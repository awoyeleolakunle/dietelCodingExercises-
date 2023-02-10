package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankAccountTransferTest {
    private static BankAccount bankAccount = new BankAccount(12000, "Dopemu", "0111222333", "1234");


    @Test
    public void BankAccountTest() {

        assertNotNull(bankAccount);
        bankAccount.setName("Dopemu");
        bankAccount.setAccountNumber("0111222333");
        String myAccountName = bankAccount.getName();
        String myAccountNumber = bankAccount.getAccountNumber();
        assertEquals("Dopemu", myAccountName);
        assertEquals("0111222333", myAccountNumber);

    }

    @Test
    public void deposit() {
        bankAccount.depositTest(10000);
        double checkMyBalance = bankAccount.getBalance();
        assertEquals(22000, checkMyBalance);


    }

    @Test
    public void withdrawalTest() {
        bankAccount.depositTest(10000);
        bankAccount.makeWithdrawal(2000);
        bankAccount.getBalance();
        assertEquals(20000, bankAccount.getBalance());

    }

    @Test
    public void Transfer() {
        bankAccount.makeTransfer(5000);
        bankAccount.getBalance();
        assertEquals(7000, bankAccount.getBalance());

    }
}
