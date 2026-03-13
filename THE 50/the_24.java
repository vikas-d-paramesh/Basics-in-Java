

public class the_24 {
    public static void reverse(int[] arr){
         int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            
            j--;
        }
    }

    public static void main(String args[]){
        int[] arr={2,3,0,1,4};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
}
