import java.util.*;
/**
 * Vector1
 */
public class Vector1 {

    public static void main(String[] args) {
        
        Vector<String> vec = new Vector<String>(2);

        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        // System.out.println("Size is: "+vec.size());
        // System.out.println("Default capacity increment is: "+vec.capacity());

        vec.addElement("fruit1");
        vec.addElement("fruit4");
        vec.addElement("fruit5");
        vec.addElement("fruit6");
        vec.addElement("fruit7");
        // vec.addElement("fruit8");
        // vec.addElement("fruit9");

        System.out.println("Size after addition: "+vec.size());
        System.out.println("Capacity after increment is: "+vec.capacity());

        /*Display Vector elements*/
        Enumeration en = vec.elements();
        System.out.println("\nElements are:");
        
        while(en.hasMoreElements())
            System.out.print(en.nextElement() + " ");
    }
}