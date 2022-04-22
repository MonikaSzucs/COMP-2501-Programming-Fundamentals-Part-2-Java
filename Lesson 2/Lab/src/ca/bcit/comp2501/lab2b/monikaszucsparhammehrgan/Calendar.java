package ca.bcit.comp2501.lab2b.monikaszucsparhammehrgan;

import ca.bcit.comp2501.lab2a.monikaszucsparhammehrgan.BankAccount;

import java.util.ArrayList;
import java.util.HashMap;

public class Calendar {
    private ArrayList<Integer> years;
    private String[] month;
    private ArrayList<Integer> days;
    HashMap<String, Date> dates;

    public Calendar()
    {
        years = new ArrayList<>();

        years.add(1);
    }
}
