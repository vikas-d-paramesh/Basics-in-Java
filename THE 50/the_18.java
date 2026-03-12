

public class the_18 {
    public static void evenAndOdd(int n){
        int even=0;
        int odd=0;
        while(n!=0){
            int last=n%10;
            if(last%2==0){
                even++;
            }
            else{
                odd++;
            }
            n/=10;
        }
        System.out.println(odd +" "+ even);
    }
    
    public static void main(String args[]){
        int n=4567;
        evenAndOdd(n);
    }
}
