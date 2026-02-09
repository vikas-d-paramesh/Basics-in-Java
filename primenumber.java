import java.util.Scanner;
import java.util.*;
class primenumber{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");

        int n= s.nextInt();
        Boolean isprime=true;
        if (n<=1){
            isprime=false;
        }
        else{
            int div=2;
            for(div=2;div<=Math.sqrt(n);div++)
                if(n%div==0){
                    isprime=false;
                    break;
                }
            
        if(isprime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }

        
    }
}
}
