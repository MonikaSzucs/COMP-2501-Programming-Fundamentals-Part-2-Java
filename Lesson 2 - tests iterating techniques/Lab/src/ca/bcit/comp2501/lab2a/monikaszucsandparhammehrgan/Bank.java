package ca.bcit.comp2501.lab2a.monikaszucsandparhammehrgan;

import java.util.*;

/**
 *  Bank.java
 *  COMP 2501 - CRN 67139 - Wednesday Evenings, Sprint/Summer 2022
 *  Lab #2a
 *
 * @authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 *
 * Define a bank class with parameters, constructor with getters and setters
 */
class Bank {
    private final String                bankName;
    private Map<String, BankAccount>    bankAccounts;

    /** Constructor
     *
     * Constructor for the Bank
     *
     * @param bankName the name of the bank and new HashMap for storing/accessing bankAccounts
     */
    Bank(final String bankName)
    {
        this.bankName   = bankName;
        bankAccounts    = new HashMap<>();
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

    /** Methods we used for maps
     * Removing the customers account number from the BankAccount HashMap
     *
     * @param accountNumber is the bank account associated to the account number
     */
    public void removeAccount(final BankAccount accountNumber)
    {
        bankAccounts.remove(accountNumber);
    }

    /**
     * Adding/putting the bank account numbers into the BankAccount HashMap
     *
     * @param accounts adding the account to the bank account
     */
    public void addAccount(final BankAccount accounts)
    {
        bankAccounts.put(accounts.getAccountNumber(), accounts);
    }

    /**
     * Get the account number from the BankAccounts HashMap
     *
     * @param accountNumber is the customer's account number
     * @return the bank account based on the account number
     */
    public BankAccount getAccount(final String accountNumber)
    {
        return bankAccounts.get(accountNumber);
    }

    /**
     * Get the size of the HashMap(i.e. Number of accounts in the bankAccount HashMap
     *
     * @return size/number of bank accounts that the bank has
     */
    public int getNumberOfAccounts()
    {
        return bankAccounts.size();
    }

    /**
     * Get the total account balance from all accounts stored in the bankAccounts Hashmap
     *
     * @return totalCdn the total balance based on the total number of bank accounts the bank has
     */
    public double getTotalAccountsBalance()
    {
        double totalCdn = 0.0;
        Set<String> allBankAccounts = bankAccounts.keySet();
        for(String singleBankAccount: allBankAccounts)
        {
            totalCdn += bankAccounts.get(singleBankAccount).getBalanceCdn();
        }
        return totalCdn;
    }

    /**
     * Depositing a Canadian dollar amount to a designated destination account number
     *
     * @param amountCdn is getting the amount in Canadian dollars from one account then depositing it to another
     *                  account based on its account number
     * @param accountNumber is getting the account number that the user wants to deposit the amount into
     */
    public void depositTo(final double amountCdn, final String accountNumber)
    {
        bankAccounts.get(accountNumber).deposit(amountCdn);
    }

    /**
     * Printing all the customer's data from the stored BankAccount HashMap
     *
     * based on each individual bank account
     * and
     * the total account balances in all accounts
     */
    public void printAllCustomerData()
    {
        SortedSet<String> accounts = new TreeSet<String>(bankAccounts.keySet());
        for(String account: accounts)
        {
            System.out.println(String.format("Customer %s%s has $%.2f in account #%s",
                    bankAccounts.get(account).getMemberLastName().substring(0,1).toUpperCase(),
                    bankAccounts.get(account).getMemberLastName().substring(1),
                    bankAccounts.get(account).getBalanceCdn(),
                    bankAccounts.get(account).getAccountNumber())
            );
        }
        System.out.println(String.format("Total bank balance in all accounts for %s is %s", bankName, getTotalAccountsBalance()));
    }
}
