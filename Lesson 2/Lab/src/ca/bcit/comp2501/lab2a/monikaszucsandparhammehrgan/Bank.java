package ca.bcit.comp2501.lab2a.monikaszucsandparhammehrgan;

import java.util.HashMap;
import java.util.Set;

/**
 * @Authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 */
public class Bank
{
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
        bankAccounts.put(accounts.getAccountId(), accounts);
    }

    /**
     * @param accountNumber is getting the account number
     * @return is returninng the bank account based on the account number
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
        Set<String> keys = bankAccounts.keySet();
        for(String key: keys)
        {
            totalCdn += bankAccounts.get(key).getBalanceCdn();
        }
        return totalCdn;
    }

    /**
     * @param amountCdn is getting the amount in Canadian dollars from one account then depositing it to another
     *                  account based on its account number
     * @param accountNum is getting the account number that the user wants to deposit the amount in Canadian to
     */
    public void depositTo(double amountCdn, String accountNum)
    {
        bankAccounts.get(accountNum).deposit(amountCdn);
    }

    /**
     * printing out the bank account information based on each bank account and another sentence based on the
     * total account balances
     */
    public void printAllCustomerData()
    {
        Set<String> account = bankAccounts.keySet();
        for(String key: account)
        {
            System.out.println(String.format("Customer %s has $%.2f in account #%s", bankAccounts.get(key).getCustomerLastName(), bankAccounts.get(key).getBalanceCdn(), bankAccounts.get(key).getAccountId()));
        }
        System.out.println(String.format("The total balance in all accounts for %s is %.2f", bankName, getTotalAccountsBalance()));
    }
}
