import java.util.*;
/**
 * LinkedList1
 */
public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item4");
        linkedList.add("Item2");

        //System.out.println("Linked List Content: " +linkedList);

        linkedList.addFirst("FirstItem");
        linkedList.addLast("LastItem");
        //System.out.println("LinkedList Content after addition: " +linkedList);

        String FirstElement1 = linkedList.get(0);
        System.out.println(FirstElement1);

        linkedList.set(0, "Change The First Item");
        String FirstElement2 = linkedList.get(0);
        System.out.println(FirstElement2);

        linkedList.removeFirst();
        linkedList.removeLast();

        // System.out.println("Linked List Content: " +linkedList);

        linkedList.add(0, "Newly Item");
        System.out.println("Linked List Content: " +linkedList);

        linkedList.remove(0);
        System.out.println("Linked List Content: " +linkedList);
    }
}