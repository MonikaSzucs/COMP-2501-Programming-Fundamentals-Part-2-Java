import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {

    public static void main(final String[] args) {
        //LinkedList has a head then users a pointer goes to the next node and so on
        //LinkedList are slower when you want t oget access to a specific item in the middle because it has to start
        // from the beggining or end of the LinkedList then move one by one
        LinkedList<String> namesLinkedList;
        namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("'George'");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));

        //ArrayLists use Array as its underlying data structure
        //ArrayList is different then just a regular array that is fixed with the number of size items it can have
        //Array's have super fast random access so it is faster to get the item in any position in the array.
        String[] names = new String[4];
        ArrayList<String> namesArrayList;
        namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("'George'");
        namesArrayList.add("Ringo");
        System.out.println(namesArrayList.get(2));
    }
}
