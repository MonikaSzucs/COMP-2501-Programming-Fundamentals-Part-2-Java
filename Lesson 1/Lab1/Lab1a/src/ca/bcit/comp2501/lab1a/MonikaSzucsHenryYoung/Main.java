package ca.bcit.comp2501.lab1a.MonikaSzucsHenryYoung;

/**
 * @ author Monika Szucs and Henry Young
 */

public class Main
{
    public static void main(final String[] args)
    {
        BankAccount bank1 = new BankAccount(100.00, "abc123", "gates");
        BankAccount bank2 = new BankAccount(500.00, "xyz789", "woods");

        System.out.println(bank1.balanceCDN);
        bank1.withdraw(5.00);
        System.out.println(bank1.accountNumber);
        System.out.println(bank1.balanceCDN);

        System.out.println("---");

        System.out.println(bank2.balanceCDN);
        bank2.deposit(23.00);
        System.out.println(bank2.memberLastName);
        System.out.println(bank2.balanceCDN);

        System.out.println("---");

        bank1.transfer(50.00, bank2);
        System.out.println(bank1.balanceCDN);
        System.out.println(bank2.balanceCDN);
    }
}
