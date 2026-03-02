public class ExponentialOptimzed{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int power=power(x, n/2) * power(x, n/2);
        if(n%2!=0){
            power=x *power;
        }

        return power;
        
    }

    public static void main (String args[]){
        System.out.println(power(2,4));
    }
}