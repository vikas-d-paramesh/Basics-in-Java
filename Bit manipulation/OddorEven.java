

public class OddorEven {
    public static void oddOrEven(int n){
        int bit=1;
        if((n & bit) ==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    public static void main(String args[]){
        oddOrEven(4);
        oddOrEven(5);
    }
    
}
