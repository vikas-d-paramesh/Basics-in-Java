

public class the_16 {
    public static int gcd(int n,int m){
        int max=Math.max(n,m);
        int min=Math.min(n,m);
        int rem=0;
        while(min!=0){
            rem=max%min;
            max=min;
            min=rem;
        }
        return max;
    }

    public static int gcdBrutee(int n,int m){
        for(int i=1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n=12;
        int m=18;
        System.out.println(gcd(n, m));
        System.out.println(gcdBrutee(n, m));
        
    }
    
}
