package practice1;

public class Main {
    public static void main(final String[] args)
    {
        Bank bank = new Bank("Bank of Kanada");

        BankAccount account1;
        BankAccount account2;
        BankAccount account3;
        BankAccount account4;

        account1 = new BankAccount(100.0, "abc111", "woods");
        account2 = new BankAccount(200.0, "def222", "gates");
        account3 = new BankAccount(300.0, "ghi333", "bezos");
        account4 = new BankAccount(400.0, "jkl444", "zuckerberg");

        bank.depositTo(22.22, "def222");
        bank.getAccount("abc111")
                .transfer(5.00, bank.getAccount("ghi333"));
        bank.printAllCustomerData();

    }
}
