package org.oop.training.demo.demo01_object_creation.without_constructor;

class Person{

    String name;
    int age;

    void walk(){}
    void eat(){}
    void intro(){
        System.out.println("Hello world! My name is " + name +". I am " + age + " years old. Nice to meet you!");
    }
}

class Demo01_ClassAndObjects {

    public static void main(String[] args) {

        // Create objects of class Person
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "John";
        p1.age = 25;
        p2.name = "Mary";
        p2.age = 24;

        p1.intro();
        p2.intro();
    }

}
