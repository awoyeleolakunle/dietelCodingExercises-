package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositTest() {
        Account deborahAccount = new Account();
        // given there is an account
        deborahAccount.deposit(5000);
        // When I deposited 5000
        int deborahAccountBalance = deborahAccount.getBalance();
        // check that balance is 5000
        assertEquals(5000, deborahAccountBalance);
    }


    @Test

    public void depositTwiceTest() {
        // given that there is an account
        Account deborahAccount = new Account();
        // Given that initial balance is 4000
        deborahAccount.deposit(4000);
        // when i deposit 1000
        deborahAccount.deposit(1000);
        // when i deposit another 1000
        deborahAccount.deposit(1000);
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(6000, deborahAccountBalance);

    }


    @Test
    public void depositNagativeAmountTest(){
        //given that i have an account
        Account deborahAccount = new Account();
        // given that i have an initial balance of 4000
        deborahAccount.deposit(4000);
        // when I deposit -2500
        deborahAccount.deposit(-2500);
        // check that the balance remains the initial balance
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(4000, deborahAccountBalance);


    }



    @Test
    public void withdrawal(){
        // Given that there is an account
        Account deborahAccount = new Account();
        // Given an initial balance of 8000
     deborahAccount.deposit(4000);
     deborahAccount.withdrawal(3000);
     deborahAccount.deposit(5000);
     int deborahAccountBalance = deborahAccount.getBalance();
     assertEquals(6000, deborahAccountBalance);

    }






@Test
public void negativeWithdrawal() {
    //Given that there is an account
    Account deborahAccount = new Account();
    // given that there is an initial balance of 10000
    deborahAccount.deposit(4000);
    deborahAccount.deposit(2000);
    deborahAccount.withdrawal(4000);
    deborahAccount.deposit(4000);
    deborahAccount.deposit(4000);
    deborahAccount.withdrawal(15000);
    int deborahAccountBalance = deborahAccount.getBalance();
    assertEquals(10000, deborahAccountBalance);


}

    @Test
    public void withdrawalMultiTest(){
        //given that i have an account
        Account deborahAccount = new Account ();
        // given that there is an initial deposit of 30000
        deborahAccount.deposit(20000);
        deborahAccount.deposit (10000);
        deborahAccount.withdrawal(30000);
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(000, deborahAccountBalance);
    }
}






