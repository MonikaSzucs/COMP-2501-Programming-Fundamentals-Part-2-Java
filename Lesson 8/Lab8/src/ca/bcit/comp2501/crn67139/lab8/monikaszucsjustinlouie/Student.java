package ca.bcit.comp2501.crn67139.lab8.monikaszucsjustinlouie;

import java.time.LocalDate;
import java.time.Year;

/**
 * Student.java
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
 * This Student Class is to help with the formatting of the information coming from Lab8Driver.java
 *
 */
public class Student {
    private final String        firstName;
    private final String        lastName;
    private final String        idNumber;
    private final int           birthYear;
    private final double        percentageGrade;
    private boolean             pass;

    public static final double  PERCENTAGE_GRADE_ZERO = 0.0;
    public static final double  PERCENTAGE_GRADE_HUNDRED = 100.0;
    public static final double  PERCENTAGE_GRADE_SIXTY = 60.0;

    LocalDate now = LocalDate.now();

    /**
     * Student Constructor without parameters
     *
     * This is the no-arg constructor that has default values.
     */
    public Student() {
        this.firstName = null;
        this.lastName = null;
        this.idNumber = null;
        this.birthYear = 0;
        this.percentageGrade = 0.0;
    }

    /**
     * Student Constructor with parameters
     *
     * @param firstName this is the students first name in String format
     * @param lastName this is the students last name in String format
     * @param idNumber this is the unique key/ ID number of the student in String format
     * @param birthYear this is the year of birth of the student in integer format
     * @param percentageGrade this is the grade in percentage format
     *
     * Based on what the student's percentage is will determine if they have passed or failed
     *
     */
    public Student(final String firstName, final String lastName, final String idNumber, final int birthYear, final double percentageGrade) {
        if(firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("The first name cannot be null/empty");
        }
        if(lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("The last name cannot be null/empty");
        }
        if(idNumber == null || idNumber.isEmpty()) {
            throw new IllegalArgumentException("The ID number cannot be null/empty");
        }
        if(birthYear > now.getYear()) {
            throw new IllegalArgumentException("You cannot have the birth year larger than the current year");
        }
        if(percentageGrade > PERCENTAGE_GRADE_HUNDRED || percentageGrade < PERCENTAGE_GRADE_ZERO) {
            throw new IllegalArgumentException("The percentage cannot be larger than 100 or less than 0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = now.getYear() - birthYear;
        this.percentageGrade = percentageGrade;

        if(percentageGrade >= PERCENTAGE_GRADE_SIXTY) {
            pass = true;
        } else {
            pass = false;
        }
    }

    /**
     * getFirstName() method
     *
     * @return this will return the students first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getLastName() method
     *
     * @return this will return the students last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * getIdNumber() method
     *
     * @return this will return the students ID number
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * getBirthYear() method
     *
     * @return this will return the year of birth of the student
     */
    public int getBirthYear() {
        if(birthYear <= now.getYear()) {
            return (now.getYear() - birthYear);
        } else {
            throw new IllegalArgumentException("You cannot have the birth year larger than the current year");
        }
    }

    /**
     * getPercentageGrade() method
     *
     * @return this will return the percentage grade of the student
     */
    public double getPercentageGrade() {
        return percentageGrade;
    }

    /**
     * setPass() method
     *
     * @return this will return a true or false indication if the student has passed or not
     */
    public Boolean setPass() {
        return pass;
    }

    /**
     * toString() method
     *
     * @return this will return all the information about the students in a String format back to the Lab8Driver
     * function once it is called
     */
    public String toString() {
        return "Student [firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", idNumber=" + getIdNumber() +
                ", ageYears=" + birthYear +
                ", gradePct=" + getPercentageGrade() +
                ", pass=" + setPass() + "]";
    }
}
