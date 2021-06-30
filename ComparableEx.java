import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ComparableEx
 */
public class ComparableEx {

    public static void main(String[] args) {

        ComparableEx comparableEx = new ComparableEx();
        
        List<Student> al=new ArrayList<>();  
        al.add(new Student("Viru",12));  
        al.add(new Student("Saurav",15));  
        al.add(new Student("Mukesh",21));  
        al.add(new Student("Tahir",25)); 
        comparableEx.printList(al);
        Collections.sort(al);
        System.out.println();
        comparableEx.printList(al);
    }

    public void printList(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                " name ='" + name + '\'' +
                ", age ='" + age + '\'' +
            '}';
    }
}
