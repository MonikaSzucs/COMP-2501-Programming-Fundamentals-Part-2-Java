import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * PropertyReader.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Assignment 2
 *
 * Define a PropertyReader class with methods and instance variables.
 *
 * @author Monika Szucs
 *
 * @version 1.3
 *
 */
public class PropertyReader {
    public static final int INITIAL_READ_ADDRESS_FILE_POSITION = 0;
    /**
     * This is the constructor that will read the property data to check the values in the file provided
     *
     * @param readFile this parameter reads the values in the file
     * @return this will return the property list
     * @throws FileNotFoundException this will check to see if the file has been found or not
     */
    public static ArrayList<String> readPropertyData(File readFile) throws FileNotFoundException {
        ArrayList<String> propertyList;
        Scanner scanner;
        File file;

        propertyList = new ArrayList<>();
        scanner = new Scanner(readFile);
        file = new File("address_data.txt");

        for(int i = INITIAL_READ_ADDRESS_FILE_POSITION; i < AddressReader.readAddressData(file).size(); i++) {
            String line;

            line = scanner.nextLine();

            propertyList.add(line);
        }

        scanner.close();
        return propertyList;
    }
}
