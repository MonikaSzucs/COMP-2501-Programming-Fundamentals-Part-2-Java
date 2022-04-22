package ca.bcit.comp2501.lab2a.monikaszucsparhammehrgan;

import javax.swing.text.AbstractDocument;
import java.util.HashMap;
import java.util.Set;

public class Bank
{
    private String bankName;

    HashMap<String, BankAccount> bankAccounts;

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

    public void addAccount(BankAccount account)
    {
        bankAccounts.put(account.getAccountId(),account);
    }

    public BankAccount getAccount(String accountNumber)
    {
        return bankAccounts.get(accountNumber);
    }

    public void removeAccount(String accountNumber)
    {
        bankAccounts.remove(accountNumber);
    }

    public int getNumberOfAccounts()
    {
        return bankAccounts.size();
    }

    public double getTotalAccountsBalance()
    {
        double total = 0.0;
        Set<String> keys = bankAccounts.keySet();
        for(String value: keys)
        {
            total += bankAccounts.get(value).getBankAmount();
        }
        return total;
    }

    public void depositTo(double amountCdn, String accountNum)
    {
        bankAccounts.get(accountNum).deposit(amountCdn);
    }

    public void printAllCustomerData()
    {
        Set<String> keys = bankAccounts.keySet();
        for(String value: keys)
        {
            System.out.println("Customer " + bankAccounts.get(value).getLastName() + " has " +
                    bankAccounts.get(value).getBankAmount() + " in account #" + bankAccounts.get(value).getAccountId());
        }
        System.out.println("Total bank balance in all accounts for " + bankName + " is " + getTotalAccountsBalance());
    }

}
