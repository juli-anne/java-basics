package com.julianne.inheritance;

public class Person {

    // variables
    private String name;
    private int age;
    private String gender;

    // constructors
    public Person() {
        System.out.println("In person default constructor");
    }

//    public Person(String name) {
//        System.out.println("In Person second constructor");
//    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
