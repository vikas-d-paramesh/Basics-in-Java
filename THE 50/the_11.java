
public class the_11 {
   public static void fibonaaci(int n){
    int first=0;
    int second=1;
    if(n==0){
    System.out.print(first);
    }
    if(n==1){
        System.out.print(first+ " "+ second);
    }

    System.out.print(first+ " "+ second+" ");
    for(int i=2;i<=n;i++){
        int third=0;
        third=first+second;
        first=second;
        second =third;

        System.out.print( third+" ");
    }
   }
   public static void main(String args[]){
    int n=2;
    fibonaaci(n);
}

}

