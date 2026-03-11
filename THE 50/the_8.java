
public class the_8 {
    public static void main(String args[]){
        int n=1023;
        int rev=0;
        while(n!=0){
            int temp=n%10;
            rev =temp+rev*10;
            n/=10;

        }
        System.out.println(rev);
    }
    
}
