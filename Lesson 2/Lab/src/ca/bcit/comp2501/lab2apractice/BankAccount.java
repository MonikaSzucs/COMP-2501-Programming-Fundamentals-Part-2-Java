package ca.bcit.comp2501.lab2apractice;

public class BankAccount {
    private double balanceCdn;
    private String accountNumber;
    private String lastName;

    public BankAccount(final double balanceCdn, final String accountNumber, final String lastName)
    {
        this.balanceCdn= balanceCdn;
        this.accountNumber=accountNumber;
        this.lastName = lastName;
    }

    public void setBalanceCdn(final double balanceCdn)
    {
        this.balanceCdn = balanceCdn;
    }

    public double getBalanceCdn()
    {
        return balanceCdn;
    }

    public void setAccountNumber(final String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setLastName(final String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void withdraw(final double amountCdn)
    {
        balanceCdn -= amountCdn;
    }

    public void deposit(final double amountCdn)
    {
        balanceCdn += amountCdn;
    }

    public void transfer(final double amountCdn, final BankAccount recipientAccount)
    {
        recipientAccount.deposit(amountCdn);
        withdraw(amountCdn);
    }
}
