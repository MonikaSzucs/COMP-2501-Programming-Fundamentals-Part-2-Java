package ca.bcit.comp2501.lab2a.practice1;

import java.util.HashMap;
import java.util.Set;

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
        bankAccounts.put(accounts.getAccountId(), accounts);
    }

    public BankAccount getAccount(String accountNumber)
    {
        return bankAccounts.get(accountNumber);
    }

    public void removeAccount(BankAccount accountNumber){
        bankAccounts.remove(accountNumber);
    }

    public int getNumberOfAccounts()
    {
        return bankAccounts.size();
    }

    public double getTotalAccountsBalance()
    {
        double totalCdn = 0.0;
        Set<String> keys = bankAccounts.keySet();
        for(String key: keys)
        {
            totalCdn += bankAccounts.get(key).getBalanceCdn();
        }
        return totalCdn;
    }

    public void depositTo(double amountCdn, String accountNum)
    {
        bankAccounts.get(accountNum).deposit(amountCdn);
    }

    public void printAllCustomerData()
    {
        Set<String> account = bankAccounts.keySet();
        for(String key: account) {
            System.out.println(String.format("Customer %s has $%.2f in account #%s", bankAccounts.get(key).getCustomerLastName(), bankAccounts.get(key).getBalanceCdn(), bankAccounts.get(key).getAccountId()));
        }
        System.out.println(String.format("The total balance in all accounts for %s is %.2f", bankName, getTotalAccountsBalance()));
    }
}
