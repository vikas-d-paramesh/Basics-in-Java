import java.math.*;
public class KadansAlgo {

    public static void KadanesAlg(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            cs+=arr[i];

            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.print("Maximum value:"+ms);
    }
     public static void main(String args[]){
            int arr[]={2,3,4,-5,6,7,8,};
            KadanesAlg(arr);
        }
    }

