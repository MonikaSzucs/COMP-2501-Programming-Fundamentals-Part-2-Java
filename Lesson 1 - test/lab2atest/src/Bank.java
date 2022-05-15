import java.util.*;

class Bank {
    private final String bankName;
    private  Map<String, BankAccount> bankAccount;

    Bank(final String bankName) {
        bankAccount = new HashMap<>();
        this.bankName = bankName;
    }

    public String getBankName()
    {
        return bankName;
    }

    public void addAccount(final BankAccount account) {
        bankAccount.put(account.getAccountNumber(), account);
    }

    public BankAccount getAccount(final String accountNumber) {
        return bankAccount.get(accountNumber);
    }

    public void removeAccount(final BankAccount accountNumber) {
        bankAccount.remove(accountNumber);
    }

    public int getNumberOfAccounts() {
        return bankAccount.size();
    }

    public double getTotalAccountsBalance() {
        double totalCdn = 0.0;
        Set<String> keys = bankAccount.keySet();
        for(String key: keys) {
            totalCdn += bankAccount.get(key).getBalanceCdn();
        }
        return totalCdn;
    }

    public void depositTo(final double amountCdn, final String accountNumber) {
        bankAccount.get(accountNumber).deposit(amountCdn);
    }

    public void printAllCustomerData() {
        SortedSet<String> accounts = new TreeSet<String>(bankAccount.keySet());
        for(String account: accounts) {
            System.out.println(String.format(
                    "Customer %s%s has $%.2f in account #%s",
                    bankAccount.get(account).getMemberLastName().charAt(0),
                    bankAccount.get(account).getMemberLastName().substring(1),
                    bankAccount.get(account).getBalanceCdn(),
                    bankAccount.get(account).getAccountNumber()
                    )
            );

        }
        System.out.println(String.format("Total bank balance in all accounts for %s is %.2f",
                bankName, getTotalAccountsBalance()
        ));
    }

}
