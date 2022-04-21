package ca.bcit.comp2501.lab1b.monikaszucsandhenryyoung;

/**
 * @Authors Monika Szucs and Henry Young
 * @version 1.0
 */
public class Date
{
    // Properties for Date
    private String month;
    private int day;
    private int year;

    /**
     * @param month
     * @param day
     * @param year
     */
    public Date(final String month, final int day, final int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * @param month
     */
    public void setMonth(final String month)
    {
        this.month = month;
    }

    /**
     * @return the month number
     */
    public String getMonth()
    {
        if(month.equals("January") || month.equals("january")|| month.equals("1"))
        {
            return "1";
        }
        else if(month.equals("February") || month.equals("february") || month.equals("2"))
        {
            return "2";
        }
        else if(month.equals("March") || month.equals("march")|| month .equals("3"))
        {
            return "3";
        }
        else if(month.equals("April") || month.equals("april") || month.equals("4"))
        {
            return "4";
        }
        else if(month.equals("May") || month.equals("may") || month.equals("5"))
        {
            return "5";
        }
        else if(month.equals("June") || month.equals("june") || month.equals("6"))
        {
            return "6";
        }
        else if(month.equals("July") || month.equals("july") || month.equals("7"))
        {
            return "7";
        }
        else if(month.equals("August") || month.equals("august") || month.equals("8"))
        {
            return "8";
        }
        else if(month.equals("September") || month.equals("september") || month.equals("9"))
        {
            return "9";
        }
        else if(month.equals("October") || month.equals("october") || month.equals("10"))
        {
            return "10";
        }
        else if(month.equals("November") || month.equals("november") || month.equals("11"))
        {
            return "11";
        }
        else if(month.equals("December") || month.equals("deceomber") || month.equals("12"))
        {
            return "12";
        }
        else
        {
            return "0";
        }
    }

    /**
     * @param day the
     */
    public void setDay(final int day)
    {
        this.day = day;
    }

    /**
     * @return
     */
    public int getDay()
    {
        if(day <= 0 || day > 31)
        {
            System.out.println("day is less than or equal to zero or greater than 31");
            return 0;
        }
        else
        {
            return day;
        }
    }

    /**
     * @param year
     */
    public void setYear(final int year)
    {
        this.year = year;
    }

    /**
     * @return
     */
    public int getYear()
    {
        if(year < 0 || year > 2022)
        {
            System.out.println("Year is less than zero or greater than 2022");
            return 0;
        }
        else
        {
            return year;
        }
    }

    /**
     * @return
     */
    public String getYyMmDd()
    {
        if(getYear() == 0 )
        {
            return "ERROR FOR YEAR -" + getMonth() + "-" + Integer.toString(getDay());
        }
        else if(getMonth()=="0")
        {
            return Integer.toString(getYear()) + "- ERROR FOR MONTH -" + Integer.toString(getDay());
        }
        else if(getDay() == 0)
        {
            return Integer.toString(getYear()) + "-" + getMonth() + "- ERROR FOR DAY";
        }
        else
        {
            return Integer.toString(getYear()) + "-" + getMonth() + "-" + Integer.toString(getDay());
        }
    }
}
