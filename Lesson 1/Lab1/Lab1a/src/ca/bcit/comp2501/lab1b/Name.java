package ca.bcit.comp2501.lab1b;

/**
 * @ author Monika Szucs and Henry Young
 */

public class Name {
    // Properties
    private String firstName;
    private String lastName;

    // Constructor
    public Name(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getInitials()
    {
        String theName;

        theName = firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0)+".";
        return theName;
    }

    // Setter for First Name
    public void setFirstName()
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

    // Getter for Full Name
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
}
