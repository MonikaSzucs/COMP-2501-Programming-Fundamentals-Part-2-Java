package ca.bcit.comp2501.lab2b.monikaszucsparhammehrgan;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Calendar {

    private ArrayList<Integer> years;
    private String[] months;
    private ArrayList<Integer> days;
    HashMap<Integer, Date> dates = new HashMap<>();

    public Calendar() {
        int yearStart = 1910;
        int yearEnd = 2026;
        years = new ArrayList<Integer>();
        for (int i = yearStart; i < yearEnd; i++) {
            years.add(i);

        }

        int dayStart = 1;
        int dayEnd = 31;
        days = new ArrayList<Integer>();
        for (int k = dayStart; k < dayEnd; k++) {
            days.add(k);
        }

        months = new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        int count = 1;

        for (int year : years) {
            for (int month = 0; month < 12; month++) {
                Iterator itr = days.iterator();
                while (itr.hasNext()) {
                    Date d = new Date(year, months[month], (int) itr.next());

                    dates.put(count, d);
                    count++;
                }
            }
        }


        Set<Integer> keys = dates.keySet();
        for(Integer key: keys)
        {
            Date date = dates.get(key);
            System.out.println(key + ": " +
                    date.getDate()
            );
        }

    }

    public void printCalendar () {
        for (int i:dates.keySet()) {
            System.out.println(i + ": " + dates.get(i).getDate());
        }
    }
}
