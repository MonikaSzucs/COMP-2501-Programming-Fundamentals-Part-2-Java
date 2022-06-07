public class Residence extends Property {

    private int numberOfBedrooms;
    private boolean swimmingPool;
    private boolean strata;

    /**
     * This is a Constructor for the Property Class that will check the values that are passed before assigning the
     * values
     *
     * @param priceInUsd this is the price in US dollars (double) must be position (greater than or equal to zero).
     * @param address    this is the address from the Address Class.
     * @param type       this is the type of property (String) that must be either residence, commercial or retail.
     * @param propertyId this is the propertyId (String) that must be one to six characters in length.
     * @throws IllegalArgumentException this throws an illegal argument exception if there is an invalid price in USD,
     *                                  number of bedrooms, property type, and/or propertyId.
     * @throws NullPointerException     this throws a null pointer exception if there is an invalid address,
     *                                  property type, and/or propertyId.
     */
    public Residence(final double priceInUsd, final Address address, final String type, final String propertyId,
                     final int numberOfBedrooms, final boolean swimmingPool, final boolean strata) {
        super(priceInUsd, address, type, propertyId);
         if(numberOfBedrooms < 1) {
             throw new IllegalArgumentException("Invalid number of rooms");
         }
         this.numberOfBedrooms = numberOfBedrooms;
         this.swimmingPool = swimmingPool;
         this.strata = strata;
    }

    public int getNumberOfBedrooms() {
        return  numberOfBedrooms;
    }

    public boolean isSwimmingPool() {
        return  swimmingPool;
    }

    public boolean isStrata() {
        return strata;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "numberOfBedrooms=" + numberOfBedrooms +
                ", swimmingPool=" + swimmingPool +
                ", strata=" + strata +
                '}';
    }
}
