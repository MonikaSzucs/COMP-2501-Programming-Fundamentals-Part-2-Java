package ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics.port;


/** FullPortsException.java COMP 2501 - CRN: 67139 Wednesday evenings, Spring/Summer 2022 Lab #9
 *
 * Exception that happens if all the data ports are used up
 * @author Daniel Wart
 * @author Monika Szucs
 * @version 2.0
 */
public class FullPortsException extends RuntimeException {
    public FullPortsException(String message) {
        super(message);
    }
}
