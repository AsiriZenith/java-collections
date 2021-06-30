package com.ComparableInterface2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * InnerComparatorInterface2
 */
public class ComparatorInterface2 {

    public static void main(String[] args) {
    
        ComparatorInterface2 comparatorInterface2 = new ComparatorInterface2();
        ArrayList<Student> al=new ArrayList<Student>();  
        al.add(new Student(101,"Vijay",23));  
        al.add(new Student(106,"Ajay",27));  
        al.add(new Student(105,"Jai",21));  

        comparatorInterface2.printStudents(al);
        System.out.println();
        System.out.println("Sorting by Name"); 
        
        Collections.sort(al,new NameComparator());  

        comparatorInterface2.printStudents(al);
        System.out.println();

        System.out.println("Sorting by age");
        Collections.sort(al,new AgeComparator()); 
        comparatorInterface2.printStudents(al);
    }

    public void printStudents(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}

class Student {  
    int rollno;  
    String name;  
    int age;  

    Student(int rollno,String name,int age){  
        this.rollno = rollno;  
        this.name = name;  
        this.age = age;  
    }  

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
    }
} 

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1,Student s2) {   
        if(s1.age == s2.age)  
            return 0;  
        else if(s1.age > s2.age)  
            return 1;  
        else  
            return -1;  
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1,Student s2) {  
        return s1.name.compareTo(s2.name);  
    }
}