public class the_19 {

    public static void armstrong(int n){
        int org = n;
        int sum = 0;
        int temp = n;
        int digits = 0;

        // count number of digits
        while(temp != 0){
            temp /= 10;
            digits++;
        }

        temp = n;

        // calculate sum of digits^digits
        while(temp != 0){
            int last = temp % 10;
            sum += (int)Math.pow(last, digits);
            temp /= 10;
        }

        if(sum == org){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String args[]){
        armstrong(153);
    }
}