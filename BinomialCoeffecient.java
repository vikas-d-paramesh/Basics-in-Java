public class BinomialCoeffecient {

    public static int Factorial(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }

    public static void BinomailCo(int n, int r, int b ){
        int nf=Factorial(n);
        int rf=Factorial(r);
        int bf=Factorial(b);

        int BC=nf/(rf*bf);
        System.out.println("Binomaial Co-effecient :"+BC);
    }

    public static void main(String args[]){
        int n=5;
        int r=2;
        int b=n-r;

        BinomailCo(n,r,b);

    }
    
}
