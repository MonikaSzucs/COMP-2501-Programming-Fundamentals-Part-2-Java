import java.util.Properties;

/**
 * Residence.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Assignment 2
 *
 * Define a Residence class with methods and instance variables.
 *
 * @author Monika Szucs
 *
 * @version 1.3
 *
 */
public class Residence extends Property {

    private int numberOfBedrooms;
    private boolean swimmingPool;
    private boolean strata;

    private static final int MIN_NUMBER_BEDROOMS_NOT_ALLOWED = 1;

    /**
     * This is a Constructor for the Property Class that will check the values that are passed before assigning the
     * values
     *
     * @param priceInUsd        this is the price in US dollars (double) must be position (greater than or equal to zero).
     * @param address           this is the address from the Address Class.
     * @param type              this is the type of property (String) that must be either residence, commercial or retail.
     * @param propertyId        this is the propertyId (String) that must be one to six characters in length.
     * @param numberOfBedrooms  this is the numberOfBedrooms (int) that must be more than 1
     * @param swimmingPool      this is checking if the place has a swimming pool or not (boolean)
     * @param strata            this checks to see if the place is a strata or not (boolean)
     * @throws IllegalArgumentException this throws an illegal argument exception if there is an invalid price in USD,
     *                                  number of bedrooms, property type, and/or propertyId.
     */
    public Residence(final double priceInUsd, final Address address, final String type, final String propertyId,
                     final int numberOfBedrooms, final boolean swimmingPool, final boolean strata) {
        super(priceInUsd, address, type, propertyId);
         if(numberOfBedrooms < MIN_NUMBER_BEDROOMS_NOT_ALLOWED) {
             throw new IllegalArgumentException("Invalid number of rooms");
         }
         this.numberOfBedrooms = numberOfBedrooms;
         this.swimmingPool = swimmingPool;
         this.strata = strata;
    }

    /**
     * This is the getNumberOfBedrooms method
     *
     * @return the number of bedrooms in integer format
     */
    public int getNumberOfBedrooms() {
        return  numberOfBedrooms;
    }

    /**
     * This is the isSwimmingPool method
     *
     * @return this will return a boolean value if there is a swimming pool or not
     */
    public boolean isSwimmingPool() {
        return  swimmingPool;
    }

    /**
     * This is the method for isStrata
     *
     * @return this will return a boolean if the place is a strata or not
     */
    public boolean isStrata() {
        return strata;
    }

    /**
     * This is the toString method
     *
     * @return this will return a String value containing numberOfBedrooms, swimmingPool, and strata
     */
    @Override
    public String toString() {
        return "Residence{" +
                "numberOfBedrooms=" + numberOfBedrooms +
                ", swimmingPool=" + swimmingPool +
                ", strata=" + strata +
                '}';
    }
}
