package com.Bank;

public class BankAccount {
    final double balanceCDN;
    final String accountNumber;
    final String memberLastName;

    // constructor
    BankAccount(final double balanceCDN, final String accountNumber, final String memberLastName)
    {
        this.balanceCDN = balanceCDN;
        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
    }

    public double withdraw(double withdrawAmount)
    {
        System.out.println(withdrawAmount);
        System.out.println(balanceCDN);
        return balanceCDN - withdrawAmount;
    }

    public double deposit()
    {
        return balanceCDN;
    }

    public String transfer()
    {
        //deposit();
        //withdraw();
        return "test";
    }
}
