

public class BitOperation {
    public static void getIthValue(int n,int i){
        int bit=1<<i;
        if((n & bit)==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }

    public static void setIthValue(int n,int i){
        int bit=1<<i;
            System.out.println(n|bit);
    }

    public static void clearIthValue(int n,int i){
        int bit=~(1<<i);
            System.out.println(n&bit);
    }
    public static void main(String args[]){
        getIthValue(7, 4);
        setIthValue(10, 02);
        clearIthValue(3, 0);
    }
}
