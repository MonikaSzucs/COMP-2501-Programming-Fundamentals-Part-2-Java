package ca.bcit.comp2501.lab2apractice;

import java.util.HashMap;

public class Bank {
    private String bankName;
    private HashMap<String, BankAccount> bankAccounts;

    public Bank(final String bankName)
    {
        this.bankName=bankName;
        bankAccounts = new HashMap<>();
    }

    public void setBankName(final String bankName)
    {
        this.bankName=bankName;
    }

    public String getBankName()
    {
        return bankName;
    }

    public void addAccount(BankAccount accounts)
    {
        bankAccounts.put(accounts.getAccountNumber(), accounts);
    }

    public BankAccount getAccount(String accountNumber)
    {
        return bankAccounts.get(accountNumber);
    }

    public String removeAccount(final String accountNumber)
    {
        return accountNumber;
    }

    public String getNumberOfAccounts()
    {
        return len(accounts);
    }

    public double getTotalAccountsBalance()
    {
        totalCdn = 0.0;
        // HERE
        return 000;
    }

    public void depositTo(final double amountCdn, final String accountNum)
    {
        accounts[accountNum].deposit(amountCdn);
    }

    public void printAllCustomerData()
    {
        System.out.println("test");
    }

}
