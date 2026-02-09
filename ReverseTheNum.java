public class ReverseTheNum{
    public static void main(String args[]){
        int num=10239;

        for(int i=0;num>0;i++){
            int ld=num%10;
            System.out.print(ld);
            num /=10;
        }
    }
}