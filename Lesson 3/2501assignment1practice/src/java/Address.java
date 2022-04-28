public class Address
{
    private final String unitNumber;
    private final int streetNumber;
    private final String streetName;
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

    public Object getUnitNumber()
    {
        return unitNumber;
    }

    public int getStreetNumber()
    {
        if(streetNumber >= 0 && streetNumber <= 999999)
        {
            return streetNumber;
        }
        throw new IllegalArgumentException();
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getCity()
    {
        return cityName;
    }
}
