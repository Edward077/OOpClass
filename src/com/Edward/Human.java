package com.Edward;

public class Human {
    String name;
    int age;
    int heightInches;
    String eyeColor;

    public Human() {
    }

    public  void  speak(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age + "old ");
        System.out.println("I am " + heightInches + " tall");
        System.out.println("My eyes color are" + eyeColor);
    }
    public void eat(){
        System.out.println("I am eating");

    }
    public void walk(){
        System.out.println("I am walking");
    }
    public void work(){
        System.out.println("I am working");
    }
}
