import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Amazon
{
    private final Map<Integer, String> items;

    public Amazon()
    {
        //instantiate the HashMap
        items = new HashMap<>();

        //add the key-value pairs to the HashMap
        items.put(1234, "blue guitar");
        items.put(5678, "yellow umbrella");

        //use a Set, the keySet() method, and an iterator
        //print all the keys and values in certain format
        Set<Integer> allKeys;
        Iterator<Integer> it;
        Integer key;
        allKeys = items.keySet();
        it = allKeys.iterator();

        while(it.hasNext())
        {
            key = it.next();
            System.out.printf("key is %d and value is %s.\n", key, items.get(key));
        }
    }
}
