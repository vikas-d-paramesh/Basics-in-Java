import java.util.Scanner;

public class LinearSearch {
    public static void LinSrch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found "+ arr[i]+" at the index "+ i+".");
                break;
            }
            else{
                System.out.println("Not found.");
            }

        }
    
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
              System.out.print(arr[i]+", ");
        }
         System.out.print("Enter the element to be searched:");
         int key=sc.nextInt();
         LinSrch(arr,key);
    }
    
}
