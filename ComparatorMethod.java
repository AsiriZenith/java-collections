import java.util.*;
/**
 * ComparatorMethod
 */
public class ComparatorMethod {

    public static void main(String[] args) {

        ComparatorMethod comparatorMethod = new ComparatorMethod();
        
        List<Dog> list =new ArrayList<>(); 
        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));

        System.out.println("********************************");

        comparatorMethod.printList(list);

        Collections.sort(list); 

        System.out.println("*******************************");

        comparatorMethod.printList(list);
    }

    public void printList(List<Dog> list) {
        for (Dog s : list) {
            System.out.println(s);
        }
    }
}

/**
 * Dog
 */
class Dog implements Comparable<Dog>{

    private String name;
    private int age;

    Dog() {}

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getDogName() {
        return name;
    }
  
    public int getDogAge() {
        return age;
    }

    @Override
    public int compareTo(Dog o) {
        return (this.name).compareTo(o.getDogName());
    }

    @Override
    public String toString() {
        return "Dog{" +
                ", name ='" + name + '\'' +
                ", age ='" + age + '\'' +
            '}';
    }
}