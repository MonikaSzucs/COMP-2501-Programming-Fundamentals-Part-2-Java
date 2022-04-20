package ca.bcit.comp2501.lab1b.MonikaSzucsandHenryYoung;

/**
 * @ Authors Monika Szucs and Henry Young
 */

public class Name {
    // Properties for Name
    private String firstName;
    private String lastName;

    // Constructor for Name
    public Name(final String firstName, final String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Setter for First Name
    public void setFirstName(final String firstName)
    {
        this.firstName = firstName;
    }

    // Getter for First Name
    public String getFirstName()
    {
        return firstName;
    }

    // Setter for Last Name
    public void setLastName()
    {
        this.lastName = lastName;
    }

    // Getter for Last Name
    public String getLastName()
    {
        return lastName;
    }

    // Getter for First Initials
    public char getFirstInitals()
    {
        return firstName.charAt(0);
    }

    // Getter for Last Initials
    public char getLastInitials()
    {
        return lastName.charAt(0);
    }

    // Getter for Combined Initials
    public String getInitials()
    {
        return getFirstInitals() + "." + getLastInitials() + ".";
    }

}
