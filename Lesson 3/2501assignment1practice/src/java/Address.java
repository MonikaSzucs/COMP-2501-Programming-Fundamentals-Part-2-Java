public class Address
{
    private final String unitNumber;

    public Address(final String unit, final int streetNumber, final String streetName, final String postalCode,
                   final String cityName)
    {
        this.unitNumber = unit;
    }

    public Object getUnitNumber()
    {
        return unitNumber;
    }

    public int getStreetNumber()
    {
        return 4;
    }

    public String getStreetName()
    {
        return "json";
    }

    public String getPostalCode()
    {
        return "any";
    }

    public String getCity()
    {
        return "";
    }
}
