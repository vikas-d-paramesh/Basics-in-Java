public class Inheritance{ //Single level inheritance
    public static void main(String args[]){
    Fish shark=new Fish();
    shark.eats();
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

class Fish extends Animal { // extend keyword is used to derive the parent class
    String type;

    void fin(){
        System.out.println("Fin Exists");
    }

    void swims(){
        System.out.println("Swims");
    }


}