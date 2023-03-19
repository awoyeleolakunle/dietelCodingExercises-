package Chapter11;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;

    public void deposit(BigDecimal amount){
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal withdrawalAmount)throws OleBalanceExecption{
if(withdrawalAmount.compareTo(balance)> BigInteger.ZERO.intValue())
    throw new OleBalanceExecption("you be thief!!");
    }

}
