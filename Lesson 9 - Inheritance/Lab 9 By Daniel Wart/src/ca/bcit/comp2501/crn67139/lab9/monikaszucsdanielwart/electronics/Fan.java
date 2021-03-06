package ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics;

import ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics.port.DataPort;

/**
 * Fan.java COMP 2501 - CRN: 67139 Wednesday evenings, Spring/Summer 2022 Lab #9
 *
 * <p>Exploring Inheritance by developing a data class hierarchy.
 *
 * @author Monika Szucs
 * @author Daniel Wart
 *     <p>This Fan Class that will create the appropriate constructor and methods
 * @version 2.0
 *
 */
public class Fan extends Electronic {
    private final double temperatureCelsius;
    private final int bladeCount;
    private boolean turnedOn;
    private final boolean fallDetectionOn;

    private static final double MIN_TEMPERATURE_CELSIUS = -273.0;
    private static final double MAX_TEMPERATURE_CELSIUS = 25.0;
    private static final double COOL_WARM_BREAKING_POINT = 9.0;
    private static final double WARM_HOT_BREAKING_POINT = 18.0;

    /**
     * This is the Fan Constructor
     *
     * @param brand this is the brand of the fan
     * @param model this is the model of the fan
     * @param priceCdn this is the price of the fan in Canadian Dollars
     * @param temperatureCelsius this is the temperature in Celsius
     * @param powerCableAttached this is to check to see if the cable directly attached or not
     * @param bladeCount this is to check to see if the fan uses blades or not
     * @param fallDetectionOn this is to check to see if the fan can detect if it falls to turn off
     *     as a safety feature
     * @throws IllegalArgumentException This is to check to see if there is an Illegal Argument
     *     Exception
     */
    public Fan(
            final String brand,
            final String model,
            final double priceCdn,
            final double temperatureCelsius,
            final boolean powerCableAttached,
            final int bladeCount,
            final boolean fallDetectionOn) {
        super(brand, model, priceCdn, powerCableAttached, new DataPort[] {}); //Fan doesn't have any data ports

        if (temperatureCelsius < MIN_TEMPERATURE_CELSIUS) {
            throw new IllegalArgumentException("The temperature (Celsius) you entered is too low");
        } else if (temperatureCelsius > MAX_TEMPERATURE_CELSIUS) {
            throw new IllegalArgumentException("The temperature (Celsius) you entered is too high");
        }

        this.temperatureCelsius = temperatureCelsius;
        this.bladeCount = bladeCount;
        this.fallDetectionOn = fallDetectionOn;
    }

    /**
     * This is the method to get teh temperature in celsius
     *
     * @return the temperature in a double format
     */
    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    /**
     * This is method that counts the number of blades
     *
     * @return the number of blades in integer format
     */
    public int getBladeCount() {
        return bladeCount;
    }

    /**
     * This is the method to check if the fan is turned on
     *
     * @return a boolean value if the fan is turned on or not
     */
    public boolean isTurnedOn() {
        return turnedOn;
    }

    /**
     * This is the method that will check if the fan power is turned on or not
     */
    public void turnOn() {
        if (hasPower()) {
            this.turnedOn = true;
        }
    }

    /**
     * This is the method that will check if device is turned off
     */
    public void turnOff() {
        this.turnedOn = false;
    }

    /**
     * This is the method that checks if the fan has the fall detection turned on or not
     *
     * @return fall detection on or off in boolean value
     */
    public boolean isFallDetectionOn() {
        return fallDetectionOn;
    }


    /**
     * This is the getTemperature constructor
     *
     * @return a subjective opinion on how hot the fan is
     */
    public String getTemperature() {
        if (getTemperatureCelsius() <= COOL_WARM_BREAKING_POINT) {
            return "The air is cool";
        } else if (getTemperatureCelsius() <= WARM_HOT_BREAKING_POINT) {
            return "The air is warm";
        } else {
            return "The air is hot";
        }
    }

    /**
     * Drop the fan! Hopefully it's one of those newfangled ones with the extra safety features...
     */
    public void drop() {
        if (isTurnedOn()){
            if (isFallDetectionOn()) {
                turnOff();
            } else {
                System.out.println("Everyone dies");
            }
        }
    }
}
