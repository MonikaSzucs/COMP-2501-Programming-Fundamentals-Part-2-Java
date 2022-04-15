package ca.bcit.comp2501.lab1b;

public class Name {
    // Properties
    private final String name;


    // Constructor
    public Name(String name)
    {
        this.name = name;
    }

    public String getInitials()
    {
        String firstLetter;
        String secondFirstLetter;
        String theName;

        int intSpaceLocation = name.indexOf(" ");
        // String strFirstName = name.substring(0,intSpaceLocation);
        firstLetter = name.substring(0,1);
        // System.out.println(strFirstName);
        // String strLastName = name.substring(intSpaceLocation+1);
        secondFirstLetter = name.substring(intSpaceLocation+1,intSpaceLocation+2);
        // System.out.println(strLastName);
        theName = firstLetter + "." +  secondFirstLetter + ".";
        return theName;
    }

    public String getFullName()
    {
        // e.g. Tiger Woods
        return name;
    }
}
