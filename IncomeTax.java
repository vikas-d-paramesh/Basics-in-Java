import java.util.Scanner;

public class IncomeTax {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.print("Enter your annual income (just number): ");
        double income = s.nextDouble();

        double tax = 0;

        if (income < 50000) {
            System.out.println("No Tax.");
        }
        else if (income >= 50000 && income < 1000000) {  // between 50,000 and 10,00,000
            tax = income * 0.05;  // 5% tax
            System.out.println("5% Tax for income: " + tax);
        }
        else if (income >= 1000000 && income < 10000000) {  // between 10L and 1Cr
            tax = income * 0.10;  // 10% tax
            System.out.println("10% Tax for income: " + tax);
        }
        else {
            tax = income * 0.15;  // 15% tax for > 1Cr
            System.out.println("15% Tax for income: " + tax);
        }

        double total = income + tax;
        System.out.println("Total Amount (including tax): " + total);
    }
}
