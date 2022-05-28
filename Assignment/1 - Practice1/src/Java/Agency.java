import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

public class Agency {
    private HashMap<String, Properties> properties;
    private final String name;

    public Agency(final String name) {
        properties = new HashMap<>();
        this.name = name;
    }

    public void addProperty(Property property) {

    }

    public Object getProperty(String property) {
    }

    public void removeProperty(String property) {
    }

    public int getTotalPropertyValues() {
    }

    public Collection<Object> getPropertiesWithPools() {
    }

    public Property[] getPropertiesBetween(int i, int i1) {
    }

    public Collection<Object> getPropertiesOn(String elm_street) {
    }
}
