package ca.bcit.comp2501.lab1b;

/**
 * @ author Monika Szucs and Henry Young
 */

public class Date {
    // Properties
    private int year;
    private int month;
    private int day;

    // constructor
    public Date(int year, final int month, final int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Setter for Year
    public void setYear(int year)
    {
            this.year = year;
    }

    // Getter for Year
    public int getYear()
    {
        if(year<0 || year > 2022){
            System.out.println("Year is less than zero or greater than 2022");
            return 0;
        }
        else {
            return year;
        }
    }

    // Setter for Month
    public void setMonth(int month)
    {
            this.month = month;
    }

    // Getter for Month
    public int getMonth()
    {
        if(month<=0 || month > 12){
            System.out.println("Month is less than or equal to zero or greater than 12");
            return 0;
        }
        else {
            return month;
        }
    }

    // Setter for Day
    public void setDay(int day)
    {
        this.day = day;
    }

    // Getter for Day
    public int getDay()
    {
        if(day<=0 || day > 31){
            System.out.println("day is less than or equal to zero or greater than 31");
            return 0;
        }
        else {
            return day;
        }
    }

    // Getter for the Year, Month and Day
    public String getYyMmDd()
    {
        if (getYear()==0)
        {
            return "ERROR FOR YEAR -" + Integer.toString(getMonth()) + "-" + Integer.toString(getDay());
        }
        else if (getMonth()==0)
        {
            return Integer.toString(getYear()) + "- ERROR FOR MONTH -" + Integer.toString(getDay());
        }
        else if (getDay()==0){
            return Integer.toString(getYear()) + "-" + Integer.toString(getMonth()) + "- ERROR FOR DAY";
        }
        else {
            return Integer.toString(getYear()) + "-" + Integer.toString(getMonth()) + "-" + Integer.toString(getDay());
        }
    }
}
