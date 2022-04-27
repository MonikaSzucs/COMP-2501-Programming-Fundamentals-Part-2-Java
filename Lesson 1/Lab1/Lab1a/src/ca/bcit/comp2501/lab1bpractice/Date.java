package ca.bcit.comp2501.lab1bpractice;

public class Date {
    private String month;
    private int day;
    private int year;

    public Date(final String month, final int day, final int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public String getMonth()
    {

        if(month.equals("January") || month.equals("january") || month.equals("1"))
        {
            return "1";
        }
        else if(month.equals("February") || month.equals("february") || month.equals("2"))
        {
            return "2";
        }
        else if(month.equals("March") || month.equals("march") || month.equals("3"))
        {
            return "3";
        }
        else if(month.equals("March") || month.equals("march") || month.equals("3"))
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
        else if(month.equals("December") || month.equals("december") || month.equals("12"))
        {
            return "12";
        }
        return "N/A";
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getDay()
    {
        return day;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

    public String getYyMmDd()
    {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }
}
