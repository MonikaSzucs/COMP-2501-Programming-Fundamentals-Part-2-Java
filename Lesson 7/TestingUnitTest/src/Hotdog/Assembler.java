import java.util.Objects;

public class Assembler {
    private String foodType;
    private String bread;
    private final String meat;
    private final String condimentOne;
    private final String condimentTwo;
    private final Integer quantity;

    public Assembler(   final String foodType,
                        final String bread,
                        final String meat,
                        final String condimentOne,
                        final String condimentTwo,
                        final Integer quantity) {


        if(foodType == null || foodType.isEmpty()) {
            throw new NullPointerException("This cannot be null");
        }
        else if(foodType.equalsIgnoreCase("Hot Dog") || foodType.equalsIgnoreCase("hot dog")) {
            this.foodType = foodType;
        }

        if(foodType.equalsIgnoreCase("Hot Dog") ||
                foodType.equalsIgnoreCase("hot dog") &&
                        !meat.equalsIgnoreCase("patty")) {
            this.meat = meat;
        } else {
            throw new IllegalArgumentException("You cannot choose a patty with a hot dog");
        }

        if(foodType.equalsIgnoreCase("Hot Dog") ||
                foodType.equalsIgnoreCase("hot dog")
                && bread.equalsIgnoreCase("White")) {
            this.bread = bread;
        }

        this.condimentOne = condimentOne;
        this.condimentTwo = condimentTwo;
        this.quantity = quantity;

    }

    public void createHotDog() {
        System.out.println("This is a: " + foodType);
        System.out.println("long " + bread + " bun that contains: ");
        System.out.println(meat);
        System.out.println(condimentOne);
        System.out.println(condimentTwo);
    }

    public String getFoodType() {
        return foodType;
    }

}
