

public class HierachialInheritance {
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.Fins=2;
        shark.eats();

        //shark.setLegs();

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
class Fish extends Animal { // extend keyword is used to derive the parent class
    int Fins;

    void fins(){
        System.out.println(this.Fins);
    }
}


