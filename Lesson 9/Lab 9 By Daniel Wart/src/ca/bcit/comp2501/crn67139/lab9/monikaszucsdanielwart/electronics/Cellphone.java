package ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics;

import ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics.port.DataPort;

/**
 * Cellphone.java COMP 2501 - CRN: 67139 Wednesday evenings, Spring/Summer 2022 Lab #9
 *
 * <p>Exploring Inheritance by developing a data class hierarchy.
 *
 * @author Monika Szucs
 * @author Daniel Wart
 *     <p>This Cellphone Class that will create the appropriate constructor and methods
 * @version 2.0
 */
public class Cellphone extends Electronic {
    private final boolean sms;
    private boolean dataEnabled;
    private final double dataPlanCostCdnMonthly;
    private final double displaySizeInches;
    private ModemRouter connectedModemRouter;
    private static final int MIN_PRICE_CDN = 0;
    private static final int MIN_DATA_PLAN_COST_CDN = 10;
    private static final int AFFORDABLE_DATA_PLAN_COST_CDN = 40;
    private static final int EXPENSIVE_DATA_PLAN_COST_CDN = 80;

    /**
     * This is the constructor for the Cellphone Class
     *
     * @param brand this is the brand of the cellphone
     * @param model this is the model of the cellphone
     * @param priceCdn this is the price of the cellphone
     * @param dataPlanCostCdnMonthly this is to see what the data plan the person is paying for that
     *     cellphone
     * @param displaySizeInches this is to see what size the cellphone is
     * @param dataEnabled this is to see if the cellphone has the data turned on
     * @param sms this is to see if the cellphone can receive messages
     * @param powerCableAttached this is to see if the cellphone has a cable connected directly to
     *     it at all times
     * @param hasAuxPort whether the phone has an aux port and thus is able to connect to a speaker
     * @throws IllegalArgumentException this will throw an Illegal Argument Exception
     */
    public Cellphone(
            final String brand,
            final String model,
            final double priceCdn,
            final boolean powerCableAttached,
            final double dataPlanCostCdnMonthly,
            final double displaySizeInches,
            final boolean dataEnabled,
            final boolean sms,
            final boolean hasAuxPort) {
        super(brand, model, priceCdn, powerCableAttached, getDataPorts(hasAuxPort));

        if (priceCdn <= MIN_PRICE_CDN) {
            throw new IllegalArgumentException("That is a incorrect price you have entered.");
        }
        if (dataPlanCostCdnMonthly < MIN_DATA_PLAN_COST_CDN) {
            throw new IllegalArgumentException("Data plan is too cheap");
        }

        this.dataEnabled = dataEnabled;
        this.dataPlanCostCdnMonthly = dataPlanCostCdnMonthly;
        this.displaySizeInches = displaySizeInches;
        this.connectedModemRouter = null;
        this.sms = sms;
    }

    /**
     * This is the method that will check the data ports available
     *
     * @param hasAuxPort this tells us if the product has aux ports or not
     * @return this will return an array of data ports
     */
    private static DataPort[] getDataPorts(boolean hasAuxPort) {
        final DataPort[] dataPorts;
        if (hasAuxPort) {
            dataPorts = new DataPort[] {new DataPort(DataPort.PortType.AUX)};
        } else {
            dataPorts = new DataPort[] {};
        }
        return dataPorts;
    }

    /**
     * This is a getter to check if it can do SMS
     * @return this will return a boolean value if is has SMS or not
     */
    public boolean hasSms() {
        return sms;
    }

    /**
     * This is a method that will check if data is enabled
     *
     * @return this will return a boolean value if data is turned on or not
     */
    public boolean isDataEnabled() {
        return dataEnabled;
    }

    /**
     * This is a setter that will check to see if data is enabled or not
     *
     * @param dataEnabled is a boolean value of whether the data is enabled or not
     */
    public void setDataEnabled(final boolean dataEnabled) {
        this.dataEnabled = dataEnabled;
    }

    /**
     * This is the method that gets the plan cost in Canadian dollars on a monthly basis
     *
     * @return the data plans cost in boolean value in Canadian dollars
     */
    public double getDataPlanCostCdnMonthly() {
        return dataPlanCostCdnMonthly;
    }

    /**
     * This is the method that will get the display size of the device in inches
     *
     * @return a double value of the display size in inches
     */
    public double getDisplaySizeInches() {
        return displaySizeInches;
    }

    /**
     * This is the method that will check of the modem router is connected or not
     *
     * @return the values for the ModemRouter that is connected
     */
    public ModemRouter getConnectedModemRouter() {
        return connectedModemRouter;
    }

    /**
     * This is the setter for connecting the ModemRouter
     *
     * @param connectedModemRouter values from the ModemRouter
     */
    public void connectModem(final ModemRouter connectedModemRouter) {
        this.connectedModemRouter = connectedModemRouter;
    }

    /**
     * @return whether the phone is connected to the internet. Needs to either have data or be
     *     connected to a modem with internet and power
     */
    public boolean hasInternet() {
        if (getConnectedModemRouter() == null && !isDataEnabled()) {
            return false;
        } else if (isDataEnabled()) {
            return true;
        } else {
            return getConnectedModemRouter().hasInternet();
        }
    }

    /**
     * This is the method that checks the plan category
     *
     * @return a String message if the deal is good, needs to be better or too expensive
     */
    public String getDataPlanCategory() {
        if (getDataPlanCostCdnMonthly() <= AFFORDABLE_DATA_PLAN_COST_CDN) {
            return "Wow, that's a good deal!";
        } else if (getDataPlanCostCdnMonthly() <= EXPENSIVE_DATA_PLAN_COST_CDN) {
            return "There better be some good reception and data on this plan";
        } else {
            return "This is too expensive";
        }
    }
}
