import java.util.Map;
import java.util.HasMap;
import java.util.Set;

class Calendar
{
    private Map<Integer, String> months;

    Calendar()
    {
        Set <Integers> keys;


        month = new HashMap<>();
        // REMOVE OUT GET SIZE

        months.put(1, "January");
        months.put(3, "March");
        months.put(11, "November");
        System.out.println(months.size());
        //months.remove(7);

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
