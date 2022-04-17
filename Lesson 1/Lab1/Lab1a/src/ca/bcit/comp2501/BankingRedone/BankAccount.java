package ca.bcit.comp2501.BankingRedone;

public class BankAccount {
    // Properties
    double balanceCDN;
    String accountNumber;
    String lastName;

    // Constructor
    BankAccount(double balanceCDN, String accountNumber, String lastName)
    {
        this.balanceCDN = balanceCDN;
        this.accountNumber = accountNumber;
        this.lastName = lastName;
    }

    // Setter
    public void setBalanceCDN(double balanceCDN)
    {
        this.balanceCDN = balanceCDN;
    }

    // Getter
    public double getBalanceCDN()
    {
        return balanceCDN;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void withdraw(double withdrawn)
    {
        balanceCDN-=withdrawn;
    }

    public void deposit(double deposited)
    {
        balanceCDN+=deposited;
    }

    public void transfer(double transferred, BankAccount accountDeposited)
    {
        withdraw(transferred);
        accountDeposited.deposit(transferred);
    }
}
