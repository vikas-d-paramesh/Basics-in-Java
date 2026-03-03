

public class TillingProblem {
    public static int tillingFlor(int n){
        if(n==0 || n==1){
            return 1;
        }

        int horizontal=tillingFlor(n-2);
        int vertical=tillingFlor(n-1);

        return horizontal + vertical;
    }

    public static void main(String args[]){
        System.out.println(tillingFlor(3));
    }
    
}
