public class Student {
    private final String lastName;
    private final int yearBorn;
    private final String studentId;

    public Student(final String lastName, final int yearBorn, final String studentId) {
        this.lastName = lastName;
        this.yearBorn = yearBorn;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "lastName: " + lastName + ", yearBorn: " + yearBorn + " and " + super.toString() + " and id is " + studentId;
    }
}
