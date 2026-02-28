public class InheritanceDemo {

    public static void main(String args[]) {

        Shark s = new Shark();
        s.eats();
        s.swim();

        Peacock p = new Peacock();
        p.eats();
        p.fly();

        Dog d = new Dog();
        d.eats();
        d.walk();

        Human h = new Human();
        h.eats();
        h.think();
    }
}

// ---------- Parent Class ----------
class Animal {
    void eats() {
        System.out.println("Animal eats");
    }

    void breathes() {
        System.out.println("Animal breathes");
    }
}

// ---------- Fish Branch ----------
class Fish extends Animal {
    void swim() {
        System.out.println("Fish swims");
    }
}

class Tuna extends Fish {
    void type() {
        System.out.println("Tuna fish");
    }
}

class Shark extends Fish {
    void type() {
        System.out.println("Shark fish");
    }
}

// ---------- Bird Branch ----------
class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies");
    }
}

class Peacock extends Bird {
    void beauty() {
        System.out.println("Peacock is beautiful");
    }
}

// ---------- Mammal Branch ----------
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Human extends Mammal {
    void think() {
        System.out.println("Human thinks");
    }
}