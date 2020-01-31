package com.Uni;

public class Student {

    String name;
    String uName;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Student(String name, String uName, int age) {
        this.name = name;
        this.uName = uName;
        this.age = age;
    }

}
