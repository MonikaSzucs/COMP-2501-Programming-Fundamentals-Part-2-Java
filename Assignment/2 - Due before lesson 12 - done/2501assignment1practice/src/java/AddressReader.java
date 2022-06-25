import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * AddressReader.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Assignment 2
 *
 * Define an AddressReader class with methods and instance variables.
 *
 * @author Monika Szucs
 *
 * @version 1.3
 *
 */
public class AddressReader {
    public static final int ADDRESS_INITIAL_POSITION = 0;
    public static final int ADDRESS_FIRST_POSITION = 1;
    public static final int ADDRESS_SECOND_POSITION = 2;
    public static final int ADDRESS_THIRD_POSITION = 3;
    public static final int ADDRESS_FOURTH_POSITION = 4;

    /**
     * This is the method that will read the Address Data from the file
     *
     * @param                           file this is the file containing the data of information
     * @return                          this will return the addressList
     * @throws FileNotFoundException    this will throw a FileNotFoundException
     */
    public static ArrayList<Address> readAddressData(File file) throws FileNotFoundException {
        ArrayList<Address> addressList;
        Scanner scanner;

        addressList = new ArrayList<>();
        scanner = new Scanner(file);

        while(scanner.hasNext()) {
            String line;
            String[] address;
            Address newAddress;

            line = scanner.nextLine();
            address = line.split("\\|");
            newAddress = new Address(address[ADDRESS_INITIAL_POSITION],
                    Integer.parseInt(address[ADDRESS_FIRST_POSITION]),
                    address[ADDRESS_SECOND_POSITION],
                    address[ADDRESS_THIRD_POSITION],
                    address[ADDRESS_FOURTH_POSITION]);
            addressList.add(newAddress);
        }

        scanner.close();
        return addressList;
    }
}
