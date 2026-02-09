public class SumOfDigits {
    public static void SumOfDigit(int n){
        int num=n;
        int sum=0;
        while(num>0){
            int dig=num%10;
            sum+=dig;
            num/=10;
            
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        SumOfDigit(1000);
    }
    
}
