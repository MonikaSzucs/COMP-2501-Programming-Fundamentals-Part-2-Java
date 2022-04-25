package ca.bcit.comp2501.lab2b.monikaszucsandparhammehrgan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @Authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 */
public class Calendar
{
    private ArrayList<Integer> years;
    private String[] months;
    private ArrayList<Integer> days;
    HashMap<Integer, Date> dates = new HashMap<>();

    /**
     * Creating an ArrayList that is called years with Integers from 1910 to 2025 (Integers)
     * Creating an Array called months with all 12 month names (String)
     * Creating an Array list called days with Integers from day 1 to 30 (Integers)
     * Creating a HashMap called dates with keys that have an Integer and value is a Date
     */
    public Calendar()
    {
        // Years using the ArrayList
        int yearsStart = 1910;
        int yearsEnd = 2025;
        years = new ArrayList<>();
        for(int i = yearsStart; i<=yearsEnd; i++)
        {
            years.add(i);
        }

        // Months using the Array
        int monthStart = 0;
        int monthEnd = 12;
        months = new String[] {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"};

        // Days using ArrayList
        int dayStart = 1;
        int dayEnd = 30;
        days = new ArrayList<>();
        for(int j = dayStart; j <= dayEnd; j++)
        {
            days.add(j);
        }

        // Creating a nested loop
        // for-each loop to iterate through the years
        // for loop to iterate though the months
        // iterator to iterate through the days
        int count = 1;
        if(years != null)
        {
            for(Integer year: years)
            {
                if(months != null)
                {
                    for(int k = monthStart; k < monthEnd; k++)
                    {
                        if(days != null)
                        {
                            Iterator<Integer> it = days.iterator();
                            while(it.hasNext())
                            {
                                Integer day = it.next();
                                if(day != null)
                                {
                                    Date d = new Date(year, months[k], day);
                                    dates.put(count, d);
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *  Printing out the calendar with the Month Day, Year format which loops though the keySet()
     */
    public void printCalendar()
    {
        Set<Integer> keys = dates.keySet();
        for(Integer key: keys)
        {
            Date date = dates.get(key);
            System.out.println(key + " " + date.getMonth() + " " + date.getDay() + ", " + date.getYear());
        }
    }
}
