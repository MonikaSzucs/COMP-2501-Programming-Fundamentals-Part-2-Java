import java.util.*;

class Electronic {
    public int price;
    private Map<String, String> products;

    public Electronic() {
        products = new HashMap<>();

        products.put("Monitor3", "LED");
        products.put("Monitor5", "OLED");
        products.put("Monitor1", "DLP");
        products.put("Monitor4", "FTF");
        products.put("Monitor2", "Plasma");

        SortedSet<String> allOfTheKeys;
        allOfTheKeys = new TreeSet<String>(products.keySet());

        for(String item: allOfTheKeys)
        {
            System.out.println("The key is: " + item + " and the value is " + products.get(item));
        }
    }

    public static void main(String[] args)
    {
        Electronic eletronics;
        eletronics = new Electronic();

        List<List<String>> outer = new ArrayList<List<Integer>>();
        List<String> inner1 = new ArrayList<Integer>();
        List<String> inner2 = new ArrayList<Integer>();

        // Monitor 1
        inner1.add("OLED");
        inner1.add("ALIENWARE 34 CURVED QD-OLED GAMING MONITOR - AW3423DW");
        inner1.add("1,");

        // Monitor 2
        inner2.add(300);
        inner2.add(400);

        // Monitor 3
        outer.add(inner1);
        outer.add(inner2);

        outer.get(0).add(300);

        System.out.println(outer);
    }
}
