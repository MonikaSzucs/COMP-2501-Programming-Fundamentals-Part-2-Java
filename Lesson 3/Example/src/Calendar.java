import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Calendar {
    private Map<Integer, String> months;

    Calendar()
    {
        Set<Integer> keys;
        months = new HashMap<>();

        months.put(1, "January");
        months.put(3, "March");
        months.put(11, "November");
        System.out.println(months.size());
        System.out.println("---");

        // nothing will be removed because nothing is in key 7
        months.remove(7);

        keys = months.keySet();

        for(Integer key: keys)
        {
            System.out.println(key);
            String value;
            value = months.get(key);
            System.out.println("value is " + value);
        }


    }
}
