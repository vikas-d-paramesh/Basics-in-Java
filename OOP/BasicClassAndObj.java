package OOP;

public class BasicClassAndObj {
    public static void main(String args[]){
        Pen p1=new Pen(); //object creation
        p1.setColor("green"); //method call
        System.out.println(p1.color);

        p1.tip=8; //Attribute decleartion
        System.out.print(p1.tip);
    }
    
}
class Pen{
    String color; //properties of object
    int tip;
    
    void setColor(String newcolor){ //functions or methods of class
        color=newcolor;
    }

    void setTip(int newtip){
        tip=newtip;
    }
}
