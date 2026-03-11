
public class the_12 {
    public static boolean primeNumber(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        int n=2;
        if(primeNumber(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
    
}
