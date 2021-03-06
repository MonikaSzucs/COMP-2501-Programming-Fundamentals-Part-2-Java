package ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics.port;

import ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics.Electronic;

/**
 * DataPort.java COMP 2501 - CRN: 67139 Wednesday evenings, Spring/Summer 2022 Lab #9
 *
 * <p>Exploring Inheritance by developing a data class hierarchy.
 *
 * @author Monika Szucs
 * @author Daniel Wart
 *     <p>This DataPort class allows devices to be connected to eachother as long as the port types
 *     match.
 * @version 2.0
 */
public class DataPort {

    /**
     * The port type. Only like ports can connect
     * */
    public enum PortType {
        USB_A,
        USB_B,
        AUX,
        ETHERNET,
    }

    private final PortType portType;
    private DataPort connectedPort;
    private Electronic host; // Where the port is actually located
    private boolean hostSet; // Makes sure that host can only be set once

    /**
     * A setter for the data ports
     *
     * @param portType grabs values from the PortType class
     */
    public DataPort(PortType portType) {
        this.portType = portType;
        this.connectedPort = null;
    }

    /**
     * This is the method to get the port type
     *
     * @return this will return the port type
     */
    public PortType getPortType() {
        return portType;
    }

    /**
     * This is the get connected port method
     *
     * @return this will return the connected port
     */
    public DataPort getConnectedPort() {
        return connectedPort;
    }

    /**
     * This is the getter for getting the host
     *
     * @return the host with the values in the Electronics class
     */
    public Electronic getHost() {
        return host;
    }

    /**
     * This is the setter for setHost
     *
     * @param host will grab the values from the Electronic class
     */
    public void setHost(Electronic host) {
        if (!this.hostSet) {
            this.hostSet = true;
            this.host = host;
        }
    }

    /**
     * This is a method that checks for any disconnected ports
     */
    public void disconnectPort() {
        this.connectedPort.connectedPort = null;
        this.connectedPort = null;
    }

    /**
     * This is the method that checks for the connected ports
     *
     * @param otherPort this checks for any open ports
     * @throws FullPortsException this is an exception that is thrown if all ports are full
     */
    public void connectPort(DataPort otherPort) throws FullPortsException {
        if (otherPort.connectedPort != null || this.connectedPort != null) {
            throw new FullPortsException("Ports are already in use");
        }
        otherPort.connectedPort = this;
        this.connectedPort = otherPort;
    }

    public boolean isConnected() {
        return connectedPort != null;
    }
}
