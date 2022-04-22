package ca.bcit.comp2501.lab2b.monikaszucsparhammehrgan;

import ca.bcit.comp2501.lab2a.monikaszucsparhammehrgan.Bank;
import ca.bcit.comp2501.lab2a.monikaszucsparhammehrgan.BankAccount;

import java.util.ArrayList;

public class Main {
    public static void main(final String[] args)
    {
        ArrayList<Integer> Date = null;
        Calendar scheduled = new Calendar(Date);

        Date event = new Date(2021, "December", 25);
        System.out.println(event.getDate());

    }
}
