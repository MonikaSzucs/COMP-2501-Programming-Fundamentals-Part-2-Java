import java.util.HashMap;
import java.util.Locale;

public class Property {
    private double priceUSD;
    private final Address address;
    private final int numberOfBedrooms;
    private final boolean hasSwimmingPool;
    private final String type;
    private final String propertyId;

    public Property(final double priceUSD,
                    final Address address,
                    final int numberOfBedrooms,
                    final boolean hasSwimmingPool,
                    final String type,
                    final String propertyId) {
        if(priceUSD < 0) {
            throw new IllegalArgumentException("Invalid price: " + priceUSD);
        }
        if(address == null){
            throw new NullPointerException("Invalid address: " + address);
        }
        if(numberOfBedrooms < 1 || numberOfBedrooms > 20) {
            throw new IllegalArgumentException("Invalid number of bedrooms: " + numberOfBedrooms);
        }

        if(type == null) {
            throw new NullPointerException("Invalid property type: " + type);
        } else if(type.equalsIgnoreCase("residence") ||
                type.equalsIgnoreCase("commercial") ||
                type.equalsIgnoreCase("retail")) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Invalid property type: " + type.toLowerCase());
        }

        if(propertyId == null) {
            throw new NullPointerException("Invalid property id: " + propertyId);
        } else if(propertyId.isEmpty() || propertyId.length() < 1 || propertyId.length() > 6) {
            throw new IllegalArgumentException("Invalid property id: " + propertyId);
        }

        this.priceUSD = priceUSD;
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.hasSwimmingPool = hasSwimmingPool;

        this.propertyId = propertyId;
    }

    public void setPriceUsd(final double priceUSD) {
        this.priceUSD = priceUSD;
    }

    public double getPriceUsd() {
        return priceUSD;
    }

    public Address getAddress() {
        return address;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }

    public String getType() {
        return type;
    }

    public String getPropertyId() {
        return propertyId;
    }


}
