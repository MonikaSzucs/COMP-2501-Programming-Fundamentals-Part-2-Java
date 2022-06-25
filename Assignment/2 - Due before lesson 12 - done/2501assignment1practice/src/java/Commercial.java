public class Commercial extends Property {
    private boolean loadingDock;
    private boolean highwayAccess;

    /**
     * Commercial.java
     * COMP 2501 - CRN: 67139
     * Wednesday evenings, Spring/Summer 2022
     * Assignment 2
     *
     * Define a Commercial class with methods and instance variables.
     *
     * @author Monika Szucs
     *
     * @version 1.3
     *
     */
    public Commercial(final double priceInUsd, final Address address, final String type, final String propertyId,
                      final boolean loadingDock, final boolean highwayAccess) {
        super(priceInUsd, address, type, propertyId);
        this.loadingDock = loadingDock;
        this.highwayAccess = highwayAccess;
    }

    /**
     * This is a method for the isLoadingDock
     *
     * @return this will return the loading dock in a boolean value
     */
    public boolean isLoadingDock() {
        return loadingDock;
    }

    /**
     * This is the method for the isHighwayAccess
     *
     * @return this will return the highway access in a boolean value
     */
    public boolean isHighwayAccess() {
        return highwayAccess;
    }

    /**
     * This is the toString method
     *
     * @return this will return a string containing the loading dock and highway access
     */
    @Override
    public String toString() {
        return "Commercial{" +
                "loadingDock=" + loadingDock +
                ", highwayAccess=" + highwayAccess +
                '}';
    }
}
