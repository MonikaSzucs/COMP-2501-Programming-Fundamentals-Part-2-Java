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
        else if (streetName.length() >= 1 && streetName.length() <= 20) {
            this.streetName = streetName;
        }
        else {
            throw new IllegalArgumentException("Invalid street name: " + streetName);
        }

        if (streetNumber >= 0 && streetNumber <= 999999) {
            this.streetNumber = streetNumber;
        }
        else {
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
        else if (postalCode.length() == 5 || postalCode.length() == 6) {
            this.postalCode = postalCode;
        }
        else if(postalCode.length() < 5 || postalCode.length() > 6)
        {
            this.postalCode = postalCode;
            throw new IllegalArgumentException("Invalid postal code: " + postalCode);
        }
        else {
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
        else if (cityName.length() >= 1 && cityName.length() <= 30) {
            this.cityName = cityName;
        }
        else {
            throw new IllegalArgumentException("Invalid city: " + cityName);
        }

        if(unit == null) {
            this.unitNumber = unit;
        }
        else if(unit == null || unit.isEmpty()){
            this.unitNumber = unit;
            throw new IllegalArgumentException("Invalid unit number: ");
        }
        else if (unit.length() >= 1 && unit.length() <= 4) {
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
        else if (unitNumber.length() >= 1 && unitNumber.length() <= 4) {
            return unitNumber;
        }
        else {
            throw new IllegalArgumentException("Invalid unit number: " + unitNumber);
        }
    }

    public int getStreetNumber()
    {
        if (streetNumber >= 0 && streetNumber <= 999999) {
            return streetNumber;
        }
        else {
            throw new IllegalArgumentException("Invalid street number: " + streetNumber);
        }
    }

    public String getStreetName()
    {
        if(streetName == null || streetName.isEmpty())
        {
            return streetName;
        }
        else if (streetName.length() >= 1 && streetName.length() <= 20) {
            return streetName;
        }
        else {
            throw new IllegalArgumentException("Invalid street name: " + streetName);
        }
    }

    public String getPostalCode()
    {
        if(postalCode == null || postalCode.isEmpty())
        {
            return postalCode;
        }
        else if (postalCode.length() == 5 || postalCode.length() == 6) {
            return postalCode;
        }
        else {
            throw new IllegalArgumentException("Invalid postal code: " + postalCode);
        }
    }

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
