package ca.bcit.comp2501.lab1b.monikaszucsandhenryyoung;

/**
 * @Authors Monika Szucs and Henry Young
 * @version 1.0
 */
public class Name
{
    private String firstName;
    private String lastName;

    /**
     * @param firstName the first name
     * @param lastName the last name
     */
    public Name(final String firstName, final String lastName)
    {
        this.firstName  = firstName;
        this.lastName   = lastName;
    }

    /**
     * @param firstName the new first name
     */
    public void setFirstName(final String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param lastName the new last name
     */
    public void setLastName(final String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @return the first initial of the first name
     */
    public char getFirstInitials()
    {
        return firstName.charAt(0);
    }

    /**
     * @return the last initial of the last name
     */
    public char getLastInitials()
    {
        return lastName.charAt(0);
    }

    /**
     * @return the initials of the first and last name
     */
    public String getInitials()
    {
        return getFirstInitials() + "." + getLastInitials() + ".";
    }

}
