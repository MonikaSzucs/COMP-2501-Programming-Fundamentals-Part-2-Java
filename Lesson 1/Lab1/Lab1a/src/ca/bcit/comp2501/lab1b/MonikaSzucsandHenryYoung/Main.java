package ca.bcit.comp2501.lab1b.MonikaSzucsandHenryYoung;

/**
 * @ Authors Monika Szucs and Henry Young
 */

public class Main
{
    public static void main(final String[] args)
    {
        // Student #1
        Name name1 = new Name("Tiger","Woods");
        Date date1 = new Date("December", 30, 1975);

        Student student1 = new Student(name1, date1, "A00123456", true);
        System.out.println(name1.getFirstName() + " " + name1.getLastName() + " (" + name1.getInitials() + ") " +
                "(st # " + student1.getStudentNumber() + ") was born on " + date1.getYyMmDd() + ". The student has " +
                student1.getIsGraduated() + ".");

        // Student #2
        Name name2 = new Name("Bill","Gates");
        Date date2 = new Date("October", 28, 1955);
        Student student2 = new Student(name2, date2, "A00987654", false);
        System.out.println(name2.getFirstName() + " " + name2.getLastName() + " (" + name2.getInitials() + ") " +
                "(st # " + student2.getStudentNumber() + ") was born on " + date2.getYyMmDd() + ". The student has " +
                student2.getIsGraduated() + ".");
    }
}
