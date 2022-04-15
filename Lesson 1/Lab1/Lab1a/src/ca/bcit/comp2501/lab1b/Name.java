package ca.bcit.comp2501.lab1b;

public class Name {
    // Properties
    final String name;

    // Constructor
    public Name(final String name)
    {
        this.name = name;
        System.out.println(name);
    }

    public void setName(String name)
    {
        int intSpaceLocation = name.indexOf(" ");
        String strFirstName = name.substring(0,intSpaceLocation);
        System.out.println(strFirstName);
        String strLastName = name.substring(intSpaceLocation+1);
        System.out.println(strLastName);
    }
}
