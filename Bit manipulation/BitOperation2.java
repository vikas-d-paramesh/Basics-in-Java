
public class BitOperation2 {
    public static int clearIthBit(int n,int i){
        int bit=(~0)<<i;
        return bit & n;
    }

    public static int clearRangeIBits(int n,int i,int j){
        int a =((~0)<<j);
        int b=a|(1<<i)-1;
        return b&n;
    }

    public static void main(String args[]){
        System.out.println(clearIthBit(10, 02));
        System.out.println(clearRangeIBits(11, 02, 04));

    }
}
