

public class SearchRotatedSortedArray {
    public static int sortArray(int[] arr,int key,int si,int ei){
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;

        if(arr[mid]==key){
                return mid;
        }

        if(arr[si]<=arr[mid]){
            if(arr[si]<=key && key<=arr[mid]){
                return sortArray(arr, key, si, mid-1);
            }
            else{
                return sortArray(arr, key, mid+1, ei);
            }
        }
        else{
            if(arr[mid] <=key && key <= arr[ei]){
                return sortArray(arr, key, mid+1, ei);
            }
            else{
                return sortArray(arr, key, si,mid-1);
            }
        }
    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(sortArray(arr, 0, 0, arr.length-1));
    }
    
}
