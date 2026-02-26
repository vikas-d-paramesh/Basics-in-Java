

public class Check2power {
    public static boolean check2Power(int n){
        return (n&(n-1))==0;
    }

    public static void main(String args[]){
        System.out.println(check2Power(16));
    }
    
}
