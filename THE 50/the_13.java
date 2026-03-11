
public class the_13 {
    public static boolean primeNumber(int n){
        if(n==0 || n==1){
                return false;
            }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }

    public static void main(String args[]){
        int n=5;
        for(int i=0;i<=n;i++){
            if(primeNumber(i)){
                System.out.println(i);
            }
        }
    }
    
}
