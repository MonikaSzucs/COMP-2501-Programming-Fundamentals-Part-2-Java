package ca.bcit.comp2501.lab2apractice;

public class Main {
    public static void main(final String[] args)
    {
        Bank bank1 = new Bank("Bank of Kanada");

        BankAccount account1 = new BankAccount(100.0, "abc111", "woods");
        BankAccount account2 = new BankAccount(200.0, "def222", "gates");
        BankAccount account3 = new BankAccount(300.0, "ghi333", "bezos");
        BankAccount account4 = new BankAccount(400.0, "jkl444", "zuckerberg");


    }
}
