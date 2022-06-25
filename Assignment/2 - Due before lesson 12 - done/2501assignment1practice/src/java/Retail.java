/**
 * Retail.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Assignment 2
 *
 * Define a Retail class with methods and instance variables.
 *
 * @author Monika Szucs
 *
 * @version 1.3
 *
 */
public class Retail extends Property{
    private int squareFootage;
    private boolean customerParking;

    private static final int MINIMUM_SQUARE_FOOTAGE_NOT_ALLOWED = 0;

    /**
     * This is a Constructor for the Property Class that will check the values that are passed before assigning the
     * values
     *
     * @param priceInUsd        this is the price in US dollars (double) must be position (greater than or equal to zero).
     * @param address           this is the address from the Address Class.
     * @param type              this is the type of property (String) that must be either residence, commercial or retail.
     * @param propertyId        this is the propertyId (String) that must be one to six characters in length.
     * @param squareFootage     this is the squareFootage (int) of the place
     * @param customerParking   this is the customerParking (boolean) if the place has customer parking
     * @throws IllegalArgumentException this throws an illegal argument exception if there is an invalid price in USD,
     *                                  number of bedrooms, property type, and/or propertyId.
     */
    public Retail(double priceInUsd, Address address, String type, String propertyId, final int squareFootage,
                  final boolean customerParking) {
        super(priceInUsd, address, type, propertyId);
        if(squareFootage < MINIMUM_SQUARE_FOOTAGE_NOT_ALLOWED) {
            throw new IllegalArgumentException("The square footage cannot be 0 or less than 1");
        }
        this.squareFootage = squareFootage;
        this.customerParking = customerParking;
    }

    /**
     * This is the getSquareFootage method
     *
     * @return this will return the square footage in integer value
     */
    public int getSquareFootage() {
        return squareFootage;
    }

    /**
     * This is the isCustomerParking
     *
     * @return this will return a boolean value if there is customer parking or not
     */
    public boolean isCustomerParking() {
        return customerParking;
    }

    /**
     * This is the toString method
     *
     * @return the String value containing the squareFootage and customerParking
     */
    @Override
    public String toString() {
        return "Retail{" +
                "squareFootage=" + squareFootage +
                ", customerParking=" + customerParking +
                '}';
    }
}
