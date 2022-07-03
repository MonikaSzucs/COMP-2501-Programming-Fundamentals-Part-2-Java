package cs.bcit.registration;

import java.util.*;

// without public this means that only the registration needs to see this information
// anything only in this folder will get access
class Bookstore
{
    private Map<Integer, String> laureates;

    Bookstore()
    {
        Set<Integer> years;
        String name;

        laureates = new HashMap<>();
        laureates.put(1901, "Sulley Prudhomme");
        laureates.put(2016, "Bob Dylan");

        years = laureates.keySet();

        for(Integer year: years)
        {
            name = laureates.get(year);
            System.out.println(name);
        }
    }
}
