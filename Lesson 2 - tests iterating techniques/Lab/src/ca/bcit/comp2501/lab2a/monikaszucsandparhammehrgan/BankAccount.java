package ca.bcit.comp2501.lab2a.monikaszucsandparhammehrgan;

/**
 * BankAccount.java
 * COMP 2501 - CRN 67139 - Wednesday Evenings, Sprint/Summer 2022
 * Lab #2a
 *
 * @authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 *
 * Define a bank account class with balance (Canadian dollars), account number, and member last name properties.
 */
class BankAccount {
    private double          balanceCdn;
    private final String    accountNumber;
    private final String    memberLastName;

    /** Constructor
     *
     * @param balanceCdn getting the balance of a bank account in Canadian dollars (double)
     * @param accountNumber the account number assigned to the customer (String)
     * @param memberLastName the customer's last name (String)
     */
    BankAccount(final double balanceCdn, final String accountNumber, final String memberLastName)
    {
        this.balanceCdn     = balanceCdn;
        this.accountNumber  = accountNumber;
        this.memberLastName = memberLastName;
    }

    /**
     * Get the account balance in Canadian dollars
     *
     * @return the balance of the account in Canadian dollars
     */
    public double getBalanceCdn()
    {
        return balanceCdn;
    }

    /**
     * Set the account balance in Canadian dollars
     *
     * @param balanceCdn setting the balance of the account in Canadian dollars
     */
    public void setBalanceCdn(final double balanceCdn)
    {
        this. balanceCdn = balanceCdn;
    }

    /**
     * get the Account Number
     *
     * @return the account number
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * Get the member last name
     *
     * @return the members last name
     */
    public String getMemberLastName()
    {
        return memberLastName;
    }

    /**
     *
     * @param amountCdn withdrawing the amount in Canadian dollars
     */
    public void withdraw(final double amountCdn)
    {
        balanceCdn -= amountCdn;
    }

    /**
     * Depositing an amount in Canadian dollars to an account
     *
     * @param amountCdn the amount in Canadian dollars
     */
    public void deposit(final double amountCdn)
    {
        balanceCdn += amountCdn;
    }

    /**
     * Transferring funds to another account (recipient's account)
     *
     * @param amountCdn getting the amount in Canadian dollars that will be used to deposit in the recipients account and
     *                          withdraw what was taken out of the senders account
     * @param recipientAccount The bank account that will receive the transfer amount in Canadian dollars
     */
    public void transfer(final double amountCdn, final BankAccount recipientAccount)
    {
        recipientAccount.deposit(amountCdn);
        withdraw(amountCdn);
    }
}
