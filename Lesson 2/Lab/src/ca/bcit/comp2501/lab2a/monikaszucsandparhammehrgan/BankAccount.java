package ca.bcit.comp2501.lab2a.monikaszucsandparhammehrgan;

/**
 * @Authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 */
public class BankAccount
{
    private double balanceCdn;
    private String accountId;
    private String customerLastName;

    /**
     * @param balanceCdn getting the balance of a bank account in Canadian dollars and in a double format
     * @param accountId getting the account id for the individual in String format
     * @param customerLastName getting the customers last name in String format
     */
    public BankAccount(final double balanceCdn, final String accountId, final String customerLastName)
    {
        this.balanceCdn = balanceCdn;
        this.accountId = accountId;
        this.customerLastName = customerLastName;
    }

    /**
     * @param balanceCdn setting the balance of the account in Canadian dollars
     */
    public void setBalanceCdn(double balanceCdn)
    {
        this.balanceCdn = balanceCdn;
    }

    /**
     * @return getting and returning the balance of the account in Canadian dollars
     */
    public double getBalanceCdn()
    {
        return balanceCdn;
    }

    /**
     * @param accountId setting that account ID
     */
    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    /**
     * @return getting and then returning the account ID
     */
    public String getAccountId()
    {
        return accountId;
    }

    /**
     * @param customerLastName setting the customers last name
     */
    public void setCustomerLastName(String customerLastName)
    {
        this.customerLastName = customerLastName;
    }

    /**
     * @return getting and then returning the customers last name
     */
    public String getCustomerLastName()
    {
        return customerLastName;
    }

    /**
     * @param withdrawAmount withdrawing (subtracting) an amount from an account in Canadian dollars
     */
    public void withdraw(final double withdrawAmount)
    {
        balanceCdn -= withdrawAmount;
    }

    /**
     * @param depositAmount depositing (adding) an amount from an account in Canadian dollars
     */
    public void deposit(final double depositAmount)
    {
        balanceCdn += depositAmount;
    }

    /**
     * @param amountCdn determining the amount in Canadian dollars that will be used to transfer over to the
     *                  recipients account
     * @param recipientAccount another account that a user wants to send the money to
     */
    public void transfer(final double amountCdn, final BankAccount recipientAccount)
    {
        recipientAccount.deposit(amountCdn);
        withdraw(amountCdn);
    }
}
