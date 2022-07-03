import java.util.HashMap;

public class MapVsHashMap {
    public static void main(final String[] args) {
        HashMap<String, Integer> empIds;
        empIds = new HashMap<>();

        //maps do not garuntee a certain order when it is pritned out
        empIds.put("John", 123456);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 87654309);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("Jerry"));
        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(6));
        System.out.println(empIds.containsValue(123456));

        empIds.put("John", 56789);

        System.out.println(empIds);

        // this will only replace the value if it can find the name Kramer. If it cannot find the name it does nothing.
        empIds.replace("Kramer", 56789);

        //This only put the person John inside if it is not found in the HashMap
        empIds.putIfAbsent("John", 222);

        empIds.remove("Carl");
        System.out.println(empIds);
    }
}
