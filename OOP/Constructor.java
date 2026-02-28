
public class Constructor {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name = "hardik";
        s1.age=33;
        s1.display();
        Student s2=new Student("Hardik");

        Student s3=new Student(s1);
        s3.display();

    }
}

class Student{
    String name;
    int age;

    Student(Student s1){//copy constructor
        this.name=s1.name;
        this.age=s1.age;
    }

    Student(){ //Constructor for the class Student (Non-parameterized constructor)
        System.out.println("Constructor is called...");
    }

    Student(String name){ //Parameterized constructor
        this.name=name;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}