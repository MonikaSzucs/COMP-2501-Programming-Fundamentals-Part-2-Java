import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PropertyReader {
    public static ArrayList<String> readPropertyData(File readFile) throws FileNotFoundException {
        ArrayList<String> propertyList = new ArrayList<>();

        Scanner scanner = new Scanner(readFile);

        File file = new File("address_data.txt");

        for(int i = 0; i < AddressReader.readAddressData(file).size(); i++) {
            String line = scanner.nextLine();
            propertyList.add(line);
        }

        scanner.close();
        return propertyList;
    }
}
