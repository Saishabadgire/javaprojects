package model;

public abstract class Person {

    protected String name;
    protected String email;
    protected String phoneNumber;

    public Person(String name, String email, String phoneNumber) {

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public abstract void displayDetails();

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
