package ca.bcit.comp2501.lab2a.practice1;

public class BankAccount
{
    private double amount;
    private String accountId;
    private String customerLastName;

    public BankAccount(final double amount, final String accountId, final String customerLastName)
    {
        this.amount = amount;
        this.accountId = accountId;
        this.customerLastName = customerLastName;
    }


}
