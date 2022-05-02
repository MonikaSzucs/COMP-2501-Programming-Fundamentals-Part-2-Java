package ca.bcit.comp2501.lab2b.monikaszucsandparhammehrgan;

/**
 * Date.java
 * COMP 2501 - CRN: 67139 - Wednesday Evenings, Spring/Summer 2022
 * Lab #2b
 *
 * @authors Monika Szucs and Parham Mehrgan
 * @version 1.0
 */
public class Date
{
    private int     year;
    private String  month;
    private int     day;

    /** Constructor
     *
     * @param year the year
     * @param month the month
     * @param day the day
     */
    public Date(final int year, final String month, final int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Getting the year for the Date
     *
     * @return year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Setting the year for the Date
     *
     * @param year the year
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    /**
     * Getting the month for Date
     *
     * @return the month
     */
    public String getMonth()
    {
        return month;
    }

    /**
     * Steting the month for Date
     *
     * @param month the month
     */
    public void setMonth(String month)
    {
        this.month = month;
    }

    /**
     * Getting the day for Date
     *
     * @return the day
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Setting the day for Date
     *
     * @param day the day
     */
    public void setDay(int day)
    {
        this.day = day;
    }

    /**
     * Printing the date as a concatenated string (Ex: "March 15, 1980")
     *
     * @return the concatenated string containing the "Month Day, Year" format
     */
    public String getDate()
    {
        return getMonth() + " " + getDay() + ", " + getYear();
    }
}
