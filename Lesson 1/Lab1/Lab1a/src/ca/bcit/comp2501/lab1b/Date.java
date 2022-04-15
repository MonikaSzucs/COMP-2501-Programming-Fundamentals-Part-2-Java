package ca.bcit.comp2501.lab1b;

public class Date {
    // Properties
    int year;
    final int month;
    final int day;

    // constructor
    Date(int year, final int month, final int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Setter
    public void setYear(int year)
    {
        this.year = year;
    }

    // Getter
    public String getYyMmDd()
    {
        String yearStr = Integer.toString(year);
        return yearStr;
    }
}
