// package name must all be lowercase - must be unique, meaningful, reverse domain name, no uppercase
package ca.bcit.comp2501.lab1a.monikaszucshenryyoung;

/**
 * @author Monika Szucs and Henry Young
 * @version 1.0
 */
public class BankAccount
{
    // Properties - always must be private no matter what!
    double balanceCdn;
    final String accountNumber;
    final String memberLastName;

    /**
     * @param balanceCdn the balance in canadian dollars
     * @param accountNumber the account number
     * @param memberLastName the last name of this account holder
     *
     * You want to make sure the constructors are all final because the data that is given to us is important
     * We do not want to change these values. Don't change the data if someone is telling us the amount
     */
    BankAccount(final double balanceCdn, final String accountNumber, final String memberLastName)
    {
        this.balanceCdn     = balanceCdn;
        this.accountNumber  = accountNumber;
        this.memberLastName = memberLastName;
    }

    /**
     * @param withdrawAmountCdn the amount in canadian dollars to withdraw from the balance
     */
    public void withdraw(final double withdrawAmountCdn)
    {
        balanceCdn -= withdrawAmountCdn;
    }

    /**
     * @param depositAmountCdn
     */
    public void deposit(final double depositAmountCdn)
    {
        balanceCdn += depositAmountCdn;
    }

    /**
     * @param amountCDN the amount the current holder wants to transfer over
     * @param recipientAccount the recipient who is receiving the money
     */
    public void transfer(final double amountCDN, final BankAccount recipientAccount)
    {
        balanceCdn -= amountCDN;
        recipientAccount.deposit(amountCDN);
    }
}
