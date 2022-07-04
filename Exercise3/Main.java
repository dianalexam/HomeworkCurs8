package com.fasttrackit.Exercise3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();
        Chicken chicken = new Chicken();
        Duck duck = new Duck();

        System.out.println(cat.walk());
        System.out.println(dog.eat());
        System.out.println(mouse.talk());
        System.out.println(chicken.eat());
        System.out.println(duck.walk());

    }
}
