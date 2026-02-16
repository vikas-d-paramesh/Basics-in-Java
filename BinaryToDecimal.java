public class BinaryToDecimal {
    public static void BinToDec(int n){
        
        int pow=0;
        int dec=0;
        while(n>0){
            int lastdigit=n%10;
            dec=(int) (dec + (lastdigit * Math.pow(2,pow)));
            pow++;
            n/=10;

        }
        System.out.println(dec);
    }

    public static void main(String args[]){
        BinToDec(101);
    }
    
}
