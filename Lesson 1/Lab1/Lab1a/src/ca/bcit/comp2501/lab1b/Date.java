package ca.bcit.comp2501.lab1b;

public class Date {
    // Properties
    private int year;
    private int month;
    private int day;

    // constructor
    Date(int year, final int month, final int day)
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

    // Setter for Month
    public void setMonth(int month)
    {
        this.month = month;
    }

    // Setter for Day
    public void setDay(int day)
    {
        this.day = day;
    }

    // Getter
    public String getYyMmDd()
    {
        return Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
    }
}
