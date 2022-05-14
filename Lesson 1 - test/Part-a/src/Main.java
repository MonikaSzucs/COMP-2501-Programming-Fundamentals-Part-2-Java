public class Main {
    public static void main(final String[] args) {
        BankAccount bank1;
        bank1 = new BankAccount(100, "abc123", "gates");

        BankAccount bank2;
        bank2 = new BankAccount(500, "xyz789", "woods");

        System.out.println(bank1.balanceCdn);
        bank1.withdraw(5.00);
        System.out.println(bank1.accountNumber);
        System.out.println(bank1.balanceCdn);

        System.out.println("---");

        System.out.println(bank2.balanceCdn);
        bank2.deposit(23.00);
        System.out.println(bank2.memberLastName);
        System.out.println(bank2.balanceCdn);

        System.out.println("---");

        bank1.transfer(50.00, bank2);
        System.out.println(bank1.balanceCdn);
        System.out.println(bank2.balanceCdn);

    }
}
