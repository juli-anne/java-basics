package com.julianne.interfaces;

// classes can implement multiple interfaces
// can contain abstract, default and static methods
// static - available without an instance
public class ElectronicBook implements Product, DigitalFile {


    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getSize() {
        return " ";
    }

    @Override
    public void setSize(String size) {

    }
}
