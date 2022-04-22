package ca.bcit.comp2501.lab2a.practice1;

import java.util.HashMap;

public class Bank {
    private String bankName;

    private HashMap<String, BankAccount> bankAccounts;

    public Bank(final String bankName)
    {
        this.bankName = bankName;
        bankAccounts = new HashMap<>();
    }

    public void setBankName(String bankName)
    {
        this.bankName = bankName;
    }

    public String getBankName()
    {
        return bankName;
    }

    public void addAccount(BankAccount accounts)
    {
        //bankAccounts.put();
    }
}
