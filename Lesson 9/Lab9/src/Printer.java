class Printer extends Electronic {
    private String tonerColor;
    private boolean hasToner;
    private boolean hasScanner;
    private double beltLength;

    Printer(final String    brand,
            final String    model,
            final String    tonerColor,
            final double    beltLength,
            final double    price,
            final boolean   powerCableAttached,
            final boolean   hasToner,
            final boolean   hasScanner

    ) {
        super(brand, model, price, powerCableAttached);

        if(brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("There must be a brand name");
        }

        if(model == null || model.isEmpty()) {
            throw new IllegalArgumentException("There must be a model type");
        }

        if(price <= 0) {
            throw new IllegalArgumentException("That is a incorrect price you have entered.");
        }

        this.tonerColor     = tonerColor;
        this.beltLength     = beltLength;
        this.hasToner       = hasToner;
        this. hasScanner    = hasScanner;
    }

    public void print() {
        System.out.println("printing");
    }

    public void checkPrice(final double price) {
        if(price <= 0) {
            throw new IllegalArgumentException("That is a incorrect price you have entered.");
        } else if(price <= 100) {
            System.out.println("Too cheap");
        } else if(price >=400) {
            System.out.println("Too expensive");
        } else {
            System.out.println("It is a good option");
        }
    }
}
