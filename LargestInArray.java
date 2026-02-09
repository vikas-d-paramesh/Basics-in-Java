import java.util.Scanner;
public class LargestInArray {
    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int arr[]=new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();

        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements of array :");
        for(int i=0;i<n;i++){
              System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int largest=getLargest(arr);
        System.out.print("Largest element :"+largest);

        
    }
    
}

