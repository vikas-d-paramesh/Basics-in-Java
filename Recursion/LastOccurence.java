

public class LastOccurence {
    public static int lastOccurance(int arr[],int key, int i){
        if (i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurance(arr, key, i-1);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,4};
        System.out.println(lastOccurance(arr,4,arr.length-1));
    }
    
}
