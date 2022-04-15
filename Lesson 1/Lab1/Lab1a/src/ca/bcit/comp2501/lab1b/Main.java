package ca.bcit.comp2501.lab1b;


import org.bouncycastle.jcajce.provider.digest.Tiger;

public class Main {
    public static void main(final String[] args)
    {
        Name name = new Name("Tiger Woods");
        Date date = new Date(1975,12,30);
        Student student1 = new Student(name, "A00123456", date, true);
        Name student1Name = student1.getName();
        System.out.println(student1Name.getFullName());
        System.out.println(name.getInitials());
        System.out.println(student1.getStudentNumber());
        Date student1Date = student1.getDate();
        System.out.println(student1Date.getYyMmDd());
        System.out.println(student1.getGraduated());
        System.out.println(student1.toString());

        Name name2 = new Name("Bill Gates");
        Date date2 = new Date(1955,10,28);
        Student student2 = new Student(name2, "A00987654", date2, false);
        //Bill Gates (B.G.) (st # A00987654) was born on 1955-10-28. The student has not graduated.
        Name student2Name = student2.getName();
        System.out.println(student2Name.getFullName());
        System.out.println(name2.getInitials());
        System.out.println(student2.getStudentNumber());
        Date student2Date = student2.getDate();
        System.out.println(student2Date.getYyMmDd());
        System.out.println(student2.getGraduated());
        System.out.println(student2.toString());
    }
}
