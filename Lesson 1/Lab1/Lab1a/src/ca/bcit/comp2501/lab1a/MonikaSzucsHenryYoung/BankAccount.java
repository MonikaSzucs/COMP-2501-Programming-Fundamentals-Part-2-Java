package ca.bcit.comp2501.lab1a.MonikaSzucsHenryYoung;

/**
 * @ author Monika Szucs and Henry Young
 */

public class BankAccount
{
    // Properties
    private double balanceCdn;
    private final String accountNumber;
    private final String memberLastName;

    // constructor
    BankAccount(final double balanceCdn, final String accountNumber, final String memberLastName)
    {
        this.balanceCdn     = balanceCdn;
        this.accountNumber  = accountNumber;
        this.memberLastName = memberLastName;
    }

    // Method to calculate withdrawal
    public void withdraw(final double withdrawAmountCdn)
    {
        balanceCdn -= withdrawAmountCdn;
    }

    // Method to calculate deposit
    public void deposit(final double depositAmountCdn)
    {
        balanceCdn += depositAmountCdn;
    }

    // Method to transfer funds from bank1 to bank2
    public void transfer(final double amountCDN, final BankAccount recipientAccount)
    {
        balanceCdn -= amountCDN;
        recipientAccount.deposit(amountCDN);
    }
}
