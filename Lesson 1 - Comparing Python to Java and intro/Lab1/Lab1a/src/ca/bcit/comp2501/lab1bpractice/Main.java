package ca.bcit.comp2501.lab1bpractice;

/**
 * @author Monika Szucs
 * @version 1.0
 */
public class Main {
    public static void main(final String[] args){
        Name name1 = new Name("Tiger","Woods");
        Date date1 = new Date("December", 30, 1975);
        Student student1 = new Student(name1, date1, "A00123456", true);

        System.out.println(name1.getFullName() + " (" + name1.getInitials() + ") (st # " + student1.getStudentNumber()
                + ") was born on " + date1.getYyMmDd() + ". the student " + student1.isGraduated());

        Name name2 = new Name("Bill","Gates");
        Date date2 = new Date("October", 28, 1955);
        Student student2 = new Student(name2, date2, "A00987654", false);

        System.out.println(name2.getFullName() + " (" + name2.getInitials() + ") (st # " + student2.getStudentNumber()
                + ") was born on " + date2.getYyMmDd() + ". the student " + student2.isGraduated());
    }
}
