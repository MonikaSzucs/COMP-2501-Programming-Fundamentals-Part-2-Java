import java.util.*;

/**
 * Agency.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Assignment 2
 *
 * Define an Agency class with methods and instance variables.
 *
 * @author Monika Szucs
 *
 * @version 1.3
 *
 */
public class Agency {
    private final String name;
    private final Map<String, Property> properties;

    public static final double  TOTAL_PRICE_USD_MINIMUM = 0.0;
    public static final int     MINIMUM_STARTING_POINT_ARRAY = 0;
    public static final int     NULL_ARRAY_LENGTH = 0;
    public static final int     NULL_SAME_STREET_SIZE = 0;

    /**
     * This is the constructor for the Agency class
     *
     * @param name this contains the name of the agency (String) that is one to 30 characters long.
     */
    public Agency(final String name) {
        this.name = name;
        properties = new HashMap<>();
    }

    /**
     * Adding the Property values into the Hashmap
     *
     * @param property this contains the property class as the parameter
     */
    public void addProperty(final Property property) {
        properties.put(property.getPropertyId(), property);
    }

    /**
     * Getting the property from the Hashmap with a specific property ID
     *
     * @param id this gets the propertyId value from the Property Object
     * @return this will return the properties that contain the propertyId (String)
     */
    public Property getProperty(final String id) {
        return properties.get(id);
    }

    /**
     * Removing the property from the Hashmap with a specific property ID (String)
     *
     * @param propertyId this will remove the property based on the propertyId (String)
     */
    public void removeProperty(final String propertyId) {
        properties.remove(propertyId);
    }

    /**
     *This method gets the total property values in USD price (Double).
     *
     * @return this will return the total price USD  of all the properties combined.
     */
    public double getTotalPropertyValues() {
        Set<String> propertiesPropertyId;
        double total;

        propertiesPropertyId = properties.keySet();
        total = TOTAL_PRICE_USD_MINIMUM;

        for(String propertyId: propertiesPropertyId) {
            total += getProperty(propertyId).getPriceUsd();
        }
        return total;
    }

    /**
     * This method get the properties that contain pool(s).
     *
     * @return this will return an ArrayList that contains properties with pools.
     */
    public ArrayList<Property> getPropertiesWithPools() {
        ArrayList<Property> propertiesWithPools;
        Set<String> keys;

        propertiesWithPools = new ArrayList<>();
        keys = properties.keySet();

        for(String propertyId: keys) {
            if(properties.get(propertyId) instanceof Residence) {
                Residence res;

                res = (Residence) properties.get(propertyId);

                if(res.isSwimmingPool()) {
                    propertiesWithPools.add(res);
                }
            }
        }
        return propertiesWithPools;
    }

    /**
     * This is a method that looks for properties between the minimum and maximum USD price (int).
     *
     * @param minUsd the minimum value of the property in USD price (int)
     * @param maxUsd the maximum values of the property in USD price (int)
     *
     * @return this will return the properties found between and including the minimum and maximum USD price of the
     *          properties in a Property array format.
     */
    public Property[] getPropertiesBetween(final int minUsd, final int maxUsd) {
        ArrayList<Property> arr;

        arr = new ArrayList<>();

        for(String id: properties.keySet()) {
            if(properties.get(id).getPriceUsd() >= minUsd && properties.get(id).getPriceUsd() <= maxUsd) {
                arr.add(properties.get(id));
            }
        }

        Property[] finalArr = new Property[arr.size()];
        for(int i = MINIMUM_STARTING_POINT_ARRAY; i < arr.size(); i++) {
            finalArr[i] = arr.get(i);
        }
        if(finalArr.length == NULL_ARRAY_LENGTH) {
            return null;
        }
        return finalArr;
    }

    /**
     * This is a method that is getting the properties on a (String) street name then will return a ArrayList.
     *
     * @param streetName this is the street name the property is located at (String)
     * @return this will return an ArrayList containing the addresses of the properties.
     */
    public ArrayList<Address> getPropertiesOn(final String streetName) {
        System.out.println(streetName);

        ArrayList<Address> sameStreet;

        sameStreet = new ArrayList<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId).getAddress().getStreetName().equalsIgnoreCase(streetName)) {
                sameStreet.add(properties.get(propertyId).getAddress());
            }
        }

        if(sameStreet.size() == NULL_SAME_STREET_SIZE) {
            return null;
        }
        return sameStreet;
    }

    /**
     * This is a method that is looking for the properties with a certain minimum and maximum amount of bedrooms then
     * will return a HashMap.
     *
     * @param minBedrooms this is the minimum amount of bedrooms (int)
     * @param maxBedrooms this is the maximum amount of bedrooms (int)
     * @return this will return a HashMap containing the String and Property.
     */
    public HashMap<String, Residence> getPropertiesWithBedrooms(final int minBedrooms, final int maxBedrooms) {
        HashMap<String, Residence> bedroomMap;

        bedroomMap = new HashMap<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId) instanceof Residence) {
                Residence res;

                res = (Residence) properties.get(propertyId);

                if (res.getNumberOfBedrooms() >= minBedrooms && res.getNumberOfBedrooms() <= maxBedrooms) {
                    bedroomMap.put(propertyId, res);
                }
            }
        }
        if(bedroomMap.isEmpty()) {
            return null;
        }
        return bedroomMap;
    }

    /**
     * This is a method that gets the properties of a certain type. It takes in a property of a certain type (String)
     * then returns an ArrayList (String) of that property type.
     *
     * @param propertyType this is a parameter that takes in a String property type.
     * @return this will return an ArrayList containing Strings.
     */
    public ArrayList<Property> getPropertiesOfType(final String propertyType) {
        ArrayList<Property> propertyList;

        propertyList = new ArrayList<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId).getType().equalsIgnoreCase(propertyType)) {
                propertyList.add(properties.get(propertyId));
            }
        }
        return propertyList;
    }

    public ArrayList<Commercial> getPropertiesWithLoadingDock() {
        ArrayList<Commercial> list;

        list = new ArrayList<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId) instanceof Commercial) {
                Commercial prop;

                prop = (Commercial) properties.get(propertyId);

                if(prop.isLoadingDock()) {
                    list.add(prop);
                }
            }
        }
        return list;
    }

    public ArrayList<Commercial> getPropertiesWithHighwayAccess() {
        ArrayList<Commercial> list;

        list = new ArrayList<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId) instanceof Commercial) {
                Commercial prop;

                prop = (Commercial) properties.get(propertyId);

                if(prop.isHighwayAccess()) {
                    list.add(prop);
                }
            }
        }
        return list;
    }

    public ArrayList<Retail> getPropertiesWithSquareFootage(int squareFootage) {
        ArrayList<Retail> list;

        list = new ArrayList<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId) instanceof Retail) {
                Retail prop;

                prop = (Retail) properties.get(propertyId);

                if(prop.getSquareFootage() >= squareFootage) {
                    list.add(prop);
                }
            }
        }
        return list;
    }

    public ArrayList<Retail> getPropertiesWithCustomerParking() {
        ArrayList<Retail> list;

        list = new ArrayList<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId) instanceof Retail) {
                Retail prop;

                prop = (Retail) properties.get(propertyId);

                if(prop.isCustomerParking()) {
                    list.add(prop);
                }
            }
        }
        return list;
    }

    public ArrayList<Residence> getPropertiesWithStrata() {
        ArrayList<Residence> list;

        list = new ArrayList<>();

        for(String propertyId: properties.keySet()) {
            if(properties.get(propertyId) instanceof Residence) {
                Residence prop;

                prop = (Residence) properties.get(propertyId);

                if(prop.isStrata()) {
                    list.add(prop);
                }
            }
        }
        return list;
    }
}
