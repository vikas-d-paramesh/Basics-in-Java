

public class TillingProblem {
    public static int tillingFlor(int n){
        if(n==0 || n==1){
            return 1;
        }
        return tillingFlor(n-2) + tillingFlor(n-1);
    }

    public static void main(String args[]){
        System.out.println(tillingFlor(4));
    }
    
}
