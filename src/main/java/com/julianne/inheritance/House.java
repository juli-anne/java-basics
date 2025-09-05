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
        // implicit upcast from dog to animal - only has access to the methods it upcasted to
        Animal sasha = new Dog();
        sasha.makeSound();
        // feed(sasha); // up here is dog food because here it's a dog
        // sasha.fetch(); - sasha can't fetch - it's upcasted to animal - animal does not have fetch
        // changing sasha to a cat
        sasha = new Cat();
        sasha.makeSound();
        // sasha can't scratch - downcast her
        // (Cat) down casting + extra () to make it an object to be stored somewhere
        // sasha is still an animal
        // ((Cat)sasha).scratch(); // this is temporary, just on this line to access scratch

        // to do it permanently (cast it and store it in an object - sashaTheDog):
        // Animal sasha = new Dog(); // can't do it with Animal sasha = new Cat(); like this
        // - they are siblings but not in the same hierarchy - class exception error
        // Dog sashaTheDog = (Dog)sasha; // to access anything from the dog class, use sashaTheDog

        System.out.println("...");
        // the instanceof operator
        boolean isAnimal = sasha instanceof Animal; // true
        System.out.println(isAnimal);
        boolean isDog = sasha instanceof Dog; // false - because right now it's a cat - check last exec
        System.out.println(isDog);
        boolean isCat = sasha instanceof Cat; // true
        System.out.println(isCat);

        System.out.println("...");
        // feeding
        feed(lily);
        feed(rocky);
        feed(sasha); // cat food because changed in cat
    }

    // type casting is the action of converting an object's type into a different one
    // can be performed upward or downward on an inheritance (family) tree

    //  ...
    // feed takes an Animal, but also any subclass of animal
    public static void feed(Animal animal) {

        if (animal instanceof Dog) {
            System.out.println("dog food");
        } else if (animal instanceof Cat) {
            System.out.println("cat food");
        }
    }
}
