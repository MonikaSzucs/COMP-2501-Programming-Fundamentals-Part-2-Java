package ca.bcit.comp2501.lab1bHenry;

public class Main
{
    public static void main(final String[] args)
    {
        Date date1 = new Date(1975,12,30);
        Name name1 = new Name("Tiger","Woods");
        Student student1 = new Student(name1,"A00123456",date1,true);
        String string1 = student1.getName()+" ("+name1.getInitials()+") (st # "+student1.getStudentNumber()+") was born on "+student1.getDateOfBirth()+". The student has "+student1.isGraduated()+".";
        System.out.println(string1);

        Date date2 = new Date(1955,10,28);
        Name name2 = new Name("Bill","Gates");
        Student student2 = new Student(name2,"A00987654",date2,false);
        String string2 = student2.getName()+" ("+name2.getInitials()+") (st # "+student2.getStudentNumber()+") was born on "+student2.getDateOfBirth()+". The student has "+student2.isGraduated()+".";
        System.out.println(string2);

    }
}
