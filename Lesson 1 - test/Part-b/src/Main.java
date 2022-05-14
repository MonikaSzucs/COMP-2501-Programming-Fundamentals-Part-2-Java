public class Main {

    public static void main(final String[] args) {
        Student student1;
        Name name1;
        Date date1;

        name1 = new Name("Tiger", "Woods");
        date1 = new Date("December", 30, 1975);
        student1 = new Student(name1, date1, "A00123456", true);

        System.out.println(name1.getFullName() + " (" + name1.getInitials() + ") (st # " +
                        student1.getStudentNumber() + ") was born on " + date1.getYyMmDd() +
                        ". The student " + student1.isGraduated() + ".");
    }
}
