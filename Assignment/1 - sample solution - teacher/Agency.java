import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Agency {

	@SuppressWarnings("unused")
	private final String name;
	private HashMap<String, Property> properties;

	public static final int MIN_NAME_LEN = 1;
	public static final int MAX_NAME_LEN = 30;

	public Agency(final String name) {
		if (name == null) {
			throw new NullPointerException("Invalid name: null");
		}

		if (name.length() < MIN_NAME_LEN || name.length() > MAX_NAME_LEN) {
			throw new IllegalArgumentException("Invalid name: " + name);
		}
		this.name = name;

		properties = new HashMap<>();
	}

	public HashMap<String, Property> getProperties() {

		return properties;
	}

	public void addProperty(final Property property) {
		if (property == null) {
			throw new NullPointerException("Invalid property: null");
		}

		properties.put(property.getPropertyId(), property);
	}

	public void displayProperties() {

		for (String id : properties.keySet()) {

			System.out.println(properties.get(id));
		}
	}

	// General Queries searches----------------------

	public Property getProperty(final String propertyId) {
		if (properties.containsKey(propertyId)) {
			return (properties.get(propertyId));
		} else {
			return null;
		}
	}

	public Property[] getPropertiesBetween(final double minUsd, final double maxUsd) {
		int numberOfMatches = 0;
		int i = 0;

		Set<String> propertyIds = properties.keySet();

		for (String propertyId : propertyIds) {
			Property property = properties.get(propertyId);

			if (property.getPriceUsd() >= minUsd && property.getPriceUsd() <= maxUsd) {
				numberOfMatches++;
			}
		}

		if (numberOfMatches == 0) {
			return null;
		}

		Property[] matches = new Property[numberOfMatches];

		for (String propertyId : propertyIds) {
			Property property = properties.get(propertyId);

			if (property.getPriceUsd() >= minUsd && property.getPriceUsd() <= maxUsd) {
				matches[i] = property;
				i++;

			}
		}
		return matches;
	}

	public ArrayList<Address> getPropertiesOn(final String streetName) {
		ArrayList<Address> matches = new ArrayList<>();

		Set<String> propertyIds = properties.keySet();

		for (String propertyId : propertyIds) {
			Property property = properties.get(propertyId);

			if (property.getAddress().getStreetName().equalsIgnoreCase(streetName)) {
				matches.add(property.getAddress());
			}
		}

		if (matches.size() == 0) {
			return new ArrayList<Address>();
		}

		return matches;
	}

	public ArrayList<Property> getPropertiesOfType(final String propertyType) {
		ArrayList<Property> results = new ArrayList<>();

		for (String key : properties.keySet()) {

			Property prop = properties.get(key);

			if (prop.getType().equalsIgnoreCase(propertyType)) {

				results.add(prop);
			}

		}

		return results;
	}

	public ArrayList<Residence> getPropertiesWithPools() {

		ArrayList<Residence> matches = new ArrayList<>();

		Set<String> propertyIds = properties.keySet();

		for (String propertyId : propertyIds) {
			Property prop = properties.get(propertyId);

			if (prop instanceof Residence) {
				Residence property = (Residence) properties.get(propertyId);

				if (property.isSwimmingPool()) {
					matches.add(property);
				}
			}
		}

		if (matches.size() == 0) {
			return null;
		}

		return matches;
	}

	// Residence Queries searches------------------------

	public HashMap<String, Residence> getPropertiesWithBedrooms(final int minBedrooms, final int maxBedrooms) {
		HashMap<String, Residence> matches = new HashMap<>();

		Set<String> propertyIds = properties.keySet();

		for (String propertyId : propertyIds) {
			Property property = properties.get(propertyId);
			Property prop = properties.get(propertyId);

			if (prop instanceof Residence) {

				Residence res = (Residence) properties.get(propertyId);

				if (res.getNumberOfBedrooms() >= minBedrooms && res.getNumberOfBedrooms() <= maxBedrooms) {
					matches.put(property.getPropertyId(), res);
				}
			}
		}

		if (matches.size() == 0) {
			return null;
		}

		return matches;
	}

	public ArrayList<Residence> getPropertiesWithStrata() {

		ArrayList<Residence> matches = new ArrayList<>();

		Set<String> propertyIds = properties.keySet();

		for (String propertyId : propertyIds) {
			Property prop = properties.get(propertyId);

			if (prop instanceof Residence) {
				Residence property = (Residence) properties.get(propertyId);

				if (property.isStrata()) {
					matches.add(property);
				}
			}
		}

		if (matches.size() == 0) {
			return null;
		}

		return matches;
	}

	// Commercial Queries searches----------------------

	public ArrayList<Commercial> getPropertiesWithLoadingDocks() {

		ArrayList<Commercial> matches = new ArrayList<>();

		Set<String> propertyIds = properties.keySet();

		for (String propertyId : propertyIds) {
			Property prop = properties.get(propertyId);

			if (prop instanceof Commercial) {
				Commercial property = (Commercial) properties.get(propertyId);

				if (property.isLoadingDock()) {
					matches.add(property);
				}
			}
		}

		if (matches.size() == 0) {
			return null;
		}

		return matches;
	}

	public ArrayList<Commercial> getPropertiesWithHighwayAccess() {

		ArrayList<Commercial> matches = new ArrayList<>();

		Set<String> propertyIds = properties.keySet();

		for (String propertyId : propertyIds) {
			Property prop = properties.get(propertyId);

			if (prop instanceof Commercial) {
				Commercial property = (Commercial) properties.get(propertyId);

				if (property.isHighwayAccess()) {
					matches.add(property);
				}
			}
		}

		if (matches.size() == 0) {
			return null;
		}

		return matches;
	}
	
	//Retail Queries searches-----------------
	
	public ArrayList<Retail> getPropertiesSquareFootage(int squareFeet) {

		ArrayList<Retail> matches = new ArrayList<>();

		Set<String> propertyIds = properties.keySet();

		for (String propertyId : propertyIds) {
			Property prop = properties.get(propertyId);

			if (prop instanceof Retail) {
				Retail property = (Retail) properties.get(propertyId);

				if (property.getSquareFootage() >= squareFeet) {
					matches.add(property);
				}
			}
		}

		if (matches.size() == 0) {
			return null;
		}

		return matches;
	}
	
	public ArrayList<Retail> getPropertiesWithCustomerParking() {

		ArrayList<Retail> matches = new ArrayList<>();

		Set<String> propertyIds = properties.keySet();

		for (String propertyId : propertyIds) {
			Property prop = properties.get(propertyId);

			if (prop instanceof Retail) {
				Retail property = (Retail) properties.get(propertyId);

				if (property.isCustomerParking()) {
					matches.add(property);
				}
			}
		}

		if (matches.size() == 0) {
			return null;
		}

		return matches;
	}
}
