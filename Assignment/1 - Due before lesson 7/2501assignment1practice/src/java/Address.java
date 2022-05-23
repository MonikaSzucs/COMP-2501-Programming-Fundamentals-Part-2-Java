/**
 * Address.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Assignment 1
 *
 * Define an Address class with methods and instance variables.
 *
 * @author Monika Szucs
 *
 * @version 1.3
 *
 */
public class Address
{
    private final String    unitNumber;
    private final int       streetNumber;
    private final String    streetName;
    private final String    postalCode;
    private final String    cityName;

    /**
     * This is the Constructor for teh Address class.
     *
     * @param unit          This is the unit number of the place (String) which is one to four characters long.
     * @param streetNumber  This is the street number (Integer) that is between and equal to zero to 999999.
     * @param streetName    This is the street name (String) that is one to 20 characters long.
     * @param postalCode    This is the postal code (String) that is either length 5 or 6.
     * @param cityName      This is the city name (String) that is one to 30 characters long.
     *
     * @throws NullPointerException     This returns a null pointer exception if value is null.
     * @throws IllegalArgumentException This returns a illegal argument exception if the value is not valid.
     */
    public Address(final String unit, final int streetNumber, final String streetName, final String postalCode,
                   final String cityName)
    {
        if(streetName == null)
        {
            this.postalCode = streetName;
            throw new NullPointerException("Invalid street name: " + streetName);
        }
        else if(streetName == null || streetName.isEmpty())
        {
            this.streetName = streetName;
            throw new IllegalArgumentException("Invalid street name: " + streetName);
        }
        else if (streetName.length() >= 1 && streetName.length() <= 20)
        {
            this.streetName = streetName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid street name: " + streetName);
        }

        if (streetNumber >= 0 && streetNumber <= 999999)
        {
            this.streetNumber = streetNumber;
        }
        else
        {
            throw new IllegalArgumentException("Invalid street number: " + streetNumber);
        }

        if(postalCode == null)
        {
            this.postalCode = postalCode;
            throw new NullPointerException("Invalid postal code: " + postalCode);
        }
        else if(postalCode == null || postalCode.isEmpty())
        {
            this.postalCode = postalCode;
            throw new IllegalArgumentException("Invalid postal code: " + postalCode);
        }
        else if (postalCode.length() == 5 || postalCode.length() == 6)
        {
            this.postalCode = postalCode;
        }
        else if(postalCode.length() < 5 || postalCode.length() > 6)
        {
            this.postalCode = postalCode;
            throw new IllegalArgumentException("Invalid postal code: " + postalCode);
        }
        else
        {
            throw new IllegalArgumentException("Invalid postal code: " + cityName);
        }

        if(cityName == null)
        {
            this.cityName = unit;
            throw new NullPointerException("Invalid city: " + cityName);
        }
        else if(cityName == null || cityName.isEmpty())
        {
            this.cityName = cityName;
            throw new IllegalArgumentException("Invalid city: " + cityName);
        }
        else if (cityName.length() >= 1 && cityName.length() <= 30)
        {
            this.cityName = cityName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid city: " + cityName);
        }

        if(unit == null)
        {
            this.unitNumber = unit;
        }
        else if(unit == null || unit.isEmpty())
        {
            this.unitNumber = unit;
            throw new IllegalArgumentException("Invalid unit number: ");
        }
        else if (unit.length() >= 1 && unit.length() <= 4)
        {
            this.unitNumber = unit;
        }
        else
        {
            throw new IllegalArgumentException("Invalid unit number: " + unit);
        }
    }

    /**
     * This method gets the unit number of the address
     *
     * @return the unit number (String) if it is between or equal to one to four characters
     * @throws IllegalArgumentException This will return an illegal argument exception if the unit number is not valid
     */
    public String getUnitNumber()
    {
        if(unitNumber == null || unitNumber.isEmpty())
        {
            return unitNumber;
        }
        else if (unitNumber.length() >= 1 && unitNumber.length() <= 4)
        {
            return unitNumber;
        }
        else
        {
            throw new IllegalArgumentException("Invalid unit number: " + unitNumber);
        }
    }

    /**
     * This method gets the street number of the address
     *
     * @return this will return the street number (Integer) that is between or equal to zero to 999999.
     * @throws IllegalArgumentException this will throw an illegal argument exception if the street number is invalid.
     */
    public int getStreetNumber()
    {
        if (streetNumber >= 0 && streetNumber <= 999999)
        {
            return streetNumber;
        }
        else
        {
            throw new IllegalArgumentException("Invalid street number: " + streetNumber);
        }
    }

    /**
     * This method gets the street name (String) of the address
     *
     * @return this will return the street name (String) that is one to twenty characters long
     * @throws IllegalArgumentException this will throw an illegal argument exception if the street name length is
     *                                  invalid.
     */
    public String getStreetName()
    {
        if(streetName == null || streetName.isEmpty())
        {
            return streetName;
        }
        else if (streetName.length() >= 1 && streetName.length() <= 20)
        {
            return streetName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid street name: " + streetName);
        }
    }

    /**
     * This method gets the postal code for the address.
     *
     * @return This will return the postal code (String) that is of length 5 or 6 only.
     * @throws IllegalArgumentException this will throw an illegal argument exception if the length is not 5 or 6.
     */
    public String getPostalCode()
    {
        if(postalCode == null || postalCode.isEmpty())
        {
            return postalCode;
        }
        else if (postalCode.length() == 5 || postalCode.length() == 6)
        {
            return postalCode;
        }
        else
        {
            throw new IllegalArgumentException("Invalid postal code: " + postalCode);
        }
    }

    /**
     * This method will get the city of the address class.
     *
     * @return this will return the city name (String) which is one to 30 characters in length.
     * @throws IllegalArgumentException this will throw an illegal argument exception if there is an invalid city name.
     */
    public String getCity()
    {
        if(cityName == null || cityName.isEmpty())
        {
            return cityName;
        }
        else if (cityName.length() >= 1 && cityName.length() <= 30)
        {
            return cityName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid city: " + cityName);
        }
    }
}
