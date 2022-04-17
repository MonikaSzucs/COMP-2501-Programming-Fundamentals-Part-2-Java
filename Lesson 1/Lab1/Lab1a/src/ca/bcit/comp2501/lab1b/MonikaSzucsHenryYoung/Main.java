package ca.bcit.comp2501.lab1b.MonikaSzucsHenryYoung;

/**
 * @ author Monika Szucs and Henry Young
 */

public class Main {
    public static void main(final String[] args)
    {
        // Student Once Object
        Name name = new Name("Tiger","Woods");
        Date date = new Date("December",30, 1975);
        Student student1 = new Student(name, date,"A00123456",  true);
        Name student1Name = student1.getName();
        Date student1Date = student1.getDate();
        //System.out.println(date.getYyMmDd());
        System.out.println(name.getFullName() + " (" + name.getInitials() + ") (st # " + student1.getStudentNumber() + ") was born on " + date.getYyMmDd() + ". The student has " + student1.getGraduated() + ".");

        // Student Two Object
        Name name2 = new Name("Bill","Gates");
        Date date2 = new Date("October",28, 1955);
        Student student2 = new Student(name2, date2,"A00987654",  false);
        Name student2Name = student2.getName();
        Date student2Date = student2.getDate();
        System.out.println(name2.getFullName() + " (" + name2.getInitials() + ") (st # " + student2.getStudentNumber() + ") was born on " + date2.getYyMmDd() + ". The student has " + student2.getGraduated() + ".");
    }
}
