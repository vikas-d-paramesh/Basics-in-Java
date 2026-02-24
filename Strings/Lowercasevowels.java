import java.util.Scanner;
public class Lowercasevowels {
    public static void lowerCaseVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'&& c<96){
            count++;
        }
        }
        System.out.println(count);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        lowerCaseVowels(str);

    }

    
}
