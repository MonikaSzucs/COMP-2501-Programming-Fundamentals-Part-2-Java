package ca.bcit.comp2501.lab1b.MonikaSzucsandHenryYoung;

/**
 * @ Authors Monika Szucs and Henry Young
 */

public class Date {
    // Properties for Date
    private final String month;
    private final int day;
    private final int year;

    // Constructor for Date
    public Date(final String month, final int day, final int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setter for Month
    public void setMonth(final String month)
    {
        this.month = month;
    }

    // Getter for Month
    public String getMonth()
    {
        if(month.equals("January") || month.equals("january")|| month =="1")
        {
            return "1";
        } else if(month=="February" || month=="february"|| month =="2")
        {
            return "2";
        } else if(month=="March" || month=="march"|| month =="3")
        {
            return "3";
        } else if (month=="April" || month=="april"|| month =="4")
        {
            return "4";
        } else if (month=="May" || month=="may"|| month =="5")
        {
            return "5";
        } else if (month=="June" || month=="june"|| month =="6")
        {
            return "6";
        } else if (month=="July" || month=="july"|| month =="7")
        {
            return "7";
        } else if (month=="August" || month=="august"|| month =="8")
        {
            return "8";
        } else if (month=="September" || month=="september"|| month =="9")
        {
            return "9";
        } else if (month=="October" || month=="october"|| month =="10")
        {
            return "10";
        } else if (month=="November" || month=="november"|| month =="11")
        {
            return "11";
        } else if (month=="December" || month=="deceomber"|| month =="12")
        {
            return "12";
        } else{
            return "0";
        }
    }

    // Setter for Day
    public void setDay(final int day)
    {
        this.day = day;
    }

    //Getter for Day
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

    // Setter for Year
    public void setYear(final int year)
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

    // Getter for String containing Year, Month and Day
    public String getYyMmDd()
    {
        if (getYear()==0 )
        {
            return "ERROR FOR YEAR -" + getMonth() + "-" + Integer.toString(getDay());
        }
        else if (getMonth()=="0")
        {
            return Integer.toString(getYear()) + "- ERROR FOR MONTH -" + Integer.toString(getDay());
        }
        else if (getDay()==0){
            return Integer.toString(getYear()) + "-" + getMonth() + "- ERROR FOR DAY";
        }
        else {
            return Integer.toString(getYear()) + "-" + getMonth() + "-" + Integer.toString(getDay());
        }
    }
}
