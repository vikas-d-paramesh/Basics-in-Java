import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter A:");
        int a=s.nextInt();

        System.out.print("Enter B:");
        int b=s.nextInt();

      
        while(true){
            System.out.println("");
            System.out.println("Choose amoung the following options:");
            System.out.println("1.Addition.");
            System.out.println("2.Subtraction.");
            System.out.println("3.Division.");
            System.out.println("4.Multiplication.");
            System.out.println("5.Modulus.");
            System.out.println("6.EXIT");
            
            int n=s.nextInt();
            
            
            switch(n){
            case 1:
            System.out.println("Addition :"+(a+b));
            break;

            case 2:
            System.out.println("Subtraction :"+(a-b));
            break;
            
            case 3:
            System.out.println("Division :"+(a/b));
            break;
            
            case 4:
            System.out.println("Multiplication :"+(a*b));
            break;

            case 5:
            System.out.println("Modulus:"+(a%b));
            break;
            
            case 6:
            System.out.println("Exit!!!! THANK YOU");
            return;

            default:
            System.out.println("Invalid input.");
            }
        
        }

    }
    
}
