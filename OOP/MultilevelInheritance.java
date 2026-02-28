

public class MultilevelInheritance {
    public static void main(String args[]){
        Dog lab=new Dog();
        lab.breed = "lab";
        lab.legs=4;
        lab.breed();
        lab.setLegs();

    }
    
}
class Animal{
    String name;

    void eats(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breath");
    }
}

class Mammal extends Animal{
    int legs;

    void setLegs(){
        System.out.println(this.legs);
    }
}
class Dog extends Mammal { // extend keyword is used to derive the parent class
    String breed;

    void breed(){
        System.out.println(this.breed);
    }
}
