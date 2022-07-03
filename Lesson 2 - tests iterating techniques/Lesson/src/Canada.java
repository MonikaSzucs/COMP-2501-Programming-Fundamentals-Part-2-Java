import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Canada
{
    private List<String> provinces;

    Canada()
    {
        Iterator<String> it;
        provinces = new ArrayList<>();

        provinces.add("bc");
        provinces.add("ab");

        it = provinces.iterator();

        while(it.hasNext())
        {
            String province = it.next();
            System.out.println(province);
        }




    }
}

