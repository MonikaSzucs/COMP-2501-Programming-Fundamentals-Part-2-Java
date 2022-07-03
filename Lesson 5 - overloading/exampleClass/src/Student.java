public class Student {
    private String lastName;

    public static final int MAX_LEN_LAST_NAME = 666;

    public Student(final String lastName) {
        if(lastName !=null &
                !lastName.isBlank() &&
                lastName.length() <= MAX_LEN_LAST_NAME) {
            this.lastName = lastName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        if(lastName !=null &
                !lastName.isBlank() &&
                lastName.length() <= MAX_LEN_LAST_NAME) {
            this.lastName = lastName;
        }
    }
}
