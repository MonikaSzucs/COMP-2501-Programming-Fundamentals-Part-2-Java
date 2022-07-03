import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Amazon {
    private final Map<Integer, String> products;

    Amazon()
    {
        products = new HashMap<>();
        products.put(1234, "blue guitar");
        products.put(5678, "yellow umbrella");

        Set<Integer> allOfTheProducts;
        allOfTheProducts = products.keySet();

        for(Integer product: allOfTheProducts)
        {
            System.out.println("Key is " + product + " and the value is " + products.get(product));
        }
    }

    public static void main(final String[] args)
    {
        Amazon products;
        products = new Amazon();
    }
}
