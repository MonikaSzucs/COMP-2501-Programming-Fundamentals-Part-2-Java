//What is wrong with the following code:

//private String name = "anonymous";
//public static void main(final String[] args)
//        {
//        System.out.format("Your name is %s", name);
//        }

public class WhatIsWrong2 {
    public static void main(final String[] args)
    {
        String name = "anonymous";
        System.out.format("Your name is %s", name);
    }
}
