package com.DemoTwoHoliday;

public class Holiday {
    private final String name;
    private int month; // 1 = january; 12 = December
    private int day;
    private boolean statutory; // default is false

    Holiday(final String name, final int month, final int day)
    {
        this.name = name;
        this.month = month;
        this.day = day;
    }
    public boolean isStatutory()
    {
        return statutory;
    }
    public void setStatutory(final boolean statutory)
    {
        this.statutory = statutory;
    }
    public String getName()
    {
        return name;
    }
}
