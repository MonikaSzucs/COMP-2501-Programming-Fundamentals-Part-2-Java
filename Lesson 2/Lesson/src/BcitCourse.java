import java.util.ArrayList;
import java.util.List;

class BcitCourse
{
    private List<String> names;

    BcitCourse()
    {
        names = new ArrayList<>();
        // RAGS = remove, add, get, size
        names.add("jason");
        names.add("par");
        names.add("kayla");
        names.add("justin");
        System.out.println(names.get(1));
        for(String name: names)
        {
            System.out.println(name);
        }
        names.remove(0);
        System.out.println(names.size());
    }
}
