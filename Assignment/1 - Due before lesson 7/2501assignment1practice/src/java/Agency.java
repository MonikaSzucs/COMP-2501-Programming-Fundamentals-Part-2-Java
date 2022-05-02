import java.util.*;

public class Agency {
    private final String name;
    private final Map<String, Property> properties;

    public Agency(final String name)
    {
        this.name = name;
        properties = new HashMap<>();
    }

    /**
     * Adding the Property into the Hashmap
     *
     * @param property
     */
    public void addProperty(Property property)
    {

        properties.put(property.getPropertyId(), property);
    }

    /**
     * Getting the property from the Hashmap with a specific property ID
     *
     * @param propertyId
     * @return
     */
    public Property getProperty(String propertyId)
    {
        return properties.get(propertyId);
    }

    /**
     * Removing the property from the Hashmap with a specific property ID
     *
     * @param propertyId
     */
    public void removeProperty(String propertyId) {
        properties.remove(propertyId);
    }

    /**
     *
     *
     * @return
     */
    public double getTotalPropertyValues() {

        Set<String> propertiesPropertyId;
        propertiesPropertyId = properties.keySet();
        double total = 0.0;
        for(String propertyId: propertiesPropertyId)
        {
            total += getProperty(propertyId).getPriceUsd();
        }
        return total;
    }

    public ArrayList<Property> getPropertiesWithPools() {
        ArrayList<Property> propertiesWithPools;
        propertiesWithPools = new ArrayList<>();

        Set<String> setOfPropertyIds;
        setOfPropertyIds = properties.keySet();

        for(String propertyId: setOfPropertyIds)
        {
            getProperty(propertyId).hasSwimmingPool();
            if(getProperty(propertyId).hasSwimmingPool())
            {
                propertiesWithPools.add(getProperty(propertyId));
            }
        }
        return propertiesWithPools;
    }

    public Property[] getPropertiesBetween(int minUsd, int maxUsd) {
        Property[] propertiesBetween;
        propertiesBetween = new Property[10];
        int num = 0;
        for(String propertyId: properties.keySet())
        {
            if(properties.get(propertyId).getPriceUsd() >= minUsd && properties.get(propertyId).getPriceUsd() <= maxUsd)
            {
                propertiesBetween[num] = properties.get(propertyId);
            }
            num++;
        }
        if(propertiesBetween.length < 1)
        {
            return null;
        }
        return propertiesBetween;
    }

    public ArrayList<Address> getPropertiesOn(String streetName) {
        ArrayList<Address> sameStreet = new ArrayList<>();
        for(String propertyId: properties.keySet())
        {
            if(properties.get(propertyId).getAddress().getStreetName().equalsIgnoreCase(streetName))
            {
                sameStreet.add(properties.get(propertyId).getAddress());
            }
        }
        if(sameStreet.isEmpty())
        {
            return null;
        }
        return sameStreet;
    }

    public HashMap<String,Property> getPropertiesWithBedrooms(int minBedrooms, int maxBedrooms) {
        HashMap<String, Property> bedroomMap = new HashMap<>();
        for(String propertyId: properties.keySet())
        {
            if(properties.get(propertyId).getNumberOfBedrooms() >= minBedrooms && properties.get(propertyId).getNumberOfBedrooms() <= maxBedrooms)
            {
                bedroomMap.put(propertyId, properties.get(propertyId));
            }
        }
        if(bedroomMap.isEmpty())
        {
            return null;
        }
        return bedroomMap;
    }

    public ArrayList<String> getPropertiesOfType(String propertyType) {
        ArrayList<String> propertyTypes = new ArrayList<>();
        String prop = "";
        int counter = 1;
        for(String propertyId: properties.keySet())
        {
            if(properties.get(propertyId).getType().equalsIgnoreCase(propertyType))
            {
                if(properties.get(propertyId).getAddress().getUnitNumber() != null)
                {
                    if(properties.get(propertyId).getNumberOfBedrooms() > 1)
                    {
                        if(properties.get(propertyId).hasSwimmingPool())
                        {
                            prop = String.format("%d) Property %s: unit #%s at %d %s %s in %s (%d bedrooms plus pool): $%f.", counter,
                                    propertyId,
                                    properties.get(propertyId).getAddress().getUnitNumber(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    properties.get(propertyId).getAddress().getStreetName(),
                                    properties.get(propertyId).getAddress().getPostalCode(),
                                    properties.get(propertyId).getAddress().getCity(),
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                        else
                        {
                            prop = String.format("%d) Property %s: unit #%s at %d %s %s in %s (%d bedrooms): $%f.", counter,
                                    propertyId,
                                    properties.get(propertyId).getAddress().getUnitNumber(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    properties.get(propertyId).getAddress().getStreetName(),
                                    properties.get(propertyId).getAddress().getPostalCode(),
                                    properties.get(propertyId).getAddress().getCity(),
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                    }
                    else
                    {
                        prop = String.format("%d) Property %s: unit #%s at %d %s %s in %s (%d bedroom): $%f.", counter,
                                propertyId,
                                properties.get(propertyId).getAddress().getUnitNumber(),
                                properties.get(propertyId).getAddress().getStreetNumber(),
                                properties.get(propertyId).getAddress().getStreetName(),
                                properties.get(propertyId).getAddress().getPostalCode(),
                                properties.get(propertyId).getAddress().getCity(),
                                properties.get(propertyId).getNumberOfBedrooms(),
                                properties.get(propertyId).getPriceUsd()
                        );
                    }
                }
                else
                {
                    if(properties.get(propertyId).getNumberOfBedrooms() > 1)
                    {
                        if(properties.get(propertyId).hasSwimmingPool())
                        {
                            prop = String.format("%d) Property %s: %d %s %s in %s (%d bedrooms plus pool): $%f.", counter,
                                    propertyId,
                                    properties.get(propertyId).getAddress().getUnitNumber(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    properties.get(propertyId).getAddress().getStreetName(),
                                    properties.get(propertyId).getAddress().getPostalCode(),
                                    properties.get(propertyId).getAddress().getCity(),
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                        else
                        {
                            prop = String.format("%d) Property %s: %d %s %s in %s (%d bedrooms): $%f.", counter,
                                    propertyId,
                                    properties.get(propertyId).getAddress().getUnitNumber(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    properties.get(propertyId).getAddress().getStreetName(),
                                    properties.get(propertyId).getAddress().getPostalCode(),
                                    properties.get(propertyId).getAddress().getCity(),
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                    }
                }
            }
        }
        return null;
    }
}
