package BankOopInClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account paulineAccount;

    @BeforeEach
    public void setUpTest() {
        paulineAccount = new Account(3452435, "Pauline","1234");
    }

    @Test
    public void depositMoneyTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000), paulineAccount.getBalance("1234"));
    }

    @Test
    public void getBalanceWithCorrectPinTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000), paulineAccount.getBalance("1234"));
    }

    @Test
    public void getBalanceWithWrongPinThrowsExceptTest() {
        paulineAccount.deposit(BigDecimal.valueOf(2000));
        assertThrows(IllegalArgumentException.class, () -> paulineAccount.getBalance("2234"));

    }
    @Test
    public void withdrawWithRightPinWorksTest(){
        paulineAccount.deposit(BigDecimal.valueOf(1200));
        paulineAccount.withdraw(BigDecimal.valueOf(200), "1234");
        assertEquals(BigDecimal.valueOf(1000),paulineAccount.getBalance("1234") );
    }
}