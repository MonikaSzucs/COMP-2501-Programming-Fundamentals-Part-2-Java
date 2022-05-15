class BankAccount {
    public double balanceCdn;
    public final String accountNumber;
    public final String memberLastName;

    BankAccount(final double balanceCdn, final String accountNumber, final String memberLastName) {
        this.balanceCdn     = balanceCdn;
        this.accountNumber  = accountNumber;
        this.memberLastName = memberLastName;
    }

    public void setBalanceCdn(final double balanceCdn)
    {
        this.balanceCdn = balanceCdn;
    }

    public double getBalanceCdn() {
        return balanceCdn;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public void withdraw(final double amountCdn) {
        balanceCdn -= amountCdn;
    }

    public void deposit(final double amountCdn) {
        balanceCdn += amountCdn;
    }

    public void transfer(double amountCdn, BankAccount recipientAccount) {
        recipientAccount.deposit(amountCdn);
        withdraw(amountCdn);
    }

}
