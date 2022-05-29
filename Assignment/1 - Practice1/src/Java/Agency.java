import java.nio.charset.StandardCharsets;
import java.util.*;

public class Agency {
    private Map<String, Property> properties;
    private final String name;

    public Agency(final String name) {
        properties = new HashMap<>();
        this.name = name;
    }

    public void addProperty(Property property) {
        properties.put(property.getPropertyId(), property);
    }

    public Property getProperty(final String propertyId) {
        return properties.get(propertyId);
    }

    public void removeProperty(final String propertyId) {
        properties.remove(propertyId);
    }

    public double getTotalPropertyValues() {
        Set<String> propertyGettingIds;
        propertyGettingIds = properties.keySet();
        double total = 0.0;
        for(String property: propertyGettingIds) {
            total += getProperty(property).getPriceUsd();
        }
        return total;
    }

    public ArrayList<Property> getPropertiesWithPools() {
        ArrayList<Property> propertiesWithPools;
        propertiesWithPools = new ArrayList<>();

        Set<String> setOfPropertyIds;
        setOfPropertyIds = properties.keySet();

        for(String propertyId: setOfPropertyIds) {
            getProperty(propertyId).hasSwimmingPool();
            if(getProperty(propertyId).hasSwimmingPool()) {
                propertiesWithPools.add(getProperty(propertyId));
            }
        }
        return propertiesWithPools;
    }

    public Property[] getPropertiesBetween(int minUsd, int maxUsd) {
        Property[] propertiesBetween;
        propertiesBetween = new Property[5];
        int num = 0;

        for(Map.Entry property: properties.entrySet()) {
            if(properties.get(property.getKey()).getPriceUsd() >= minUsd &&
                    properties.get(property.getKey()).getPriceUsd() <= maxUsd) {
                System.out.println("Key: " + property.getKey() + " & Value: " + property.getValue());
                propertiesBetween[num] = properties.get(property.getKey());
                        num++;
            }
        }
        return propertiesBetween;
    }

    public ArrayList<Address> getPropertiesOn(String streetName) {
        ArrayList<Address> sameStreet;
        sameStreet = new ArrayList<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId).getAddress().getStreetName().equalsIgnoreCase(streetName)) {
                sameStreet.add(properties.get(propertyId).getAddress());
            }
        }
        if(sameStreet.isEmpty()) {
            return null;
        }
        return sameStreet;
    }

    public HashMap<String,Property> getPropertiesWithBedrooms(int minBedrooms, int maxBedrooms) {
        HashMap<String, Property> propertyBedrooms;
        propertyBedrooms = new HashMap<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId).getNumberOfBedrooms() >= minBedrooms &&
                properties.get(propertyId).getNumberOfBedrooms() <= maxBedrooms) {
                propertyBedrooms.put(propertyId, properties.get(propertyId));
            }
        } if (propertyBedrooms.isEmpty()) {
            return null;
        }
        return propertyBedrooms;
    }

    public ArrayList<String> getPropertiesOfType(String type) {
        ArrayList<String> propertyTypes;
        propertyTypes = new ArrayList<>();

        String prop = null;
        int counter = 1;
        propertyTypes.add("Type: " + type.toUpperCase() + "\n");

        for(String propertyId: properties.keySet()) {
            String[] slicedStreetName = properties.get(propertyId).getAddress().getStreetName().split(" ");
            String newStreetName;
            if(slicedStreetName.length > 1) {
                newStreetName = slicedStreetName[0].substring(0,1).toUpperCase() +
                        slicedStreetName[0].substring(1) + " " +
                        slicedStreetName[1].substring(0,1).toUpperCase() +
                        slicedStreetName[1].substring(1);
            }

        }

        return propertyTypes;
    }
}
