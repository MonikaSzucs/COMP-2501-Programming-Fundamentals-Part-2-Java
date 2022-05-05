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

        List<List<String>> outer = new ArrayList<List<String>>();
        List<String> inner1 = new ArrayList<String>();
        List<String> inner2 = new ArrayList<String>();
        List<String> inner3 = new ArrayList<String>();

        // Monitor 1
        inner1.add("OLED");
        inner1.add("ALIENWARE 34 CURVED QD-OLED GAMING MONITOR - AW3423DW");
        inner1.add("1,600");

        // Monitor 2
        inner2.add("LED");
        inner2.add("Sceptre Curved 30\" 21:9 Gaming LED Monitor");
        inner2.add("400");

        // Monitor 3
        inner3.add("QLED");
        inner3.add("Curved Super Wide 32:9 Gaming Monitor");
        inner3.add("1,300");

        // Monitor 3
        outer.add(inner1);
        outer.add(inner2);
        outer.add(inner3);

        //outer.get(0).add(300);

        System.out.println(outer);

        if( outer != null)
        {
            for(List item: outer)
            {
                if(item != null)
                {
                    System.out.println(item);
                    for(Object description: item)
                    {
                        if(description != null) {

                            System.out.println(description);
                        }
                    }
                }
            }
        }
        // Array of Strings
        

    }

    public static void main(String[] args)
    {
        Electronic eletronics;
        eletronics = new Electronic();
    }
}
