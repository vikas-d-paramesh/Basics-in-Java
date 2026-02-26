

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

    public static int clearIthValue(int n,int i){
        int bit=~(1<<i);
            return (n&bit);
    }

    public static int updateIthBit(int n,int i,int bit){
       n=clearIthValue(n, i);
       int bitmask=bit<<i;
       return n|bitmask;

    }
    public static void main(String args[]){
        getIthValue(7, 4);
        setIthValue(10, 02);
        clearIthValue(3, 0);
        int n=updateIthBit(10, 2, 1);
        System.out.println(n);
    }
}
