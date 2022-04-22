package ca.bcit.comp2501.lab2b.monikaszucsparhammehrgan;

import java.util.ArrayList;
import java.util.HashMap;



public class Calendar {

    private ArrayList<Integer> years;
    private String[] months;
    private ArrayList<Integer> days;
    HashMap<String, Date> dates;

    public Calendar(ArrayList<Integer> date)
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


    }


}
