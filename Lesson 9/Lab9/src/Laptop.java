class Laptop extends Electronic {
    private double displaySizeInches;
    private boolean mousePad;
    private boolean wirelessMouse;

    Laptop(final String brand,
           final String model,
           final double price,
           final double displaySizeInches,
           final boolean powerCableAttached,
           final boolean mousePad,
           final boolean wirelessMouse
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

        if(displaySizeInches <= 0) {
            throw new IllegalArgumentException("This value is not valid for the display size");
        }

        this.displaySizeInches = displaySizeInches;
        this.mousePad = mousePad;
        this.wirelessMouse = wirelessMouse;
    }

    public void checkPrice(final double price) {
        if(price <= 0) {
            throw new IllegalArgumentException("That is a incorrect price you have entered.");
        } else if(price <= 1000) {
            System.out.println("Too cheap");
        } else if(price >=4000) {
            System.out.println("Too expensive");
        } else {
            System.out.println("It is a good option");
        }
    }

    public void getDisplaySize() {
         if(displaySizeInches <= 10) {
             System.out.println("This is a small display screen");
         } else if(displaySizeInches > 10 && displaySizeInches<= 18) {
            System.out.println("This is a medium display screen");
         } else if(displaySizeInches > 18) {
             System.out.println("This is a large display screen");
        }
    }
}
