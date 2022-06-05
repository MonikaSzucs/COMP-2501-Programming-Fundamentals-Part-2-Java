import java.util.*;

/**
 * Agency.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Assignment 1
 *
 * Define an Agency class with methods and instance variables.
 *
 * @author Monika Szucs
 *
 * @version 1.3
 *
 */
public class Agency
{
    private final String name;
    private final Map<String, Property> properties;

    private static final int PROPERTY_ARRAY_FIVE = 5;
    private static final int SLICED_STREET_NAME_ONE = 1;
    private static final int SLICED_STREET_NAME_POSITION_ZERO = 0;
    private static final int SLICED_STREET_NAME_POSITION_ONE = 1;
    private static final int SLICED_STREET_NAME_POSITION_SUBSTRING_ZERO = 0;
    private static final int SLICED_STREET_NAME_POSITION_SUBSTRING_ONE = 1;
    private static final int SLICED_CITY_LENGTH_ONE = 1;
    private static final int SLICED_CITY_POSITION_ZERO = 0;
    private static final int SLICED_CITY_POSITION_ONE = 1;
    private static final int SLICED_CITY_SUBSTRING_ZERO = 0;
    private static final int SLICED_CITY_SUBSTRING_ONE = 1;
    private static final int NUMBER_OF_BEDROOMS_ONE = 1;
    private static final int PROPERTY_TYPE_SIZE_TWO = 2;

    /**
     * This is the constructor for the Agency class
     *
     * @param name this contains the name of the agency (String) that is one to 30 characters long.
     */
    public Agency(final String name)
    {
        this.name = name;
        properties = new HashMap<>();
    }

    /**
     * Adding the Property values into the Hashmap
     *
     * @param property this contains the property class as the parameter
     */
    public void addProperty(final Property property)
    {

        properties.put(property.getPropertyId(), property);
    }

    /**
     * Getting the property from the Hashmap with a specific property ID
     *
     * @param propertyId this gets the propertyId value from the Property Object
     * @return this will return the properties that contain the propertyId (String)
     */
    public Property getProperty(final String propertyId)
    {
        return properties.get(propertyId);
    }

    /**
     * Removing the property from the Hashmap with a specific property ID (String)
     *
     * @param propertyId this will remove the property based on the propertyId (String)
     */
    public void removeProperty(final String propertyId)
    {
        properties.remove(propertyId);
    }

    /**
     *This method gets the total property values in USD price (Double).
     *
     * @return this will return the total price USD  of all the properties combined.
     */
    public double getTotalPropertyValues()
    {

        Set<String> propertiesPropertyId;
        propertiesPropertyId = properties.keySet();
        double total = 0.0;
        for(String propertyId: propertiesPropertyId)
        {
            total += getProperty(propertyId).getPriceUsd();
        }
        return total;
    }

    /**
     * This method get the properties that contain pool(s).
     *
     * @return this will return an ArrayList that contains properties with pools.
     */
    public ArrayList<Property> getPropertiesWithPools()
    {
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

    /**
     * This is a method that looks for properties between the minimum and maximum USD price (int).
     *
     * @param minUsd the minimum value of the property in USD price (int)
     * @param maxUsd the maximum values of the property in USD price (int)
     *
     * @return this will return the properties found between and including the minimum and maximum USD price of the
     *          properties in a Property array format.
     */
    public Property[] getPropertiesBetween(final int minUsd, final int maxUsd)
    {
        Property[] propertiesBetween;
        propertiesBetween = new Property[PROPERTY_ARRAY_FIVE];
        int num = 0;

        System.out.println("For Loop:");
        for (Map.Entry me : properties.entrySet())
        {
            System.out.println(me);
            if(properties.get(me.getKey()).getPriceUsd() >= minUsd && properties.get(me.getKey()).getPriceUsd() <= maxUsd)
            {
                System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
                propertiesBetween[num] = properties.get(me.getKey());
                num++;
            }
        }
        return propertiesBetween;
    }

    /**
     * This is a method that is getting the properties on a (String) street name then will return a ArrayList.
     *
     * @param streetName this is the street name the property is located at (String)
     * @return this will return an ArrayList containing the addresses of the properties.
     */
    public ArrayList<Address> getPropertiesOn(final String streetName)
    {
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

    /**
     * This is a method that is looking for the properties with a certain minimum and maximum amount of bedrooms then
     * will return a HashMap.
     *
     * @param minBedrooms this is the minimum amount of bedrooms (int)
     * @param maxBedrooms this is the maximum amount of bedrooms (int)
     * @return this will return a HashMap containing the String and Property.
     */
    public HashMap<String, Property> getPropertiesWithBedrooms(final int minBedrooms, final int maxBedrooms)
    {
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

    /**
     * This is a method that gets the properties of a certain type. It takes in a property of a certain type (String)
     * then returns an ArrayList (String) of that property type.
     *
     * @param propertyType this is a parameter that takes in a String property type.
     * @return this will return an ArrayList containing Strings.
     */
    public ArrayList<String> getPropertiesOfType(final String propertyType)
    {
        ArrayList<String> propertyTypes = new ArrayList<>();
        String prop = "";
        int counter = 1;
        propertyTypes.add("Type: " + propertyType.toUpperCase() + "\n");

        for(String propertyId: properties.keySet())
        {
            //String newPropertyId = propertyId.toUpperCase();
            String[] slicedStreetName = properties.get(propertyId).getAddress().getStreetName().split(" ");
            String newStreeName;
            if(slicedStreetName.length > SLICED_STREET_NAME_ONE)
                {
                    newStreeName = slicedStreetName[SLICED_STREET_NAME_POSITION_ZERO].substring(SLICED_STREET_NAME_POSITION_SUBSTRING_ZERO, SLICED_STREET_NAME_POSITION_SUBSTRING_ONE).toUpperCase() +
                            slicedStreetName[SLICED_STREET_NAME_POSITION_ZERO].substring(SLICED_STREET_NAME_POSITION_SUBSTRING_ONE) + " " +
                            slicedStreetName[SLICED_STREET_NAME_POSITION_ONE].substring(SLICED_STREET_NAME_POSITION_SUBSTRING_ZERO, SLICED_STREET_NAME_POSITION_SUBSTRING_ONE).toUpperCase() +
                            slicedStreetName[SLICED_STREET_NAME_POSITION_ONE].substring(SLICED_STREET_NAME_POSITION_SUBSTRING_ONE) ;
                }
                else
                {
                    newStreeName = slicedStreetName[SLICED_STREET_NAME_POSITION_ZERO].substring(SLICED_STREET_NAME_POSITION_SUBSTRING_ZERO, SLICED_STREET_NAME_POSITION_SUBSTRING_ONE).toUpperCase() +
                        slicedStreetName[SLICED_STREET_NAME_POSITION_ZERO].substring(SLICED_STREET_NAME_POSITION_SUBSTRING_ONE);
            }
            String[] slicedCity = properties.get(propertyId).getAddress().getCity().split(" ");
            String newCity;
            if(slicedCity.length > SLICED_CITY_LENGTH_ONE)
            {
                newCity = slicedCity[SLICED_CITY_POSITION_ZERO].substring(SLICED_CITY_SUBSTRING_ZERO, SLICED_CITY_SUBSTRING_ONE).toUpperCase() +
                        slicedCity[SLICED_CITY_POSITION_ZERO].substring(SLICED_CITY_SUBSTRING_ONE) + " " +
                        slicedCity[SLICED_CITY_POSITION_ONE].substring(SLICED_CITY_SUBSTRING_ZERO, SLICED_CITY_SUBSTRING_ONE).toUpperCase() +
                        slicedCity[SLICED_CITY_POSITION_ONE].substring(SLICED_CITY_SUBSTRING_ONE) ;
            }
            else
            {
                newCity = slicedCity[SLICED_CITY_POSITION_ZERO].substring(SLICED_CITY_SUBSTRING_ZERO, SLICED_CITY_SUBSTRING_ONE).toUpperCase() +
                        slicedCity[SLICED_CITY_POSITION_ZERO].substring(SLICED_CITY_SUBSTRING_ONE);
            }
            if(properties.get(propertyId).getType().equalsIgnoreCase(propertyType))
            {
                if (properties.get(propertyId).getAddress().getUnitNumber() != null)
                {
                    if (properties.get(propertyId).getNumberOfBedrooms() > NUMBER_OF_BEDROOMS_ONE)
                    {
                        if (properties.get(propertyId).hasSwimmingPool())
                        {
                            prop = String.format("%d) Property %s: unit #%s at %d %s %s in %s (%d bedrooms plus pool): $%.0f.\n",
                                    counter,
                                    propertyId.toUpperCase(),
                                    properties.get(propertyId).getAddress().getUnitNumber(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    newStreeName,
                                    properties.get(propertyId).getAddress().getPostalCode().toUpperCase(),
                                    newCity,
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                        else
                        {
                            prop = String.format("%d) Property %s: unit #%s at %d %s %s in %s (%d bedrooms): $%.0f.\n",
                                    counter,
                                    propertyId.toUpperCase(),
                                    properties.get(propertyId).getAddress().getUnitNumber(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    newStreeName,
                                    properties.get(propertyId).getAddress().getPostalCode().toUpperCase(),
                                    newCity,
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                    }
                    else
                    {
                        if (properties.get(propertyId).hasSwimmingPool())
                        {
                            prop = String.format("%d) Property %s: unit #%s at %d %s %s in %s (%d bedroom plus pool): $%.0f.\n",
                                    counter,
                                    propertyId.toUpperCase(),
                                    properties.get(propertyId).getAddress().getUnitNumber(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    newStreeName,
                                    properties.get(propertyId).getAddress().getPostalCode().toUpperCase(),
                                    newCity,
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                        else
                        {
                            prop = String.format("%d) Property %s: unit #%s at %d %s %s in %s (%d bedroom): $%.0f.\n",
                                    counter,
                                    propertyId.toUpperCase(),
                                    properties.get(propertyId).getAddress().getUnitNumber(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    newStreeName,
                                    properties.get(propertyId).getAddress().getPostalCode().toUpperCase(),
                                    newCity,
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                    }
                }
                else
                {
                    if (properties.get(propertyId).getNumberOfBedrooms() > NUMBER_OF_BEDROOMS_ONE)
                    {
                        if (properties.get(propertyId).hasSwimmingPool())
                        {
                            prop = String.format("%d) Property %s: %d %s %s in %s (%d bedrooms plus pool): $%.0f.\n",
                                    counter,
                                    propertyId.toUpperCase(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    newStreeName,
                                    properties.get(propertyId).getAddress().getPostalCode().toUpperCase(),
                                    newCity,
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                        else
                        {
                            prop = String.format("%d) Property %s: %d %s %s in %s (%d bedrooms): $%.0f.\n",
                                    counter,
                                    propertyId.toUpperCase(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    newStreeName,
                                    properties.get(propertyId).getAddress().getPostalCode().toUpperCase(),
                                    newCity,
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                    }
                    else
                    {
                        if (properties.get(propertyId).hasSwimmingPool())
                        {
                            prop = String.format("%d) Property %s: %d %s %s in %s (%d bedroom plus pool): $%.0f.\n",
                                    counter,
                                    propertyId.toUpperCase(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    newStreeName,
                                    properties.get(propertyId).getAddress().getPostalCode().toUpperCase(),
                                    newCity,
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                        else
                        {
                            prop = String.format("%d) Property %s: %d %s %s in %s (%d bedroom): $%.0f.\n",
                                    counter,
                                    propertyId.toUpperCase(),
                                    properties.get(propertyId).getAddress().getStreetNumber(),
                                    newStreeName,
                                    properties.get(propertyId).getAddress().getPostalCode().toUpperCase(),
                                    properties.get(propertyId).getAddress().getCity(),
                                    properties.get(propertyId).getNumberOfBedrooms(),
                                    properties.get(propertyId).getPriceUsd()
                            );
                        }
                    }
                }
                propertyTypes.add(prop);
                prop = "";
                counter++;
            }
        }
        if(propertyTypes.size() < PROPERTY_TYPE_SIZE_TWO)
        {
            String empty = "<none found>";
            propertyTypes.add(empty);
        }
        System.out.println(propertyTypes);
        return propertyTypes;
    }
}
