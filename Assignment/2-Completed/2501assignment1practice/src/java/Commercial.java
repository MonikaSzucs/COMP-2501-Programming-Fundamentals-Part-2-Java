public class Commercial extends Property{
    private boolean loadingDock;
    private boolean highwayAccess;
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
    public Commercial(final double priceInUsd, final Address address, final String type, final String propertyId,
                      final boolean loadingDock, final boolean highwayAccess) {
        super(priceInUsd, address, type, propertyId);
        this.loadingDock = loadingDock;
        this.highwayAccess = highwayAccess;
    }

    public boolean isLoadingDock() {
        return loadingDock;
    }

    public boolean isHighwayAccess() {
        return highwayAccess;
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "loadingDock=" + loadingDock +
                ", highwayAccess=" + highwayAccess +
                '}';
    }
}
