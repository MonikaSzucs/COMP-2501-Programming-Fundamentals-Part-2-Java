import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressReader {
    public static ArrayList<Address> readAddressData(File file) throws FileNotFoundException {
        ArrayList<Address> addressList = new ArrayList<>();
        //System.out.println(file);
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] address = line.split("\\|");
            Address newAddress = new Address(address[0], Integer.parseInt(address[1]), address[2], address[3], address[4]);
            addressList.add(newAddress);
        }

        scanner.close();
        return addressList;
    }
}
