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
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.cityName = cityName;

        if(unit == null) {
            this.unitNumber = unit;
        }
        else if(unit == null || unit.isEmpty()){
            this.unitNumber = unit;
            throw new IllegalArgumentException("Invalid unit number: ");
        }
        else if (unit.length() > 1 && unit.length() < 4) {
            this.unitNumber = unit;
        }
        else {
            throw new IllegalArgumentException("Invalid unit number: " + unit);
        }

    }

    public String getUnitNumber()
    {
        if(unitNumber == null || unitNumber.isEmpty())
        {
            return unitNumber;
        }
        else if (unitNumber.length() > 1 && unitNumber.length() < 4) {
            return unitNumber;
        }
        else {
            throw new IllegalArgumentException("Invalid unit number: " + unitNumber);
        }
    }

    public int getStreetNumber()
    {
        if(streetNumber >= 0 && streetNumber <= 999999)
        {
            return streetNumber;
        }
        throw new IllegalArgumentException("Invalid street number: " + streetNumber);
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
