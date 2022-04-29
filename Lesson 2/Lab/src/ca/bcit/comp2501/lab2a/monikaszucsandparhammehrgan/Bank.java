package ca.bcit.comp2501.lab2a.monikaszucsandparhammehrgan;

import java.util.*;

/**
 *  BankAccount.java
 *  COMP 2501 - CRN 67139 - Wednesday Evenings, Sprint/Summer 2022
 *  Lab #2a
 *
 * @Authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 *
 * Define a bank class with the bank name and setting up a map for bank accounts
 */
class Bank {
    private final String bankName;
    private Map<String, BankAccount> bankAccounts;

    /**
     * Bank for the object constructor
     *
     * @param bankName the name of the bank and setting up a HashMap for the BankAccounts
     */
    Bank(final String bankName)
    {
        this.bankName = bankName;
        bankAccounts = new HashMap<>();
    }

    /**
     * Get the bank name
     *
     * @return the getter of the bank name
     */
    public String getBankName()
    {
        return bankName;
    }

    /**
     * Adding the bank account numbers into the BankAccount object
     *
     * @param accounts adding the account to the bank account
     */
    public void addAccount(final BankAccount accounts)
    {
        bankAccounts.put(accounts.getAccountNumber(), accounts);
    }

    /**
     * Get the account number from the BankAccounts object
     *
     * @param accountNumber is getting the account number
     * @return is returning the bank account based on the account number
     */
    public BankAccount getAccount(final String accountNumber)
    {
        return bankAccounts.get(accountNumber);
    }

    /**
     * Removing the associate account number from the BankAccount object
     *
     * @param accountNumber is removing the bank account based on the account number
     */
    public void removeAccount(final BankAccount accountNumber)
    {
        bankAccounts.remove(accountNumber);
    }

    /**
     * Get the number of accounts from bankAccounts
     *
     * @return is getting the number of bank accounts that the bank has
     */
    public int getNumberOfAccounts()
    {
        return bankAccounts.size();
    }

    /**
     * Get the total account balance from all accounts stored in the bank
     *
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
     * Depositing a Canadian amount to a designated account number
     *
     * @param amountCdn is getting the amount in Canadian dollars from one account then depositing it to another
     *                  account based on its account number
     * @param accountNumber is getting the account number that the user wants to deposit the amount in Canadian to
     */
    public void depositTo(final double amountCdn, final String accountNumber)
    {
        bankAccounts.get(accountNumber).deposit(amountCdn);
    }

    /**
     * Printing all the customer's data from the stored BankAccount object
     *
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
