package ca.bcit.comp2501.lab2b.practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Calendar
{
    private ArrayList<Integer> years;
    private String[] months;
    private ArrayList<Integer> days;
    HashMap<Integer, Date> dates = new HashMap<>();

    public Calendar()
    {
        int yearsStart = 1910;
        int yearsEnd = 2025;
        years = new ArrayList<>();
        for(int i = yearsStart; i<=yearsEnd; i++)
        {
            years.add(i);
        }

        System.out.println(years);

        int monthStart = 0;
        int monthEnd = 12;
        months = new String[] {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"};

        System.out.println(months);

        int dayStart = 1;
        int dayEnd = 30;
        days = new ArrayList<>();
        for(int j = dayStart; j <= dayEnd; j++)
        {
            days.add(j);
        }
        System.out.println(days);

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
