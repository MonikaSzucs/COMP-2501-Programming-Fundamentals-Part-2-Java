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
}
