//package Recursion;

public class SumOfN {
    public static int sumOfN(int n){
        if(n==0){
            return 0;
        }
        int nm1=sumOfN(n-1);
        int sum = n + nm1;

        return sum;

    }

     public static void main (String args[]){
        int n=5;
        System.out.println(sumOfN(n));
    }
    
}
