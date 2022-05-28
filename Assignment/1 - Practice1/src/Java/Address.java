public class Address {
    private final String    unitNumber;
    private final int       streetNumber;
    private final String    streetName;
    private final String    postalCode;
    private final String    city;

    private static final int MIN_LEN_UNIT_NUM = 1;
    private static final int MAX_LEN_UNIT_NUM = 4;
    private static final int MIN_STREET_NAME_LENGTH = 1;
    private static final int MAX_STREET_NAME_LENGTH = 20;
    private static final int MIN_STREET_NUMBER = 0;
    private static final int MAX_STREET_NUMBER = 999999;

    public Address(final String unitNumber,
                   final int streetNumber,
                   final String streetName,
                   final String postalCode,
                   final String city) {
        if(unitNumber != null) {
            if (unitNumber.length() < MIN_LEN_UNIT_NUM || unitNumber.length() > MAX_LEN_UNIT_NUM)
                throw new IllegalArgumentException("Invalid unit number: " + unitNumber);
        }

        if(streetName == null) {
            throw new NullPointerException("Invalid street name: " + streetName);
        } else if (streetName.length() < MIN_STREET_NAME_LENGTH || streetName.length() > MAX_STREET_NAME_LENGTH) {
            throw new IllegalArgumentException("Invalid street name: " + streetName);
        }

        if(streetNumber < MIN_STREET_NUMBER || streetNumber > MAX_STREET_NUMBER) {
            throw new IllegalArgumentException("Invalid street number: " + streetNumber);
        }

        if(city == null) {
            throw new NullPointerException("Invalid city: " + city);
        } else if(city.length() < 1 || city.length() > 30) {
            throw new IllegalArgumentException("Invalid city: " + city);
        }

        if(postalCode == null) {
            throw new NullPointerException("Invalid postal code: " + postalCode);
        } else if(postalCode.length() < 5 || postalCode.length() > 6) {
            throw new IllegalArgumentException("Invalid postal code: " + postalCode);
        }
        this.unitNumber = unitNumber;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}
