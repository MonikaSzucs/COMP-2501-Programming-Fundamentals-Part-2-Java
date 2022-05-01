package ca.bcit.comp2501.lab2a.monikaszucsandparhammehrgan;

/**
 * BankAccount.java
 * COMP 2501 - CRN 67139 - Wednesday Evenings, Sprint/Summer 2022
 * Lab #2a
 *
 * @authors Monika Szucs
 * @author Parham Mehrgan
 * @version 1.0
 *
 * Define a bank account class with balance (Canadian dollars), account number, and member last name properties.
 */
class BankAccount {
    private double balanceCdn;
    private final String accountNumber;
    private final String memberLastName;

    /**
     * Bank account for the object constructor
     *
     * @param balanceCdn getting the balance of a bank account in Canadian dollars and in a double format
     * @param accountNumber getting the account id for the individual in String format
     * @param memberLastName getting the customers last name in String format
     */
    BankAccount(final double balanceCdn, final String accountNumber, final String memberLastName)
    {
        this.balanceCdn = balanceCdn;
        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
    }

    /**
     * Set the account balance in Canadian dollars (CAD)
     *
     * @param balanceCdn setting the balance of the account in Canadian dollars (CAD)
     */
    public void setBalanceCdn(final double balanceCdn)
    {
        this. balanceCdn = balanceCdn;
    }

    /**
     * Get the account balance in Canadian dollars
     *
     * @return getting and returning the balance of the account in Canadian dollars (CAD)
     */
    public double getBalanceCdn()
    {
        return balanceCdn;
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
     * @param amountCdn withdrawing the amount in canadian dollars from the individuals balance in Canadian dollars
     */
    public void withdraw(final double amountCdn)
    {
        balanceCdn -= amountCdn;
    }

    /**
     * Depositing an amount in Canadian dollars (CAD) to an account
     *
     * @param amountCdn depositing a Canadian dollar amount in an individuals account balance
     */
    public void deposit(final double amountCdn)
    {
        balanceCdn += amountCdn;
    }

    /**
     * Working the transfer of funds to another account.
     *
     * @param amountCdn         getting the amount in Canadian dollars (CAD) that will be used to deposit in the recipients account and
     *                          withdraw what was taken out of the senders account
     * @param recipientAccount  The bank account that will receive the transfer amount in Canadian dollars (CAD)
     */
    public void transfer(final double amountCdn, final BankAccount recipientAccount)
    {
        recipientAccount.deposit(amountCdn);
        withdraw(amountCdn);
    }
}
