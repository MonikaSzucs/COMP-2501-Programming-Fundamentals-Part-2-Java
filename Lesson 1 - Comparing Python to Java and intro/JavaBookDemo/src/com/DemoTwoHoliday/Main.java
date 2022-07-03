package com.DemoTwoHoliday;

public class Main {
    public static void main(final String[] args)
    {
        Holiday christmas = new Holiday("Christmas", 12, 25); // holiday object

        System.out.println(christmas.getName());

        System.out.println(christmas.isStatutory()); // false (default)
        christmas.setStatutory(true);

    }

}
