package ca.bcit.comp2501.lab1bpractice;

public class Name {
    private String firstName;
    private String lastName;

    public Name(final String firstName, final String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String getInitials()
    {
        return firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0) + ".";
    }
}
