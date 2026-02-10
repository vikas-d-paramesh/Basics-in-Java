public class PairsEle {
    public static void PairOfElement(int arr[]){

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+" , "+arr[j]+") ");
            }
        System.out.println();
        }
    }

    public static void main(String arg[]){
        int arr[]={1,2,3,4,5};
        PairOfElement(arr);
    }
}
    
