import javax.naming.directory.SearchResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
    File addressFile = new File("address_data.txt");
    File propertyFile = new File("property_data.txt");
    Agency agency = new Agency("agency");

    @SuppressWarnings("unused")
    private SearchResult searches;
    private Scanner scanner = new Scanner(System.in);

    public void init() throws FileNotFoundException {
        ArrayList<Address> addressData = AddressReader.readAddressData(addressFile);
        ArrayList<String> propertyData = PropertyReader.readPropertyData(propertyFile);

        for(int i = 0; i < addressData.size(); i++) {
            String[] property = propertyData.get(i).split("\\|");

//            final double priceInUsd, final Address address, final String type, final String propertyId,
//                      final boolean loadingDock, final boolean highwayAccess
            if(property[1].equalsIgnoreCase("commercial")) {
                Commercial createProperty = new Commercial(Double.parseDouble(property[0]),
                                                                            addressData.get(i),
                                                                            property[1],
                                                                            property[2],
                                                                            Boolean.parseBoolean(property[3]),
                                                                            Boolean.parseBoolean(property[4]));
                agency.addProperty(createProperty);
                //System.out.println(agency.getProperty(property[2]));
            }
//            final double priceInUsd, final Address address, final String type, final String propertyId,
//            final int numberOfBedrooms, final boolean swimmingPool, final boolean strata
            else if(property[3].equalsIgnoreCase("residence")) {
                Residence createResidence = new Residence(Double.parseDouble(property[0]),
                                                        addressData.get(i),
                                                        property[3],
                                                        property[4],
                                                        Integer.parseInt(property[1]),
                                                        Boolean.parseBoolean(property[2]),
                                                        Boolean.parseBoolean(property[5]));
                agency.addProperty(createResidence);
                //System.out.println(agency.getProperty(property[4]));
            }
//            double priceInUsd, Address address, String type, String propertyId, final int squareFootage,
//            final boolean customerParking
            else if(property[1].equalsIgnoreCase("retail")) {
                Retail newRetail = new Retail(Double.parseDouble(property[0]),
                                            addressData.get(i),
                                            property[1],
                                            property[2],
                                            Integer.parseInt(property[3]),
                                            Boolean.parseBoolean(property[4]));

                agency.addProperty(newRetail);
                //System.out.println(agency.getProperty(property[2]));

            }
            //System.out.println(agency.toString());

        }
    }

    public void generalQueries() {
        while(true) {
            System.out.println("General Queries \n1.By Property ID \n2.By Price \n3.By Street \n4.By Type \n5.Back");

            int userNum = scanner.nextInt();
            if(userNum == 1) {
                System.out.println("Enter Property ID");
                scanner.nextLine();
                String id = scanner.nextLine();
                //System.out.println(id);
                System.out.println(agency.getProperty(id));
            } else if(userNum == 2) {
                System.out.println("Enter minimum price");
                int min = scanner.nextInt();
                System.out.println("Enter maximum price");
                int max = scanner.nextInt();

                for(int i = 0; i < agency.getPropertiesBetween(min, max).length; i++) {
                    System.out.println(agency.getPropertiesBetween(min, max)[i]);
                }
            } else if(userNum == 3) {
                System.out.println("Enter street name");
                scanner.nextLine();
                String streetName = scanner.nextLine();
                //scanner.nextLine();
                for(int i = 0; i < agency.getPropertiesOn(streetName).size(); i++) {
                    System.out.println(agency.getPropertiesOn(streetName).get(i));
                }
            } else if(userNum == 4) {
                System.out.println("Enter type");
                scanner.nextLine();
                String type = scanner.nextLine();

                for(int i = 0; i < agency.getPropertiesOfType(type).size(); i++) {
                    System.out.println(agency.getPropertiesOfType(type).get(i));
                }
            } else if(userNum == 5) {
                System.out.println("Going back");
                break;
            } else {
                System.out.println("Please enter a number between 1 and 5");
            }
        }
    }

    public void residenceQueries() {
        while(true) {
            System.out.println("Residence Queries \n1.By Bedroom \n2.By Pool \n3. By Strate \n4.Back");

            int userNumber = scanner.nextInt();
            if(userNumber == 1) {
                System.out.println("Enter min bedrooms");
                int min = scanner.nextInt();
                System.out.println("Enter max bedroom");
                int max = scanner.nextInt();
                for(String i: agency.getPropertiesWithBedrooms(min, max).keySet()) {
                    System.out.println(agency.getPropertiesWithBedrooms(min, max).get(i));
                }
            } else if(userNumber == 2) {
                for(int i = 0; i < agency.getPropertiesWithPools().size(); i++) {
                    System.out.println(agency.getPropertiesWithPools().get(i));
                }
            } else if(userNumber == 3) {
                for(int i = 0; i < agency.getPropertiesWithStrata().size(); i++) {
                    System.out.println(agency.getPropertiesWithStrata().get(i));
                }
            } else if(userNumber == 4) {
                System.out.println("Going back");
                break;
            } else {
                System.out.println("Please enter a number between 1 and 4");
            }
        }
    }

    public void commericalQueries() {
        while(true) {
            System.out.println("Commerical Queries \n1.By Loading Dock \n2. By Highway Access \n3.Back");

            int userNumber = scanner.nextInt();
            if(userNumber == 1) {
                for(int i = 0; i < agency.getPropertiesWithLoadingDock().size(); i++) {
                    System.out.println(agency.getPropertiesWithLoadingDock().get(i));
                }
            } else if(userNumber == 2) {
                for(int i = 0; i < agency.getPropertiesWithHighwayAccess().size(); i++) {
                    System.out.println(agency.getPropertiesWithHighwayAccess().get(i));
                }
            } else if(userNumber == 3) {
                System.out.println("Going back");
                break;
            } else {
                System.out.println("Please pick a number between 1 and 3");
            }
        }
    }

    public void retailQueries() {
        while(true) {
            System.out.println("Retail Queries \n1.By Square Footage \n2.By Customer Parking \n3.Back");

            int userNumber = scanner.nextInt();
            if(userNumber == 1) {
                System.out.println("Enter Square Footage");
                int squareFootage = scanner.nextInt();

                for(int i = 0; i < agency.getPropertiesWithSquareFootage(squareFootage).size(); i++) {
                    System.out.println(agency.getPropertiesWithSquareFootage(squareFootage).get(i));
                }
            } else if(userNumber == 2) {
                for(int i = 0; i < agency.getPropertiesWithCustomerParking().size(); i++) {
                    System.out.println(agency.getPropertiesWithCustomerParking().get(i));
                }
            } else if(userNumber == 3) {
                System.out.println("Going back");
                break;
            } else {
                System.out.println("Enter a number between 1 and 3");
            }
        }
    }

    public void doSearches() {
        while(true) {
            System.out.println("Welcome to our property search \nChoose one of the following options " +
                    "\n1.General Queries \n2.Residence Queries \n3.Commerical Quieries \n4.Retail Queries " +
                    "\n5.Exit");
            int userNumber = scanner.nextInt();
            if(userNumber == 1) {
                generalQueries();
            } else if(userNumber == 2) {
                residenceQueries();
            } else if(userNumber == 3) {
                commericalQueries();
            } else if(userNumber == 4) {
                retailQueries();
            } else if(userNumber == 5) {
                System.out.println("Exiting");
                break;
            } else {
                System.out.println("Please enter a number between 1 and 5");
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Assignment2 a2 = new Assignment2();
        a2.init();
        a2.doSearches();

    }
}
