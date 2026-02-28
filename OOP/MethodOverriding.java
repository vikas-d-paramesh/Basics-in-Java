class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {   // overriding parent method
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String args[]) {

        Dog d = new Dog();
        d.sound();
    }
}