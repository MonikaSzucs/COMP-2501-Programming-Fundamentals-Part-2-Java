package ca.bcit.comp2501.lab1b.MonikaSzucsHenryYoung;

/**
 * @ author Monika Szucs and Henry Young
 */

public class Date {
    // Properties
    private String month;
    private int day;
    private int year;

    // Constructor
    public Date(final String month, final int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setter for Year
    public void setYear(int year)
    {
            this.year = year;
    }

    // Getter for Year and checking to make sure it is between 0 and 2022
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
    public void setMonth(String month)
    {
            this.month = month;
    }

    // Getter for Month is checking if the month is between 1 and 12 inclusive
    public int getMonth()
    {
        if(month=="January" || month=="january"){
            return 1;
        } else if (month=="February" || month=="february"){
            return 2;
        } else if (month=="March" || month=="march") {
            return 3;
        } else if (month=="April" || month=="april") {
            return 4;
        } else if (month=="May" || month=="may") {
            return 5;
        } else if (month=="June" || month=="june") {
            return 6;
        } else if (month=="July" || month=="jul") {
            return 7;
        } else if (month=="August" || month=="august") {
            return 8;
        } else if (month=="September" || month=="september") {
            return 9;
        } else if (month=="October" || month=="october") {
            return 10;
        } else if (month=="November" || month=="november") {
            return 11;
        } else if (month=="December" || month=="december") {
            return 12;
        } else {
            return 0;
        }
    }

    // Setter for Day
    public void setDay(int day)
    {
        this.day = day;
    }

    // Getter for Day checking if it is between 0 and 31 inclusive
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

    // Getter for the Year, Month and Day and/or inserting an error if needed.
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
