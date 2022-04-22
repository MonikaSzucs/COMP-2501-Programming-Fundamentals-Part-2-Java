package ca.bcit.comp2501.lab2b.monikaszucsparhammehrgan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Calendar {

    private ArrayList<Integer> years;
    private String[] months;
    private ArrayList<Integer> days;
    private HashMap<String, Date> dates;



    public Calendar()
    {
        int yearStart = 1910;
        int yearEnd = 2026;
        years = new ArrayList<Integer>(yearStart);


        for(int i = yearStart; i < yearEnd; i++){
            years.add(i);
        }
        System.out.println(years);

        months = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        if(months != null)
        {
            for(int j = 0; j < months.length; j++)
            {
                if(months[j] != null)
                {
                    System.out.println(months[j]);
                }
            }
        }

        int dayStart = 1;
        int dayEnd = 31;
        days = new ArrayList<Integer>(dayStart);
        for(int k = dayStart; k < dayEnd; k++){
            days.add(k);
        }
        System.out.println(days);


        if(years != null)
        {
            for(int year : years)
            {
                if(year >= yearStart && year <= yearEnd)
                {
                    System.out.println(year);
                    int monthPos = 0;
                    if(months != null)
                    {
                        for(int i = monthPos; i < months.length; i++ )
                        {
                            if(months[i] != null)
                            {
                                System.out.println(months[i]);

                                if(days != null)
                                {
                                    Iterator<Integer> it = days.iterator();
                                    int uniqueKey = 1;
                                    while(it.hasNext())
                                    {
                                        Integer day = it.next();
                                        if(day != null)
                                        {
                                            System.out.println(day);
                                            Date dateAdded = new Date(year, months[i], day);
                                            dates.put(String.valueOf(uniqueKey), dateAdded);
                                            uniqueKey+=1;
                                        }
                                    }
                                }
                            }
                        }
                        monthPos += 1;
                    }
                }
            }
        }
        //System.out.println(dates);

    }

    public void printCalendar()
    {
        //System.out.println(getDate());

        Set<String> keys = dates.keySet();
        for(String key: keys)
        {
            Date date = dates.get(key);
            System.out.println("st #" + date + " is " + date.getDate());
        }
    }


}
