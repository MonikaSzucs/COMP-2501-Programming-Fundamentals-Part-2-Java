/**
 * Property.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Assignment 1
 *
 * Define a Property class with methods and instance variables.
 *
 * @author Monika Szucs
 *
 * @version 1.3
 *
 */
public class Property
{
    private double priceInUsd;
    private final Address address;
    private final String type;
    private final String propertyId;

    private static final double PRICE_IN_US_DOLLARS_MINIMUM_ZERO = 0.00;
    private static final int NUMBER_OF_BEDROOMS_ONE = 1;
    private static final int NUMBER_OF_BEDROOMS_TWENTY = 20;
    private static final int PROPERTY_ID_LENGTH_SIX = 6;
    private static final int PROPERTY_ID_LENGTH_ONE = 1;

    /**
     * This is a Constructor for the Property Class that will check the values that are passed before assigning the
     * values
     *
     * @param priceInUsd this is the price in US dollars (double) must be position (greater than or equal to zero).
     * @param address this is the address from the Address Class.
     * @param type this is the type of property (String) that must be either residence, commercial or retail.
     * @param propertyId this is the propertyId (String) that must be one to six characters in length.
     *
     * @throws IllegalArgumentException this throws an illegal argument exception if there is an invalid price in USD,
     *                                  number of bedrooms, property type, and/or propertyId.
     * @throws NullPointerException this throws a null pointer exception if there is an invalid address,
     *                              property type, and/or propertyId.
     */
    // private Property p1 = new Property(499000.00, a1, 2, false, "residence", "abc123");
    public Property(final double priceInUsd, final Address address,
                    final String type, final String propertyId)
    {
        if (priceInUsd >= PRICE_IN_US_DOLLARS_MINIMUM_ZERO)
        {
            this.priceInUsd = priceInUsd;
        }
        else
        {
            throw new IllegalArgumentException("Invalid price: " + priceInUsd);
        }

        if(address == null)
        {
            throw new NullPointerException("Invalid address: " + address);
        }
        else
        {
            this.address = address;
        }


        if(type == null)
        {
            throw new NullPointerException("Invalid property type: " + type);
        }
        else if (type.equalsIgnoreCase("residence") || type.equalsIgnoreCase("commercial") || type.equalsIgnoreCase("retail"))
        {
            this.type = type;
        }
        else
        {
            throw new IllegalArgumentException("Invalid property type: " + type.toLowerCase());
        }

        if(propertyId == null)
        {
            throw new NullPointerException("Invalid property id: " + propertyId);
        }
        else if(propertyId.isEmpty() || propertyId.length() > PROPERTY_ID_LENGTH_SIX)
        {
            throw new IllegalArgumentException("Invalid property id: " + propertyId);
        }
        else
        {
            this.propertyId = propertyId;
        }
    }

    /**
     * This is a setter that is used to set the Price in US dollars (Double).
     *
     * @param priceInUsd this is the price in US dollars (Double).
     */
    public void setPriceUsd(final double priceInUsd)
    {
        if(priceInUsd < 0.0) {
            throw new IllegalArgumentException("The price must be greater than zero");
        }
        this.priceInUsd = priceInUsd;
    }

    /**
     * This is the getter method that gets the price in US dollars (double).
     *
     * @return this returns the price in USD as long as it is greater than or equal to 0.0
     * @throws IllegalArgumentException This is an illegal argument exception that gets thrown if there is an
     *                                  invalid number of bedrooms
     */
    public double getPriceUsd()
    {
        if (priceInUsd >= PRICE_IN_US_DOLLARS_MINIMUM_ZERO)
        {
            return priceInUsd;
        }
        else
        {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + propertyId);
        }
    }


    /**
     * This is the method that gets the type of property the home is (residence, commercial or retail) in a
     * String format.
     *
     * @return this will return the type of property the home is in a String format.
     */
    public String getType()
    {
        return type;
    }

    /**
     * This method will get the propertyId in a String format.
     *
     * @return the propertyId (String) if it is greater than or equal to one or less than or equal to six.
     * @throws IllegalArgumentException if there is an illegal argument exception then throw an invalid propertyId
     *                                  message.
     */
    public String getPropertyId()
    {
        if(propertyId == null || propertyId.isEmpty())
        {
            return propertyId;
        }
        else if (propertyId.length() >= PROPERTY_ID_LENGTH_ONE && propertyId.length() <= PROPERTY_ID_LENGTH_SIX)
        {
            return propertyId;
        }
        else
        {
            throw new IllegalArgumentException("Invalid property id: " + propertyId);
        }
    }

    /**
     * This method get the address from the Address class.
     *
     * @return the address.
     */
    public Address getAddress()
    {
        return address;
    }

    @Override
    public String toString() {
        return "Property{" +
                "priceInUsd=" + priceInUsd +
                ", address=" + address +
                ", type='" + type + '\'' +
                ", propertyId='" + propertyId + '\'' +
                '}';
    }
}
