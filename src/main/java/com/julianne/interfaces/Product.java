package com.julianne.interfaces;

// interface - template of an abstract construct - purely made to be abstract
// don't have constructors, fields are not meant to be changed, other classes implement interfaces (not extend)
// should only include the methods that every product type must have
public interface Product {

    // the fields are final, you know the value and it's not meant to be changed
    // mostly you don't have fields

    // by default methods are abstract
    String getName();
    void setName(String name);

}
