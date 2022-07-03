class Name {
    private final String firstName;
    private final String lastName;

    Name(final String firstName, final String lastName) {

        if(firstName.length() <= 3) {
            throw new IllegalArgumentException("the first name must be longer than 3 letters");
        }
        this.firstName = firstName;

        if(lastName.length() <= 3) {
            throw new IllegalArgumentException("the first name must be longer than 3 letters");
        }
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInitials() {
        return firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0) + ".";
    }
}
