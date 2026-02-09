import java.util.Scanner;

public class Palindrom {
    public static void Palindrome(int n){
        int og=n;
        int number=0;
        while(n>0){
            int ld=n%10;
            number=(number*10)+ld;

            n/=10;
        }
        if(number==og){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n =sc.nextInt();

        Palindrome(n);
    }
    
}
