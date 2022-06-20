public class Retail extends Property{
    private int squareFootage;
    private boolean customerParking;

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
    public Retail(double priceInUsd, Address address, String type, String propertyId, final int squareFootage,
                  final boolean customerParking) {
        super(priceInUsd, address, type, propertyId);
        if(squareFootage < 1) {
            throw new IllegalArgumentException("The square footage cannot be 0 or less than 1");
        }
        this.squareFootage = squareFootage;
        this.customerParking = customerParking;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public boolean isCustomerParking() {
        return customerParking;
    }

    @Override
    public String toString() {
        return "Retail{" +
                "squareFootage=" + squareFootage +
                ", customerParking=" + customerParking +
                '}';
    }
}
