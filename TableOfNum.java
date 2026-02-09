import java.util.Scanner;
public class TableOfNum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the number for which you need tables:");
        int n=s.nextInt();

        for(int i=1;i<=10;i++){
            if(i<10){
            System.out.println(n+" * "+i+"= "+n*i);
            }
            else{
                System.out.println(n+" *"+i+"= "+n*i);
            }
        }
    }
    
}
