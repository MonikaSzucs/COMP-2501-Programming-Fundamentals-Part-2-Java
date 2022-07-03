package ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics;

import ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics.port.DataPort;

/**
 * ModemRouter.java COMP 2501 - CRN: 67139 Wednesday evenings, Spring/Summer 2022 Lab #9
 *
 * <p>Exploring Inheritance by developing a data class hierarchy.
 *
 * @author Monika Szucs
 * @author Daniel Wart
 *     <p>This Modem/Router combo class creates a class that deals with allowing devices to see if
 *     they are connected to the internet.
 * @version 2.0
 *
 */
public class ModemRouter extends Electronic {
    private boolean internet;

    // Government regulations limit ethernet ports to 10
    public static final int MAX_ETHERNET_PORTS = 10;

    /**
     * This is the ModemRouter Constructor
     *
     * @param brand this is the brand of the electronics
     * @param model this is the model of the electronics
     * @param priceCdn this is the price of the electronics in Canadian Dollars
     * @param powerCableAttached this is to check to see if the cable is directly attached or not
     * @param numEthernetPorts How many ethernet ports the modem has. {@link ModemRouter#MAX_ETHERNET_PORTS }
     */
    public ModemRouter(
            final String brand,
            final String model,
            final double priceCdn,
            final boolean powerCableAttached,
            final int numEthernetPorts) {
        super(brand, model, priceCdn, powerCableAttached, getDataPorts(numEthernetPorts));
    }

    /**
     * This is the method that will check/grab the values from the DataPort Class
     *
     * @param numEthernetPorts this will tell you the number of ethernet ports the product has
     * @return it will return the number of ports within an array
     */
    private static DataPort[] getDataPorts(final int numEthernetPorts) {
        if (numEthernetPorts < 0 || numEthernetPorts > MAX_ETHERNET_PORTS) {
            throw new IllegalArgumentException("Invalid amount of ethernet ports");
        }
        var ports = new DataPort[numEthernetPorts];
        for (int i = 0; i < numEthernetPorts; i++) {
            ports[i] = new DataPort(DataPort.PortType.ETHERNET);
        }
        return ports;
    }

    /**
     * This is the method that checks to see if the product has internet or not
     *
     * @return this will return a boolean value if it has power and/or internet
     */
    public boolean hasInternet() {
        return internet && hasPower();
    }

    /**
     * This is the setter method
     *
     * @param internet this to see if the internet is on or off
     */
    public void setInternet(boolean internet) {
        this.internet = internet;
    }
}
