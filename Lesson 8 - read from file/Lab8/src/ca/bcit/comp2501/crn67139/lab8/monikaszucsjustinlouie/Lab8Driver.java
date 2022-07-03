package ca.bcit.comp2501.crn67139.lab8.monikaszucsjustinlouie;

import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Lab8Driver.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #8
 *
 * Working with a Scanner, a text file and toString().
 *
 * @author Monika Szucs
 * @author Justin Louie
 *
 * @version 1.2
 *
 * To run this you must make sure that you have a file called student_data.txt in the Lab8 folder (outside of src)
 * The format of the information in the student_data.txt file is for example: Pike,Bass,A00953177,2000,81.5
 *
 */
public class Lab8Driver {
    private Map<String, Student> students;

    public static final int     EARLIEST_BIRTH_YEAR = 0;
    public static final double  CURRENT_YEAR = 2022;
    public static final double  LOWEST_GRADE_PERCENT = 0.0;
    public static final double  HIGHEST_GRADE_PERCENT = 100.0;
    public static final int     FIRST_LETTER = 0;
    public static final int     SECOND_LETTER = 1;
    public static final int     FIRST_NAME = 0;
    public static final int     LAST_NAME = 1;
    public static final int     ID_NUMBER = 2;
    public static final int     BIRTH_YEAR = 3;
    public static final int     GRADE_PERCENT = 4;

    public static final int     MIN_FIRST_NAME_LENGTH = 1;
    public static final int     MIN_LAST_NAME_LENGTH = 1;
    public static final int     MIN_ID_LENGTH = 1;

    public static final String  NO = "no";
    public static final String  YES = "yes";

    /**
     * Lab8Driver() Constructor
     *
     * This is the constructor of the Lab8Driver that takes in no parameters
     *
     */
    Lab8Driver() {
        students = new HashMap<>();
    }

    /**
     * readFromPrompt() Method
     *
     * This is the method that will read the information that is typed in by the user and stored after the user
     * presses enter
     *
     * The information that this scanner will ask is if they want to create a Student object which will be stored in
     * the HashMap. If no then end and if yes then ask the following questions:
     * 1. Enter first name.
     * 2. Enter last name.
     * 3. Enter id number.
     * 4. Enter birth year as a whole number.
     * 5. Enter grade (percentage) as a decimal number.
     *
     */
    public void readFromPrompt() {
        Scanner scanner;
        String  choice;
        String  firstName;
        String  lastName;
        String  idNumber;
        int     birthYears;
        double  gradePercent;
        boolean proceed;
        boolean checking;

        scanner = new Scanner(System.in);
        proceed = true;
        checking = true;

        birthYears = EARLIEST_BIRTH_YEAR;
        gradePercent = LOWEST_GRADE_PERCENT;

        do {
            System.out.println("Do you wish to create a Student? (" + YES + "/" + NO + "): ");
            choice = scanner.next().toLowerCase();
            if (choice.equals(YES)) {
                System.out.println("yes");

                do {
                    try {
                        System.out.println("Enter first name:");
                        firstName = scanner.next().toLowerCase();
                        scanner.nextLine();
                        checking = false;
                    } catch(Exception e) {
                        throw new IllegalArgumentException("You must enter more than " + MIN_FIRST_NAME_LENGTH + " character");
                    }
                } while (checking);

                checking = true;
                do {
                    try {
                        System.out.println("Enter last name:");
                        lastName = scanner.next().toLowerCase();
                        scanner.nextLine();
                        checking = false;
                    } catch(Exception e) {
                        throw new IllegalArgumentException("You must enter more than " + MIN_LAST_NAME_LENGTH + " character.");
                    }
                } while (checking);

                checking = true;
                do {
                    try {
                        System.out.println("Enter id number:");
                        idNumber = scanner.next().toUpperCase();
                        scanner.nextLine();
                        checking = false;
                    } catch(Exception e) {
                        throw new IllegalArgumentException("You must enter more than " + MIN_ID_LENGTH + " character.");
                    }
                } while(checking);

                checking = true;
                while (checking) {
                    System.out.println("Enter birth year as a whole number:");
                    String birthYearsString = scanner.next();
                    birthYears = EARLIEST_BIRTH_YEAR;
                    try {
                        birthYears = Integer.parseInt(birthYearsString);
                        if(birthYears > EARLIEST_BIRTH_YEAR && birthYears <= CURRENT_YEAR) {
                            break;
                        }
                    } catch (NumberFormatException ne) {
                        System.out.println("This is not a number");
                    }
                }

                while (checking) {
                    System.out.println("Enter grade (percentage) as a double:");
                    String gradePercentageString = scanner.next();
                    gradePercent = LOWEST_GRADE_PERCENT;
                    try {
                        gradePercent = Double.parseDouble(gradePercentageString);
                        if(gradePercent > LOWEST_GRADE_PERCENT && gradePercent <= HIGHEST_GRADE_PERCENT) {
                            break;
                        }
                    } catch (NumberFormatException ne) {
                        System.out.println("This is not a number");
                    }
                }

                firstName = firstName.toUpperCase().charAt(FIRST_LETTER) +
                        firstName.toLowerCase().substring(SECOND_LETTER);
                lastName = lastName.toUpperCase().charAt(FIRST_LETTER) +
                        lastName.toLowerCase().substring(SECOND_LETTER);

                Student student1 = new Student(firstName, lastName,
                        idNumber, birthYears, gradePercent);
                students.put(idNumber, student1);
            } else if(choice.equals(NO)) {
                proceed = false;
                System.out.println("Data entry finished!");
            }
        } while (proceed);
        scanner.close();
    }

    /**
     * readFromFile() Method
     *
     * This method will allow you to read text from a file, grab the information and store it in the Student HashMap
     *
     * @throws FileNotFoundException will throw a file not found exception if there is no file to be found/read from
     *
     */
    public void readFromFile() throws FileNotFoundException {
        System.out.println();
        System.out.println("DEBUG: calling readFromFile");
        System.out.println("List of Students created");

        File myFile;
        Scanner scanner;
        String[] arrayValues;
        String firstName;
        String lastName;
        String idNumber;
        String savedLine;
        int birthYears;
        double gradePercentage;
        boolean keepReading;

        myFile = new File("student_data.txt");
        scanner = new Scanner(myFile);
        savedLine = null;
        keepReading = true;

        while(keepReading) {
            if(scanner.hasNext()) {
                savedLine = scanner.next();

                arrayValues = savedLine.split(",");
                firstName = String.valueOf(arrayValues[FIRST_NAME]);
                lastName = String.valueOf(arrayValues[LAST_NAME]);
                idNumber = String.valueOf(arrayValues[ID_NUMBER]);
                birthYears = Integer.valueOf(arrayValues[BIRTH_YEAR]);
                gradePercentage = Double.valueOf(arrayValues[GRADE_PERCENT]);

                if(savedLine != null && !savedLine.isEmpty()) {
                    Student student1 = new Student(firstName, lastName,
                            idNumber, birthYears, gradePercentage);
                    students.put(idNumber, student1);
                }
            } else {
                keepReading = false;
            }
        }
        scanner.close();
    }

    /**
     * showStudents() Method
     *
     * This is a method that will read through the HashMap with all the stored values and print it out in the form of
     * a sentence grabbed from the .toString() method created in the Student Class.
     *
     */
    public void showStudents() {
        Set<String> keys;
        keys = students.keySet();

        for(String key: keys) {
            Student student;
            student = students.get(key);
            System.out.println(student.toString());
        }
    }

    /**
     * Main Method
     *
     * This is the main method that runs the entire lab to read the files and allow the user to interact with the
     * program
     *
     * @param args this is the main method with no argument
     * @throws FileNotFoundException this is a file not found exception to check if a file could not be found
     * to read from
     *
     */
    public static void main(final String[] args) throws FileNotFoundException {
        Lab8Driver b;
        b = new Lab8Driver();
        b.readFromPrompt();

        b.readFromFile();
        b.showStudents();
    }
}
