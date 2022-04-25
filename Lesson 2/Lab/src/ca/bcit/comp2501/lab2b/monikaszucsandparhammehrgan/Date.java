package ca.bcit.comp2501.lab2b.monikaszucsandparhammehrgan;

/**
 * @Authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 */
public class Date
{
    private int year;
    private String month;
    private int day;

    public Date(final int year, final String month, final int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public String getMonth()
    {
        return month;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getDay()
    {
        return day;
    }

    public String getDate()
    {
        return getMonth() + " " + getDay() + ", " + getYear();
    }
}
