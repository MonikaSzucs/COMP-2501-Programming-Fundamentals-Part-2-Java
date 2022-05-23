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
    private final int numberOfBedrooms;
    private final boolean swimmingPool;
    private final String type;
    private final String propertyId;

    /**
     * This is a Constructor for the Property Class that will check the values that are passed before assigning the
     * values
     *
     * @param priceInUsd this is the price in US dollars (double) must be position (greater than or equal to zero).
     * @param address this is the address from the Address Class.
     * @param numberOfBedrooms This is the number of bedrooms in Integer value between and/or equal to one to 20.
     * @param swimmingPool this is checking if the property has a swimming pool or not (Boolean).
     * @param type this is the type of property (String) that must be either residence, commercial or retail.
     * @param propertyId this is the propertyId (String) that must be one to six characters in length.
     *
     * @throws IllegalArgumentException this throws an illegal argument exception if there is an invalid price in USD,
     *                                  number of bedrooms, property type, and/or propertyId.
     * @throws NullPointerException this throws a null pointer exception if there is an invalid address,
     *                              property type, and/or propertyId.
     */
    public Property(final double priceInUsd, final Address address, final int numberOfBedrooms,
                    final boolean swimmingPool, final String type, final String propertyId)
    {
        if (priceInUsd >= 0.00)
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

        if (numberOfBedrooms >= 1 && numberOfBedrooms <= 20)
        {
            this.numberOfBedrooms = numberOfBedrooms;
        }
        else
        {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + numberOfBedrooms);
        }

        this.swimmingPool = swimmingPool;

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
        else if(propertyId.isEmpty() || propertyId.length() > 6)
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
        if (priceInUsd >= 0.00)
        {
            return priceInUsd;
        }
        else
        {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + propertyId);
        }
    }

    /**
     * This is the getter method that checks for the number (Integer) of bedrooms are between or equal to one to 20.
     *
     * @return this will return the number of bedrooms (Integer).
     * @throws IllegalArgumentException this throws an illegal argument exception if there is an invalid number of
     *                                  bedrooms.
     */
    public int getNumberOfBedrooms()
    {
        if (numberOfBedrooms >= 1 && numberOfBedrooms <= 20)
        {
            return numberOfBedrooms;
        }
        else
        {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + numberOfBedrooms);
        }
    }

    /**
     * This is a method that checks to see if a property has a swimming pool (Boolean).
     *
     * @return this will return if the property has a swimming pool in a True or False format.
     */
    public boolean hasSwimmingPool()
    {
        return swimmingPool;
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
        else if (propertyId.length() >= 1 && propertyId.length() <= 6)
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
}
