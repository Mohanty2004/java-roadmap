package oops.classesandobject;

interface animal {
    void sound();
}

class Dog implements animal {
    public void sound() {
        System.out.println("Bark");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
