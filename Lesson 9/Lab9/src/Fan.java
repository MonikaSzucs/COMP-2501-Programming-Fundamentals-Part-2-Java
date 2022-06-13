class Fan extends Electronic {
    private double  temperature;
    private boolean blades;
    private boolean rotating;
    private boolean fallDetectionOn;

    private static final int MIN_TEMPERATURE_CELSIUS = 0;
    private static final int MAX_TEMPERATURE_CELSIUS = 25;
    private static final int COOL_WARM_BREAKINGPOINT = 9;
    private static final int WARM_HOT_BREAKINGPOINT = 18;

    Fan(final String    brand,
        final String    model,
        final double    price,
        final double    temperature,
        final boolean   powerCableAttached,
        final boolean   blades,
        final boolean   rotating,
        final boolean   fallDetectionOn
    ) {
        super(brand, model, price, powerCableAttached);

        this.temperature = temperature;
        this.blades = blades;
        this.rotating = rotating;
        this.fallDetectionOn = fallDetectionOn;
    }

    public void getTemperature() {
        if(temperature < MIN_TEMPERATURE_CELSIUS) {
            System.out.println("The temperature you entered is too low");
        } else if(temperature > MAX_TEMPERATURE_CELSIUS) {
            System.out.println("The temperature you entered is too high");
        } else if(temperature <= COOL_WARM_BREAKINGPOINT) {
            System.out.println("The air is cool");
        } else if(temperature <= WARM_HOT_BREAKINGPOINT) {
            System.out.println("The air is warm");
        } else {
            System.out.println("The air is hot");
        }
    }

    public void kidProof(){
        if(fallDetectionOn) {
            System.out.println("This is a kid proof fan");
        } else {
            System.out.println("This is not a kid proof fan");
        }
    }
}
