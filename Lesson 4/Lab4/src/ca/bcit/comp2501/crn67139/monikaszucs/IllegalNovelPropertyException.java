package ca.bcit.comp2501.crn67139.monikaszucs;

/**
 * IllegalNovelPropertyException.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Lab #4
 *
 * Extends the Exception based on the IllegalNovelPropertyException
 *
 * @author Monika Szucs
 * @author Tram Le
 *
 * @version 1.0
 *
 */
public class IllegalNovelPropertyException extends Exception{
    IllegalNovelPropertyException(final String novel)
        {
            super(novel);
        }
}
