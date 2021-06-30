package com.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ComparableInterface
 */
public class ComparableInterface {

    public static void main(String[] args) {

        ComparableInterface comparableInterface = new ComparableInterface();
        
        ArrayList<Student> al = new ArrayList<>(); 
        al.add(new Student(101,"Vijay",23));  
        al.add(new Student(106,"Ajay",27));  
        al.add(new Student(105,"Jai",21));  

        comparableInterface.printStudents(al);

        System.out.println("*********************************");

        Collections.sort(al); 

        comparableInterface.printStudents(al);
    }

    public void printStudents(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}

/**
 * Student
 */
class Student implements Comparable<Student> {

    private int rollno;
    private String name;
    private int age;

    Student(int rollno,String name,int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if (age == o.getAge()) {
            return 0;
        } else if (age > o.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
    }
    
}