package ca.bcit.comp2501.lab1a.MonikaSzucsHenryYoung;

/**
 * @ author Monika Szucs and Henry Young
 */

public class BankAccount
{
    // Properties
    double balanceCDN;
    final String accountNumber;
    final String memberLastName;

    // constructor
    BankAccount(double balanceCDN, final String accountNumber, final String memberLastName)
    {
        this.balanceCDN = balanceCDN;
        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
    }

    // Method to calculate withdrawal
    public void withdraw(double withdrawAmount)
    {
        balanceCDN -= withdrawAmount;
    }

    // Method to calculate deposit
    public void deposit(double depositAmount)
    {
        balanceCDN += depositAmount;
    }

    // Method to transfer funds from bank1 to bank2
    public void transfer(final double amountCDN, final BankAccount recipientAccount)
    {
        balanceCDN -= amountCDN;
        recipientAccount.deposit(amountCDN);
    }
}
