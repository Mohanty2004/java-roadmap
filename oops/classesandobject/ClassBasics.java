package oops.classesandobject;

public class ClassBasics {
    public static void main(String[] args) {
        Address address = new Address();
        address.location = "Baharana";
        address.pin = 754108;

        Person person = new Person(20, "Mousumi", address);

        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(person.address.location);
        System.out.println(person.address.pin);

    }
}

class Person {
    int age;
    String name;
    Address address;

    Person(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

}

class Address {
    String location;
    int pin;
}