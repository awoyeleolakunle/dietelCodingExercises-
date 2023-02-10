package Chapter7;

import java.util.Scanner;

public class BankAccountApplication {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BankAccount oladele = new BankAccount(20000,"Oladele","0011111111", "1234");
        BankAccount inteliJames = new BankAccount(10000, "InteliJames", "0123456789", "2345");
        BankAccount moyin = new BankAccount(15000, "Moyin", "0223456789", "3456");


        System.out.println(" welcome dear customer " );
        System.out.println(" how much do you wish to transfer");
        double transferAmount = scanner.nextDouble();
        System.out.println(" enter an account Number you want to transfer to ");
        String accountNumber = scanner.next();
        System.out.println(" please type your secret pin to make this transfer");
        String pin = scanner.next();
        if (accountNumber.equals("0123456789") && pin.equals("1234")){
            oladele.makeTransfer(transferAmount);
            inteliJames.getCredited(transferAmount);}
        //else if (accountNumber.equals("0223456789")){
          //  System.out.println(moyin.getCredited(oladele.makeTransfer()));
        }




    }

