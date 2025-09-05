package com.julianne.interfaces;

// interface - template of an abstract construct - purely made to be abstract, can't be instantiated
// don't have constructors, fields are not meant to be changed, other classes implement interfaces (not extend)
// should only include the methods that every product type must have
// implemented by classes, extended by other interfaces
public interface Product {

    // the fields are final, you know the value, and it's not meant to be changed
    // mostly you don't have fields

    // by default methods are abstract
    String getName();
    void setName(String name);

    // default allows to add new things without breaking others ex. in production
    default double getPrice() {
        return 50;
    };
    default void setPrice(double price) {};

    // static methods are interface methods that contain implementation but are not inherited by
    // implementing classes - can't be overridden - not available from an instance of an implementing class

}
