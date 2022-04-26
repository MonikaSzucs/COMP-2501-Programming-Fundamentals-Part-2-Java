package ca.bcit.comp2501.lab2a.monikaszucsandparhammehrgan;

/**
 * @Authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 */
public class BankAccount {
    private double balanceCdn;
    private String accountNumber;
    private String memberLastName;

    /**
     * @param balanceCdn getting the balance of a bank account in Canadian dollars and in a double format
     * @param accountNumber getting the account id for the individual in String format
     * @param memberLastName getting the customers last name in String format
     */
    public BankAccount(final double balanceCdn, final String accountNumber, final String memberLastName)
    {
        this.balanceCdn = balanceCdn;
        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
    }

    /**
     * @param balanceCdn setting the balance of the account in Canadian dollars
     */
    public void setBalanceCdn(double balanceCdn)
    {
        this. balanceCdn = balanceCdn;
    }

    /**
     * @return getting and returning the balance of the account in Canadian dollars
     */
    public double getBalanceCdn()
    {
        return balanceCdn;
    }

    /**
     * @param accountNumber setting the account number
     */
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the account number
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * @param memberLastName is setting the members last name
     */
    public void setMemberLastName(String memberLastName)
    {
        this.memberLastName = memberLastName;
    }

    /**
     * @return the members last name
     */
    public String getMemberLastName()
    {
        return memberLastName;
    }

    /**
     * @param amountCdn withdrawing the amount in canadian dollars from the individuals balance in Canadian dollars
     */
    public void withdraw(final double amountCdn)
    {
        balanceCdn-=amountCdn;
    }

    /**
     * @param amountCdn depositing a Canadian dollar amount in an individuals account balance
     */
    public void deposit(final double amountCdn)
    {
        balanceCdn+=amountCdn;
    }

    /**
     * @param amountCdn getting the amount in Canadian that will be used to deposit in the recipients account and
     *                  withdraw what was taken out of the senders account
     * @param recipientAccount
     */
    public void transfer(final double amountCdn, final BankAccount recipientAccount)
    {
        recipientAccount.deposit(amountCdn);
        withdraw(amountCdn);
    }
}
