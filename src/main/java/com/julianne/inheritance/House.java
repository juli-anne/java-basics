package com.julianne.inheritance;

public class House {

    // animal is the super, but is an instance of the super
    // dog is defined as type animal (super), but is an instance of type dog which inherits from animal
    // dog inherits from animal and therefore is an animal
    // Animal dog = new Dog();

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        System.out.println("...");

        Cat lily = new Cat();
        lily.scratch();
        lily.makeSound();

        System.out.println("...");

        // new dog of type animal - polymorphism - calls the dogs method
        Animal sasha = new Dog();
        sasha.makeSound();
        // changing sasha to a cat
        sasha = new Cat();
        sasha.makeSound();
    }

}
