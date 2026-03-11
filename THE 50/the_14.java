

public class the_14 {
    public static void main(String args[]){
        int n=1111111111;
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }

        System.out.println(sum);
    }
    
}
