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
    Map<String, Student> students;

    public static final int     BIRTH_YEARS_ZERO = 0;
    public static final double  BIRTH_YEARS_TWENTY_TWENTY_TWO = 2022;
    public static final double  GRADE_PERCENTAGE_ZERO = 0.0;
    public static final double  GRADE_PERCENTAGE_HUNDRED = 100.0;
    public static final int     CHARACTER_POSITION_ZERO = 0;
    public static final int     SUBSTRING_POSITION_ONE = 1;
    public static final int     ARRAY_VALUES_POSITION_ZERO = 0;
    public static final int     ARRAY_VALUES_POSITION_ONE = 1;
    public static final int     ARRAY_VALUES_POSITION_TWO = 2;
    public static final int     ARRAY_VALUES_POSITION_THREE = 3;
    public static final int     ARRAY_VALUES_POSITION_FOUR = 4;


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
        scanner = new Scanner(System.in);
        String choice;
        boolean proceed = true;
        boolean checking = true;

        String firstName;
        String lastName;
        String idNumber;
        int birthYears = BIRTH_YEARS_ZERO;
        double gradePct = GRADE_PERCENTAGE_ZERO;

        do {
            System.out.println("Do you wish to create a Student? (y/n): ");
            choice = scanner.next().toLowerCase();
            if (choice.equals("y")) {
                System.out.println("yes");

                do {
                    try {
                        System.out.println("Enter first name:");
                        firstName = scanner.next().toLowerCase();
                        scanner.nextLine();
                        checking = false;
                    } catch(Exception e) {
                        throw new IllegalArgumentException("You must enter more than one character");
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
                        throw new IllegalArgumentException("You must enter more than one character.");
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
                        throw new IllegalArgumentException("You must enter more than one character.");
                    }
                } while(checking);

                checking = true;
                while (checking) {
                    System.out.println("Enter birth year as a whole number:");
                    String birthYearsString = scanner.next();
                    birthYears = BIRTH_YEARS_ZERO;
                    try {
                        birthYears = Integer.parseInt(birthYearsString);
                        if(birthYears > BIRTH_YEARS_ZERO && birthYears <= BIRTH_YEARS_TWENTY_TWENTY_TWO) {
                            break;
                        }
                    } catch (NumberFormatException ne) {
                        System.out.println("This is not a number");
                    }
                }

                while (checking) {
                    System.out.println("Enter grade (percentage) as a double:");
                    String gradePercentageString = scanner.next();
                    gradePct = GRADE_PERCENTAGE_ZERO;
                    try {
                        gradePct = Double.parseDouble(gradePercentageString);
                        if(gradePct > GRADE_PERCENTAGE_ZERO && gradePct <= GRADE_PERCENTAGE_HUNDRED) {
                            break;
                        }
                    } catch (NumberFormatException ne) {
                        System.out.println("This is not a number");
                    }
                }

                firstName = firstName.toUpperCase().charAt(CHARACTER_POSITION_ZERO) +
                        firstName.toLowerCase().substring(SUBSTRING_POSITION_ONE);
                lastName = lastName.toUpperCase().charAt(CHARACTER_POSITION_ZERO) +
                        lastName.toLowerCase().substring(SUBSTRING_POSITION_ONE);

                Student student1 = new Student(firstName, lastName,
                        idNumber, birthYears, gradePct);
                students.put(idNumber, student1);
            } else if(choice.equals("n")) {
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
        myFile = new File("student_data.txt");
        Scanner scanner;
        scanner = new Scanner(myFile);
        String savedLine = null;
        boolean keepReading = true;

        String[] arrayValues;
        String firstName;
        String lastName;
        String idNumber;
        int birthYears;
        double gradePct;

        while(keepReading) {
            if(scanner.hasNext()) {
                savedLine = scanner.next();

                arrayValues = savedLine.split(",");
                firstName = String.valueOf(arrayValues[ARRAY_VALUES_POSITION_ZERO]);
                lastName = String.valueOf(arrayValues[ARRAY_VALUES_POSITION_ONE]);
                idNumber = String.valueOf(arrayValues[ARRAY_VALUES_POSITION_TWO]);
                birthYears = Integer.valueOf(arrayValues[ARRAY_VALUES_POSITION_THREE]);
                gradePct = Double.valueOf(arrayValues[ARRAY_VALUES_POSITION_FOUR]);

                if(savedLine != null && !savedLine.isEmpty()) {
                    Student student1 = new Student(firstName, lastName,
                            idNumber, birthYears, gradePct);
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
        Set<String> keys = students.keySet();
        for(String key: keys) {
            Student student = students.get(key);
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
