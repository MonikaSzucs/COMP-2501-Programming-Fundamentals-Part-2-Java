package ca.bcit.comp2501.lab2a.monikaszucsandparhammehrgan;


import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 */
public class Bank {
    private String bankName;
    private HashMap<String, BankAccount> bankAccounts;

    /**
     * @param bankName the name of the bank and setting up a HashMap for the BankAccounts
     */
    public Bank(final String bankName)
    {
        this.bankName = bankName;
        bankAccounts = new HashMap<>();
    }

    /**
     * @param bankName setting the name of the bank
     */
    public void setBankName(String bankName)
    {
        this.bankName = bankName;
    }

    /**
     * @return the getter of the bank name
     */
    public String getBankName()
    {
        return bankName;
    }

    /**
     * @param accounts adding the account to the bank account
     */
    public void addAccount(BankAccount accounts)
    {
        bankAccounts.put(accounts.getAccountNumber(), accounts);
    }

    /**
     * @param accountNumber is getting the account number
     * @return is returning the bank account based on the account number
     */
    public BankAccount getAccount(String accountNumber)
    {
        return bankAccounts.get(accountNumber);
    }

    /**
     * @param accountNumber is removing the bank account based on the account number
     */
    public void removeAccount(BankAccount accountNumber)
    {
        bankAccounts.remove(accountNumber);
    }

    /**
     * @return is getting the number of bank accounts that the bank has
     */
    public int getNumberOfAccounts()
    {
        return bankAccounts.size();
    }

    /**
     * @return is getting the total balance based on the total number of bank accounts the bank has
     */
    public double getTotalAccountsBalance()
    {
        double totalCdn = 0.0;
        Set <String> keys = bankAccounts.keySet();
        for(String key: keys)
        {
            totalCdn+=bankAccounts.get(key).getBalanceCdn();
        }
        return totalCdn;
    }

    /**
     * @param amountCdn is getting the amount in Canadian dollars from one account then depositing it to another
     *                  account based on its account number
     * @param accountNumber is getting the account number that the user wants to deposit the amount in Canadian to
     */
    public void depositTo(final double amountCdn, final String accountNumber)
    {
        bankAccounts.get(accountNumber).deposit(amountCdn);
    }

    /**
     * printing out the bank account information based on each bank account and another sentence based on the
     * total account balances
     */
    public void printAllCustomerData()
    {
        SortedSet<String> account = new TreeSet<String>(bankAccounts.keySet());
        for(String key: account)
        {
            System.out.println(String.format("Customer %s%s has $%.2f in account #%s",
                    bankAccounts.get(key).getMemberLastName().substring(0,1).toUpperCase(),
                    bankAccounts.get(key).getMemberLastName().substring(1),
                    bankAccounts.get(key).getBalanceCdn(),
                    bankAccounts.get(key).getAccountNumber()));
        }
        System.out.println(String.format("Total bank balance in all accounts for %s is %s", bankName, getTotalAccountsBalance()));
    }
}
