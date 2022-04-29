package ca.bcit.comp2501.lab2a.monikaszucsandparhammehrgan;

/**
 *  BankAccount.java
 *  COMP 2501 - CRN 67139 - Wednesday Evenings, Sprint/Summer 2022
 *  Lab #2a
 *
 * @Authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        Bank bank;
        BankAccount account1;
        BankAccount account2;
        BankAccount account3;
        BankAccount account4;

        bank = new Bank("Bank of Kanada");
        account1 = new BankAccount(100.0, "abc111", "woods");
        account2 = new BankAccount(200.0, "def222", "gates");
        account3 = new BankAccount(300.0, "ghi333", "bezos");
        account4 = new BankAccount(400.0, "jkl444", "zuckerberg");

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);

        bank.depositTo(22.22, "def222");
        bank.getAccount("abc111")
                .transfer(5.00, bank.getAccount("ghi333"));
        bank.printAllCustomerData();
    }
}
