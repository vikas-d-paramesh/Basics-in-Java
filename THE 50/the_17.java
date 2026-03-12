
public class the_17 {

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

    public static int lcm(int n,int m){
        int product=n*m;
        int lcm= product/gcd(n, m);
        return lcm;
    }
    //brutee froce method 
    // public static void lcm(int n,int m){
    //     int i=Math.max(n,m);
    //     while(true){
    //         if((i%n==0)&&(i%m==0)){
    //             System.out.println(i);
    //             break;
    //         }
    //         i++;
    //     }
    // }
     public static void main(String args[]){
        int n=4;
        int m=6;
        System.out.println(lcm(n, m));
     }
}
