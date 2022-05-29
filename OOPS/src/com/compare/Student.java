package com.compare;

public class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student(){
        name = "Default";
        age = -1;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        int diff = this.age - o.age;
        return diff;
    }
}
