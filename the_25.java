

public class the_25 {
    public static void evenAndOddArr(int[] arr){
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }

    public static void main(String args[]){
        int[] arr={2,6,8,88,4};
        evenAndOddArr(arr);
    
}
}
