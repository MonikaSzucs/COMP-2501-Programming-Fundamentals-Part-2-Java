import java.util.Locale;

public class Property {
    private double priceInUsd;
    private Object address;
    private final int numberOfBedrooms;
    private final boolean swimmingPool;
    private final String type;
    private final String propertyId;

    public Property(final double priceInUsd, final Object address, final int numberOfBedrooms, final boolean swimmingPool, final String type, final String propertyId)
    {
        this.priceInUsd = priceInUsd;

        if (numberOfBedrooms >= 1 && numberOfBedrooms <= 20) {
            this.numberOfBedrooms = numberOfBedrooms;
        }
        else {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + numberOfBedrooms);
        }

        this.swimmingPool = swimmingPool;
        this.type = type;

        if(propertyId == null)
        {
            this.propertyId = propertyId;
            throw new NullPointerException("Invalid property id: " + propertyId);
        }
        else if(propertyId == null || propertyId.isEmpty())
        {
            this.propertyId = propertyId;
            throw new IllegalArgumentException("Invalid property id: " + propertyId);
        }
        else if (propertyId.length() >= 1 && propertyId.length() <= 6) {
            this.propertyId = propertyId;
        }
        else {
            throw new IllegalArgumentException("Invalid property id: " + propertyId);
        }
    }

    public void setPriceUsd(final double priceInUsd)
    {
        this.priceInUsd = priceInUsd;
    }

    public double getPriceUsd()
    {
        return priceInUsd;
    }

    public Object getAddress()
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
        if(type == null || type.isEmpty())
        {
            return type;
        }
        else if (type.equals("residence") || type.equals("commerical") || type.equals("retail")) {
            return type;
        }
        else {
            throw new IllegalArgumentException("Invalid property id: " + type.toLowerCase());
        }
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
