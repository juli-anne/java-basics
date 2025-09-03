package com.julianne.inheritance;

// to inherit from another class
// everything that is not private in the Person class now belongs to the Person class
// it inherited it from Person
// we can define everything that we inherited and extra what matters for this class
public class Employee extends Person {

    private String employeeId;
    private String title;

    public Employee() {
        // super calls the constructor that matches the parameters list
        // if empty default, if some name the 2nd
        // always the first line in the subclass constructor
        // after adding the 2nd constructor the default doesn't exist anymore so we have to call it
        super("angie");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
