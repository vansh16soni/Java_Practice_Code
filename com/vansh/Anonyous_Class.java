package com.vansh;

//@FunctionalInterface
//interface Animal{
//    void bark();
//}

//class Dog implements Animal{
//
//    @Override
//    public void bark() {
//        System.out.println("Dog barks!");
//    }
//}

abstract class Vehicle{
    abstract void drive();
}
@FunctionalInterface
interface Human{
    void walk();
}
public class Anonyous_Class {
    public static void main(String[] args) {
//        Dog Bruno = new Dog();
//        Bruno.bark();

//        Animal Bruno = new Animal() {
//            @Override
//            public void bark() {
//                System.out.println("Dog barks!");
//            }
//        };
//        Bruno.bark();


       //1 Extending a class
//        Vehicle car = new Vehicle() {
//            @Override
//            void drive() {
//                System.out.println("I'm driving a car.");
//            }
//        };
//        car.drive();

        Human John = new Human() {
            @Override
            public void walk() {
                System.out.println("John walks.");
            }
        };
        John.walk();
    }
}
