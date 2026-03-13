
public class the_29 {
    public static int countAnumber(int[] arr, int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        return count;
    }


    public static void main(String args[]){
        int[] arr={1,2,3,5,3,3,2};
        System.out.println(countAnumber(arr, 3));
    }
    
}
