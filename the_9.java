

public class the_9 {
    public static void main(String args[]){
        int n=1111;
        int org=n;
        int rev=0;

        while(n!=0){
            int last=n%10;
            rev=rev*10+last;
            n/=10;
        }
        System.out.println(rev);
        if(rev!=org){
            System.out.println("not a palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }
    
}
