package src.java;

public class Address {

    private final String unitNumber;

    public Address(String unit, int streetNumber, String streetName, String postalCode, String cityName) {
        unitNumber = unit;
    }

    public Object getUnitNumber()
    {
        return unitNumber;
    }

    public int getStreetNumber() {
        return 4;
    }

    public String getStreetName() {
        return "jason";
    }

    public String getPostalCode() {
        return "any";
    }

    public String getCity() {
        return "";
    }
}
