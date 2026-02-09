public class Pattern12HollowRhombus {
    public static void main(String args[]){
        int r=4;
        int c=4;
        for(int i=1;i<=r;i++){
            for(int k=1;k<=r-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=c;j++){
                if(i==1||i==r||j==1||j==c){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
