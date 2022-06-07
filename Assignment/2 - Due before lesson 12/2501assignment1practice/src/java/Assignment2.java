import javax.naming.directory.SearchResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment2 {
    File addressFile = new File("/address_data.txt");
    File propertyFile = new File("/property_data.txt");

    private Agency agency;
    @SuppressWarnings("unused")
    private SearchResult searches;
    private Scanner scanner;

    public void init() throws FileNotFoundException {
        AddressReader.readAddressData(addressFile);
        PropertyReader.readPropertyData(propertyFile);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Assignment2 a2 = new Assignment2();
        a2.init();
        a2.doSearches();
    }
}
