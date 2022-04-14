package com.Bank;

public class Main
{
    public static void main(final String[] args)
    {
        BankAccount bank1 = new BankAccount(100.00, "abc123", "gates");
        BankAccount bank2 = new BankAccount(500.00, "xyz789", "woods");

        System.out.println(bank1.balanceCDN);
        bank1.withdraw(5.00);
        System.out.println(bank1.accountNumber);
        System.out.println(bank1.balanceCDN);

        System.out.println("---");
        //print(b1.balance_cdn)
        //b1.withdraw(5.00)
        //print(b1.account_number)
        //print(b1.balance_cdn)

        //print("---")

        //print(b2.balance_cdn)
        //b2.deposit(23.00)
        //print(b2.member_last_name)
        //print(b2.balance_cdn)

        //print("---")

        //b1.transfer(50.00, b2)
        //print(b1.balance_cdn)
        //print(b2.balance_cdn)
    }
}
