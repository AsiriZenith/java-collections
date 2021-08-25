import java.util.*; 
import java.util.Collections;

class ArrayList1{

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Asiri");
        list.add("Senith");
        list.add("Manjitha");

        //Traversing list through Iterator
        // Iterator itr = list.iterator();
      
        // while (itr.hasNext()) {
        //     System.out.print(itr.next());
        //     System.out.print(" ");
        // }
        System.out.println(list);
        list.add(2,"AAA");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        // change 
    }
}