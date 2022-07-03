import java.util.Locale;

public class Property {
    private double priceInUsd;
    private final Address address;
    private final int numberOfBedrooms;
    private final boolean swimmingPool;
    private final String type;
    private final String propertyId;

    public Property(final double priceInUsd, final Address address, final int numberOfBedrooms, final boolean swimmingPool, final String type, final String propertyId)
    {

        if (priceInUsd >= 0.00) {
            this.priceInUsd = priceInUsd;
        }
        else {
            throw new IllegalArgumentException("Invalid price: " + priceInUsd);
        }

        if(address == null)
        {
            throw new NullPointerException("Invalid property id: " + address);
        }
        else
        {
            this.address = address;
        }

        if (numberOfBedrooms >= 1 && numberOfBedrooms <= 20) {
            this.numberOfBedrooms = numberOfBedrooms;
        }
        else {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + numberOfBedrooms);
        }

        this.swimmingPool = swimmingPool;

        if (type.equalsIgnoreCase("residence") || type.equalsIgnoreCase("commercial") || type.equalsIgnoreCase("retail"))
        {
            this.type = type;
        }
        else {
            throw new IllegalArgumentException("Invalid property type: " + type.substring(0,4) + type.substring(4, 5).toUpperCase() + type.substring(5));
        }

        if(propertyId == null)
        {
//            this.propertyId = propertyId;
            throw new NullPointerException("Invalid property id: " + propertyId);
        }
        else if(propertyId.isEmpty() || propertyId.length() > 6)
        {
//            this.propertyId = propertyId;
            throw new IllegalArgumentException("Invalid property id: " + propertyId);
        }
        else
        {
            this.propertyId = propertyId;
        }
    }

    public void setPriceUsd(final double priceInUsd)
    {
        this.priceInUsd = priceInUsd;
    }

    public double getPriceUsd()
    {
        if (priceInUsd >= 0.00) {
            return priceInUsd;
        }
        else {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + propertyId);
        }
    }

    public Address getAddress()
    {
        return address;
    }

    public int getNumberOfBedrooms()
    {
        if (numberOfBedrooms >= 1 && numberOfBedrooms <= 20) {
            return numberOfBedrooms;
        }
        else {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + numberOfBedrooms);
        }
    }

    public boolean hasSwimmingPool()
    {
        return swimmingPool;
    }

    public String getType()
    {
        return type;
    }

    public String getPropertyId()
    {
        if(propertyId == null || propertyId.isEmpty())
        {
            return propertyId;
        }
        else if (propertyId.length() >= 1 && propertyId.length() <= 6) {
            return propertyId;
        }
        else {
            throw new IllegalArgumentException("Invalid property id: " + propertyId);
        }
    }

}