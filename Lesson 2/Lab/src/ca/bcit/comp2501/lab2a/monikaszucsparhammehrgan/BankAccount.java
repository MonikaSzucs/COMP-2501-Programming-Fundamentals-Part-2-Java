package ca.bcit.comp2501.lab2a.monikaszucsparhammehrgan;
public class BankAccount {
    // properties
    private double bankAmount;
    private String accountId;
    private String lastName;

    public BankAccount(final double bankAmount, final String accountId, final String lastName)
    {
        this.bankAmount = bankAmount;
        this.accountId = accountId;
        this.lastName = lastName;
    }

    public void setBankAmount(final double bankAmount)
    {
        this.bankAmount = bankAmount;
    }

    public double getBankAmount()
    {
        return bankAmount;
    }

    public void setAccountId(final String accountId)
    {
        this.accountId = accountId;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setLastName(final String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void withdraw(final double withdrawAmountCnd)
    {
        bankAmount -= withdrawAmountCnd;
    }

    public void deposit(final double depositedAmountCnd)
    {
        bankAmount += depositedAmountCnd;
    }

    public void transfer(final double amountCnd, final BankAccount recipientAccount)
    {
        bankAmount -= amountCnd;
        recipientAccount.deposit(amountCnd);
    }

}
