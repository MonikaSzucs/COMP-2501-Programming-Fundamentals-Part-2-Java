import javax.naming.directory.SearchResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Assignment2.java
 * COMP 2501 - CRN: 67139
 * Wednesday evenings, Spring/Summer 2022
 * Assignment 2
 *
 * Define an Assignment2 class with methods and instance variables.
 *
 * @author Monika Szucs
 *
 * @version 1.3
 *
 */
public class Assignment2 {
    File addressFile = new File("address_data.txt");
    File propertyFile = new File("property_data.txt");
    Agency agency = new Agency("agency");

    private static final int FIRST_CHOICE = 1;
    private static final int SECOND_CHOICE = 2;
    private static final int THIRD_CHOICE = 3;
    private static final int FOURTH_CHOICE = 4;
    private static final int FIFTH_CHOICE = 5;

    private static final int INITIALIZATION = 0;
    private static final int PROPERTY_INITIALIZATION = 0;
    private static final int PROPERTY_FIRST = 1;
    private static final int PROPERTY_SECOND = 2;
    private static final int PROPERTY_THIRD = 3;
    private static final int PROPERTY_FOURTH = 4;
    private static final int PROPERTY_FIFTH = 5;

    @SuppressWarnings("unused")
    private SearchResult searches;
    private Scanner scanner = new Scanner(System.in);

    /**
     * This is the method that will contain and check the address and property data
     *
     * @throws FileNotFoundException this is to check if no file has been found
     */
    public void init() throws FileNotFoundException {
        ArrayList<Address> addressData;
        ArrayList<String> propertyData;

        addressData = AddressReader.readAddressData(addressFile);
        propertyData = PropertyReader.readPropertyData(propertyFile);

        for(int i = INITIALIZATION; i < addressData.size(); i++) {
            String[] property;

            property = propertyData.get(i).split("\\|");

            if(property[PROPERTY_FIRST].equalsIgnoreCase("commercial")) {
                Commercial createProperty = new Commercial(Double.parseDouble(property[PROPERTY_INITIALIZATION]),
                                                                            addressData.get(i),
                                                                            property[PROPERTY_FIRST],
                                                                            property[PROPERTY_SECOND],
                                                                            Boolean.parseBoolean(property[PROPERTY_THIRD]),
                                                                            Boolean.parseBoolean(property[PROPERTY_FOURTH]));
                agency.addProperty(createProperty);
            }
            else if(property[PROPERTY_THIRD].equalsIgnoreCase("residence")) {
                Residence createResidence = new Residence(Double.parseDouble(property[PROPERTY_INITIALIZATION]),
                                                        addressData.get(i),
                                                        property[PROPERTY_THIRD],
                                                        property[PROPERTY_FOURTH],
                                                        Integer.parseInt(property[PROPERTY_FIRST]),
                                                        Boolean.parseBoolean(property[PROPERTY_SECOND]),
                                                        Boolean.parseBoolean(property[PROPERTY_FIFTH]));
                agency.addProperty(createResidence);
            }
            else if(property[PROPERTY_FIRST].equalsIgnoreCase("retail")) {
                Retail newRetail = new Retail(Double.parseDouble(property[PROPERTY_INITIALIZATION]),
                                            addressData.get(i),
                                            property[PROPERTY_FIRST],
                                            property[PROPERTY_SECOND],
                                            Integer.parseInt(property[PROPERTY_THIRD]),
                                            Boolean.parseBoolean(property[PROPERTY_FOURTH]));

                agency.addProperty(newRetail);
            }
        }
    }

    /**
     * This is the generalQueries method
     */
    public void generalQueries() {
        while(true) {
            System.out.println("General Queries \n1.By Property ID \n2.By Price \n3.By Street \n4.By Type \n5.Back");

            int userNum = scanner.nextInt();
            if(userNum == FIRST_CHOICE) {
                System.out.println("Enter Property ID");
                scanner.nextLine();
                String id = scanner.nextLine();
                System.out.println(agency.getProperty(id));
            } else if(userNum == SECOND_CHOICE) {
                System.out.println("Enter minimum price");
                int min = scanner.nextInt();
                System.out.println("Enter maximum price");
                int max = scanner.nextInt();

                for(int i = INITIALIZATION; i < agency.getPropertiesBetween(min, max).length; i++) {
                    System.out.println(agency.getPropertiesBetween(min, max)[i]);
                }
            } else if(userNum == THIRD_CHOICE) {
                System.out.println("Enter street name");
                scanner.nextLine();
                String streetName = scanner.nextLine();
                for(int i = INITIALIZATION; i < agency.getPropertiesOn(streetName).size(); i++) {
                    System.out.println(agency.getPropertiesOn(streetName).get(i));
                }
            } else if(userNum == FOURTH_CHOICE) {
                System.out.println("Enter type");
                scanner.nextLine();
                String type = scanner.nextLine();

                for(int i = INITIALIZATION; i < agency.getPropertiesOfType(type).size(); i++) {
                    System.out.println(agency.getPropertiesOfType(type).get(i));
                }
            } else if(userNum == FIFTH_CHOICE) {
                System.out.println("Going back");
                break;
            } else {
                System.out.println("Please enter a number between 1 and 5");
            }
        }
    }

    /**
     * This is the residenceQueries method
     */
    public void residenceQueries() {
        while(true) {
            System.out.println("Residence Queries \n1.By Bedroom \n2.By Pool \n3. By Strate \n4.Back");

            int userNumber = scanner.nextInt();
            if(userNumber == FIRST_CHOICE) {
                System.out.println("Enter min bedrooms");
                int min = scanner.nextInt();
                System.out.println("Enter max bedroom");
                int max = scanner.nextInt();
                for(String i: agency.getPropertiesWithBedrooms(min, max).keySet()) {
                    System.out.println(agency.getPropertiesWithBedrooms(min, max).get(i));
                }
            } else if(userNumber == SECOND_CHOICE) {
                for(int i = INITIALIZATION; i < agency.getPropertiesWithPools().size(); i++) {
                    System.out.println(agency.getPropertiesWithPools().get(i));
                }
            } else if(userNumber == THIRD_CHOICE) {
                for(int i = INITIALIZATION; i < agency.getPropertiesWithStrata().size(); i++) {
                    System.out.println(agency.getPropertiesWithStrata().get(i));
                }
            } else if(userNumber == FOURTH_CHOICE) {
                System.out.println("Going back");
                break;
            } else {
                System.out.println("Please enter a number between 1 and 4");
            }
        }
    }

    /**
     * This is the commericalQueries method
     */
    public void commericalQueries() {
        while(true) {
            System.out.println("Commerical Queries \n1.By Loading Dock \n2. By Highway Access \n3.Back");

            int userNumber = scanner.nextInt();
            if(userNumber == FIRST_CHOICE) {
                for(int i = INITIALIZATION; i < agency.getPropertiesWithLoadingDock().size(); i++) {
                    System.out.println(agency.getPropertiesWithLoadingDock().get(i));
                }
            } else if(userNumber == SECOND_CHOICE) {
                for(int i = INITIALIZATION; i < agency.getPropertiesWithHighwayAccess().size(); i++) {
                    System.out.println(agency.getPropertiesWithHighwayAccess().get(i));
                }
            } else if(userNumber == THIRD_CHOICE) {
                System.out.println("Going back");
                break;
            } else {
                System.out.println("Please pick a number between 1 and 3");
            }
        }
    }

    /**
     * This is the retailQueries method
     */
    public void retailQueries() {
        while(true) {
            System.out.println("Retail Queries \n1.By Square Footage \n2.By Customer Parking \n3.Back");

            int userNumber = scanner.nextInt();
            if(userNumber == FIRST_CHOICE) {
                System.out.println("Enter Square Footage");
                int squareFootage = scanner.nextInt();

                for(int i = INITIALIZATION; i < agency.getPropertiesWithSquareFootage(squareFootage).size(); i++) {
                    System.out.println(agency.getPropertiesWithSquareFootage(squareFootage).get(i));
                }
            } else if(userNumber == SECOND_CHOICE) {
                for(int i = INITIALIZATION; i < agency.getPropertiesWithCustomerParking().size(); i++) {
                    System.out.println(agency.getPropertiesWithCustomerParking().get(i));
                }
            } else if(userNumber == THIRD_CHOICE) {
                System.out.println("Going back");
                break;
            } else {
                System.out.println("Enter a number between 1 and 3");
            }
        }
    }

    /**
     * This method searches based on what the user has selected from 1 to 5
     */
    public void doSearches() {
        while(true) {
            System.out.println("Welcome to our property search \nChoose one of the following options " +
                    "\n1.General Queries \n2.Residence Queries \n3.Commerical Quieries \n4.Retail Queries " +
                    "\n5.Exit");
            int userNumber = scanner.nextInt();
            if(userNumber == FIRST_CHOICE) {
                generalQueries();
            } else if(userNumber == SECOND_CHOICE) {
                residenceQueries();
            } else if(userNumber == THIRD_CHOICE) {
                commericalQueries();
            } else if(userNumber == FOURTH_CHOICE) {
                retailQueries();
            } else if(userNumber == FIFTH_CHOICE) {
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
