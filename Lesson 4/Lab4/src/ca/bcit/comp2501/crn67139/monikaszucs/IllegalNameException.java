package ca.bcit.comp2501.crn67139.monikaszucs;

/**
 * IllegalNameException.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #4
 *
 * Extends the Exception based on the IllegalNameException
 *
 * @author Monika Szucs
 * @author Tram Le
 *
 * @version 1.0
 *
 */
public class IllegalNameException extends Exception{
    IllegalNameException(final String novel)
    {
        super(novel);
    }
}
