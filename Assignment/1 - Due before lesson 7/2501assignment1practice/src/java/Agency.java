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
        propertiesBetween = new Property[5];
        int num = 0;

        System.out.println("For Loop:");
        for (Map.Entry me : properties.entrySet()) {
            System.out.println(me);
            //if(num>=5)
             //   {
               //     return propertiesBetween;
                //}
            if(properties.get(me.getKey()).getPriceUsd() >= minUsd && properties.get(me.getKey()).getPriceUsd() <= maxUsd) {
                System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
                propertiesBetween[num] = properties.get(me.getKey());
                num++;
            }
        }
        return propertiesBetween;


        //Property(700000.00, a10, 2, true, "retail", "y6yyy");
        //System.out.println(properties.size());
        //for(Map.Entry propertyId: properties.entrySet())
        //{
            //System.out.println(properties.get(propertyId.getKey()).getPropertyId());
        //    if(num>=5)
        //    {
        //        return propertiesBetween;
        //    }
        //    if(properties.get(propertyId.getKey()).getPriceUsd() >= minUsd && properties.get(propertyId.getKey()).getPriceUsd() <= maxUsd)
        //    {
        //        propertiesBetween[num] = properties.get(propertyId.getKey());
                //System.out.println(properties.get(propertyId.getKey()).getPropertyId());
        //    }
            //System.out.println(properties.get(propertyId).getPropertyId());
        //    num++;
        //}
        //if(propertiesBetween.length < 1)
        //{
        //    return null;
        //}
        //return propertiesBetween;
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
        propertyTypes.add("Type: " + propertyType.toUpperCase() + "\n");

        for(String propertyId: properties.keySet())
        {
            String newPropertyId = propertyId.toUpperCase();
            String[] slicedStreetName = properties.get(propertyId).getAddress().getStreetName().split(" ");
            String newStreeName;
            if(slicedStreetName.length > 1)
                {
                    newStreeName = slicedStreetName[0].substring(0, 1).toUpperCase() +
                            slicedStreetName[0].substring(1) + " " +
                            slicedStreetName[1].substring(0, 1).toUpperCase() +
                            slicedStreetName[1].substring(1) ;
                }
                else{
                    newStreeName = slicedStreetName[0].substring(0, 1).toUpperCase() +
                        slicedStreetName[0].substring(1);
            }
            String[] slicedCity = properties.get(propertyId).getAddress().getCity().split(" ");
            String newCity;
            if(slicedCity.length > 1)
            {
                newCity = slicedCity[0].substring(0, 1).toUpperCase() +
                        slicedCity[0].substring(1) + " " +
                        slicedCity[1].substring(0, 1).toUpperCase() +
                        slicedCity[1].substring(1) ;
            }
            else {
                newCity = slicedCity[0].substring(0, 1).toUpperCase() +
                        slicedCity[0].substring(1);
            }
            if(properties.get(propertyId).getType().equalsIgnoreCase(propertyType)) {

                if (properties.get(propertyId).getAddress().getUnitNumber() != null) {
                    if (properties.get(propertyId).getNumberOfBedrooms() > 1) {
                        if (properties.get(propertyId).hasSwimmingPool()) {
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
                        } else {
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
                    } else {
                        if (properties.get(propertyId).hasSwimmingPool()) {
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
                        } else {
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
                } else {
                    if (properties.get(propertyId).getNumberOfBedrooms() > 1) {
                        if (properties.get(propertyId).hasSwimmingPool()) {
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
                        } else {
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
                    } else {
                        if (properties.get(propertyId).hasSwimmingPool()) {
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
                        } else {
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
        if(propertyTypes.size() < 2)
        {
            String empty = "<none found>";
            propertyTypes.add(empty);
        }

        System.out.println(propertyTypes);
        return propertyTypes;
    }
}
