class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void parentSound() {
        super.sound(); // Calls the parent class method
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();       // Calls the overridden method
        myDog.parentSound(); // Calls the parent class method using super
    }
}
