package ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics;

import ca.bcit.comp2501.crn67139.lab9.monikaszucsdanielwart.electronics.port.DataPort;

/**
 * Laptop.java COMP 2501 - CRN: 67139 Wednesday evenings, Spring/Summer 2022 Lab #9
 *
 * <p>Exploring Inheritance by developing a data class hierarchy.
 *
 * @author Monika Szucs
 * @author Daniel Wart
 *     <p>Laptop class that has a battery, keyboard, processor (with a naive interpreter of a simple
 *     programming language), as well as different purchase options.
 * @version 2.0
 */
public class Laptop extends Electronic {
    private final double displaySizeInches;
    private final boolean touchPad;
    private final boolean wirelessMouse;
    private boolean batteryCharged;

    private final char[] memory = new char[MEMORY_SIZE];
    private String readOnlyMemory = "";

    private char[] keyboardBuffer;
    private int keyboardPointer = 0;

    private int dataPointer;
    private int instructionPointer;

    private static final int IMPOSSIBLE_SCREEN_SIZE = 0;
    private static final int CHEAP_LAPTOP = 1000;
    private static final int EXPENSIVE_LAPTOP = 4000;
    private static final int SMALL_TO_MEDIUM_DISPLAY_SIZE = 10;
    private static final int MEDIUM_TO_LARGE_DISPLAY_SIZE = 18;
    private static final int MEMORY_SIZE = 32;

    /**
     * This is the constructor for the Laptop Class
     *
     * @param brand this is the brand of the laptop
     * @param model this is the model of the laptop
     * @param priceCdn this is the price of the laptop
     * @param displaySizeInches this is the display size of the laptop in inches
     * @param powerCableAttached this is to see if the power cable is directly attached or not
     * @param touchPad this is to see if the laptop has a touchpad or not
     * @param wirelessMouse this is to see if the laptop is using a wireless mouse
     * @param dataPorts The types of ports this Laptop has
     * @throws IllegalArgumentException this checks to see if there is an Illegal Argument Exception
     */
    public Laptop(
            final String brand,
            final String model,
            final double priceCdn,
            final boolean powerCableAttached,
            final DataPort[] dataPorts,
            final double displaySizeInches,
            final boolean touchPad,
            final boolean wirelessMouse) {
        super(brand, model, priceCdn, powerCableAttached, dataPorts);

        if (displaySizeInches <= IMPOSSIBLE_SCREEN_SIZE) {
            throw new IllegalArgumentException("This value is not valid for the display size");
        }

        this.displaySizeInches = displaySizeInches;
        this.touchPad = touchPad;
        this.wirelessMouse = wirelessMouse;
        this.batteryCharged = powerCableAttached;
    }

    /**
     * This is the method that gets the display size in inches
     *
     * @return this will return the display size in inches
     */
    public double getDisplaySizeInches() {
        return displaySizeInches;
    }

    /**
     * This is the method that will check to see if the product is a touchpad or not
     *
     * @return a boolean value if it is a touchpad or not
     */
    public boolean isTouchPad() {
        return touchPad;
    }

    /**
     * This is the method to check if the mouse is wireless or not
     *
     * @return a boolean value if the mouse is or is not wireless
     */
    public boolean isWirelessMouse() {
        return wirelessMouse;
    }

    /**
     * This is the method to check if the battery is charged or not
     *
     * @return a boolean value if the battery is charged
     */
    public boolean isBatteryCharged() {
        return this.batteryCharged;
    }

    /**
     * This is the method to check if the device is currently charging
     */
    public void chargeBattery() {
        if (isPowerCableAttached()) {
            batteryCharged = true;
        }
    }

    /**
     * Method used to check if the device has power
     *
     * @return a boolean if the device has power going to it or not
     */
    public boolean hasPower() {
        return super.hasPower() || isBatteryCharged();
    }

    /**
     * This is the method that checks how expensive the device is.
     *
     * @return This will return a value to let the user know if it is too cheap, too expensive or a good option.
     */
    public String howExpensive() {
        if (getPriceCdn() <= CHEAP_LAPTOP) {
            return "Too cheap";
        } else if (getPriceCdn() >= EXPENSIVE_LAPTOP) {
            return "Too expensive";
        } else {
            return "It is a good option";
        }
    }

    /**
     * This is the method that will check to see how big the display size is
     *
     * @return the message to let the person know if the display screen size is small, medium or large
     */
    public String howBig() {
        if (getDisplaySizeInches() <= SMALL_TO_MEDIUM_DISPLAY_SIZE) {
            return "This is a small display screen";
        } else if (getDisplaySizeInches() > SMALL_TO_MEDIUM_DISPLAY_SIZE) {
            return "This is a medium display screen";
        } else if (getDisplaySizeInches() >= MEDIUM_TO_LARGE_DISPLAY_SIZE) {
            return "This is a large display screen";
        }
        return "Screen is a weird size";
    }

    /**
     * Basically just a setter for the readOnlyMemory
     *
     * @param readOnlyMemory the new memory
     */
    public void programReadOnlyMemory(String readOnlyMemory) {
        this.readOnlyMemory = readOnlyMemory;
    }

    /**
     * This is the getter to read the key
     *
     * @return the next key in the keyboard buffer, incrementing the keyboard pointer
     */
    public char readKey() {
        if (keyboardPointer >= this.keyboardBuffer.length) {
            System.out.println("You hear the laptop make a beep");
            return 0;
        }
        var out = this.keyboardBuffer[keyboardPointer];
        keyboardPointer += 1;
        return out;
    }

    /**
     * Sets the keyboard buffer and resets the keyboard pointer
     *
     * @param buffer The desired keyboard input
     */
    public void setKeyboardBuffer(String buffer) {
        this.keyboardBuffer = buffer.toCharArray();
        this.keyboardPointer = 0;
    }

    /**
     * Reset the laptop, clearing the memory and resetting the data and instruction pointers
     * */
    private void reset() {
        this.dataPointer = 0;
        this.instructionPointer = 0;
        for (int i = 0; i < this.memory.length; i++) {
            this.memory[i] = 0;
        }
    }

    /**
     * A very simple interpreter for Brainf**k. Works for trivial programs but will likely be very
     * slow on more complicated ones
     *
     * @see <a href="https://en.wikipedia.org/wiki/Brainfuck#Language_design">Wikipedia article on
     *     the language</a>
     * @throws AssertionError if there is an invalid structure
     */
    public void runStoredProgram() {
        if (!hasPower()) {
            return;
        }
        reset();
        while (instructionPointer < readOnlyMemory.length()) {
            var currentInstruction = readOnlyMemory.charAt(instructionPointer);
            boolean incrementInstructionPointer = true;

            if (currentInstruction == '>') {
                // increment data pointer
                this.dataPointer++;
            } else if (currentInstruction == '<') {
                // decrement data pointer
                this.dataPointer--;
            } else if (currentInstruction == '+') {
                // increment value at data pointer
                this.memory[this.dataPointer] += 1;
            } else if (currentInstruction == '-') {
                // decrement value at data pointer
                this.memory[this.dataPointer] -= 1;
            } else if (currentInstruction == '.') {
                // output value at data pointer
                printBuffer.add(this.memory[this.dataPointer]);
            } else if (currentInstruction == ',') {
                // accept one byte of input
                this.memory[this.dataPointer] = readKey();
            } else if (currentInstruction == '[') {
                // if value is zero, jump to command after matching right bracket
                if (this.memory[this.dataPointer] == 0) {
                    incrementInstructionPointer = false;
                    this.instructionPointer = findMatchingBracket(currentInstruction);
                }
            } else if (currentInstruction == ']') {
                // if value is nonzero, jump to command after matching left bracket
                if (this.memory[this.dataPointer] != 0) {
                    incrementInstructionPointer = false;
                    this.instructionPointer = findMatchingBracket(currentInstruction);
                }
            } else {
                throw new AssertionError("Invalid instruction");
            }
            if (incrementInstructionPointer) {
                this.instructionPointer++;
            }
        }
    }

    /**
     * Helper method to find the matching bracket
     *
     * @param currentInstruction The bracket we're looking at
     * @return The index of the matching bracket
     */
    private int findMatchingBracket(char currentInstruction) {
        assert currentInstruction == '[' || currentInstruction == ']';
        int direction;
        if (currentInstruction == '[') {
            direction = 1;
        } else {
            direction = -1;
        }
        int bracketTracker = -direction;
        int currentPosition = this.instructionPointer + direction;
        while (true) {
            char checkingInstruction = this.readOnlyMemory.charAt(currentPosition);
            if (checkingInstruction == '[') {
                bracketTracker -= 1;
            } else if (checkingInstruction == ']') {
                bracketTracker += 1;
            }
            if (bracketTracker == 0) {
                return currentPosition;
            }
            currentPosition += direction;
        }
    }
}
