public class MultipleNum {
    public static boolean ContainDuplicate(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        boolean duplicate=ContainDuplicate(arr);

        if(duplicate){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
