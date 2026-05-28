package com.vansh;

public class Student {
    String name;
    int id;

    public Student(String student_name, int id) {
        this.name = student_name;
        this.id = id;
    }

    public static void main(String[] args) {
        Student s1 =new Student("Vansh",206);
        Student s2 =  new Student("Soni",45);

        System.out.println("Student 1 Name: "+s1.name);
        System.out.println("Student 1 id: "+s1.id);
        System.out.println("Student 2 Name :"+s2.name);
        System.out.println("Student 2 Name: "+s2.id);
    }
}
