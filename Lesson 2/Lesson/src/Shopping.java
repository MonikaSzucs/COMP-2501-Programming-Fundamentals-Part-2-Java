import java.util.ArrayList;
import java.util.List;

public class Shopping
{
    private List<String> shoppingList;

    Shopping()
    {
        shoppingList = new ArrayList<>();
        shoppingList.add("apple");
        shoppingList.add("pear");
        shoppingList.add("celery");
        shoppingList.add(null);
        shoppingList.add("grapes");

        System.out.println(shoppingList.size());

        for(String item: shoppingList)
        {
            System.out.println(item);
        }

        shoppingList.remove(2);
        System.out.println("----");

        for(String item: shoppingList)
        {
            if(item!=null)
            {
                System.out.println(item);
            }
            else
            {
                System.out.println("EMPTY");
            }
        }
    }

}
