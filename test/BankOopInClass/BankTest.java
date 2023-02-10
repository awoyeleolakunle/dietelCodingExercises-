package BankOopInClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank wemaBank = new Bank();

    @BeforeEach

    public void accountCanBeCreated() {

        wemaBank.createAccountFor("Pauline", "Obibia", "6758");
    }
    @Test
    public void accountCanBeCreatedInBankTest() {

        assertEquals(1, wemaBank.getNumberOfCustomers());
    }
    @Test
    public void accountCanBeFoundAfterCreation(){
        String expected = """
                =====================
                Account Name : Pauline Obibia
                Account Number: 1
                Account Balance: 0
                =====================
                """;
        assertEquals(expected, wemaBank.findAccount(1).toString());

    }
    @Test
    public void balanceCabBeCheckedTest(){
        assertEquals("0", wemaBank.checkBalance(1,"6758").toPlainString());
    }
    public void depositIntoAccountTest(){
        wemaBank.depositInto(1, BigDecimal.valueOf(50));
        assertEquals((BigDecimal.valueOf(50)), wemaBank.checkBalance(1, "6758"));
    }
    @Test
    public void withdrawIntoAccount(){
        wemaBank.depositInto(1, BigDecimal.valueOf(50));
        wemaBank.withdrawFrom(1, BigDecimal.valueOf(20), "6758");
        assertEquals(BigDecimal.valueOf(30), wemaBank.checkBalance(1,"6758"));
    }
    @Test
    public void transferMoneyTest(){
        wemaBank.createAccountFor("all", "well", "6758");
        wemaBank.depositInto(2,BigDecimal.valueOf(5000));

        wemaBank.transfer(BigDecimal.valueOf(2000), 2, 1, "6758");

        assertEquals(BigDecimal.valueOf(3000), wemaBank.checkBalance(2,"6758") );
    }
    public void closeAccountTest(){
      //  wemaBank.closeAccountFor();
    }
}