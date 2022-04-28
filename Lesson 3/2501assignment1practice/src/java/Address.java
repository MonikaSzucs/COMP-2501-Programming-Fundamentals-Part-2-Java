public class Address
{
    private String unitNumber;
    private final int streetNumber;
    private String streetName;
    private final String postalCode;
    private final String cityName;

    public Address(final String unit, final int streetNumber, final String streetName, final String postalCode,
                   final String cityName)
    {
        this.unitNumber = unit;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.cityName = cityName;
    }

    public void setUnitNumber(String unitNumber)
    {
        if(unitNumber == null)
        {
            this.unitNumber = unitNumber;
        }
        else if(unitNumber.length() >= 1 && unitNumber.length() <=4)
        {
            this.unitNumber = unitNumber;
        }
        else if(unitNumber == null)
        {
            throw new NullPointerException("Invalid unit number: " + unitNumber);
        }
        throw new IllegalArgumentException("Invalid unit number: " + unitNumber);
    }

    public String getUnitNumber()
    {
        if(unitNumber == null)
        {
            return unitNumber;
        }
        else if(unitNumber.length() >= 1 && unitNumber.length() <=4)
        {
            return unitNumber;
        }
        else if(unitNumber == null)
        {
            throw new NullPointerException("Invalid unit number: " + unitNumber);
        }
        throw new IllegalArgumentException("Invalid unit number: " + unitNumber);
    }

    public int getStreetNumber()
    {
        if(streetNumber >= 0 && streetNumber <= 999999)
        {
            return streetNumber;
        }
        throw new IllegalArgumentException("Invalid street number: " + streetNumber);
    }

    public void setStreetName(String streetName)
    {
        if(streetName != null && !streetName.isEmpty())
        {
            if(streetName.length() >= 1 && streetName.length() <= 20)
            {
                this.streetName = streetName;
            }
        }
        else if(streetName == null)
        {
            throw new NullPointerException("Invalid street name: " + streetName);
        }
        throw new IllegalArgumentException("Invalid street name: " + streetName);
    }

    public String getStreetName()
    {
        if(streetName != null && !streetName.isEmpty())
        {
            if(streetName.length() >= 1 && streetName.length() <= 20)
            {
                return streetName;
            }
        }
        else if(streetName == null)
        {
            throw new NullPointerException("Invalid street name: " + streetName);
        }
        throw new IllegalArgumentException("Invalid street name: " + streetName);
    }

    public String getPostalCode()
    {
        if(postalCode.length() == 5 || postalCode.length() == 6)
        {
            return postalCode;
        }
        throw new IllegalArgumentException("Invalid postal code: " + postalCode);

    }

    public String getCity()
    {
        if(cityName.length() >= 1 && cityName.length() <= 30)
        {
            return cityName;
        }
        throw new IllegalArgumentException("Invalid street name: " + cityName);
    }
}
