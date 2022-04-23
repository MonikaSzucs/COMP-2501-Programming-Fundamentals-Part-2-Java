package ca.bcit.comp2501.lab2a.practice1;

public class BankAccount
{
    private double balanceCdn;
    private String accountId;
    private String customerLastName;

    public BankAccount(final double balanceCdn, final String accountId, final String customerLastName)
    {
        this.balanceCdn = balanceCdn;
        this.accountId = accountId;
        this.customerLastName = customerLastName;
    }

    public void setBalanceCdn(double balanceCdn)
    {
        this.balanceCdn = balanceCdn;
    }

    public double getBalanceCdn()
    {
        return balanceCdn;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setCustomerLastName(String customerLastName)
    {
        this.customerLastName = customerLastName;
    }

    public String getCustomerLastName()
    {
        return customerLastName;
    }

    public void withdraw(final double withdrawAmount)
    {
        balanceCdn -= withdrawAmount;
    }

    public void deposit(final double depositAmount)
    {
        balanceCdn += depositAmount;
    }

    public void transfer(final double amountCdn, final BankAccount recipientAccount)
    {
        recipientAccount.deposit(amountCdn);
        withdraw(amountCdn);
    }

}
