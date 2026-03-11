

public class the_15 {
     public static void main(String args[]){
        int n=111111123;
        int product=1;
        while(n!=0){
            int temp=n%10;
            product*=temp;
            n/=10;
        }

        System.out.println(product);
    }
    
    
}
