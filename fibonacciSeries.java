import java.util.Scanner;

public class fibonacciSeries {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter how many terms of Fibonacci you want:");
        int n = s.nextInt();

        int first = 0, second = 1, third;

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } 
        else if (n == 1) {
            System.out.println("Fibonacci Series: " + first);
        } 
        else {
            System.out.print("Fibonacci Series: " + first + " " + second);

            for (int i = 2; i < n; i++) {  
                third = first + second;
                System.out.print(" " + third);
                first = second;
                second = third;
            }
        }
    }
}
