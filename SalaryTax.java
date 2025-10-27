import java.util.Scanner;

public class SalaryTax {
    
    public SalaryTax() {
        process();
    }

    public void process() {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter monthly salary for employee " + i + ": ");
            double sal = in.nextDouble();

            double annual = sal * 12;
            double tax;

            if (annual < 35000) {
                tax = 0;
            } else if (annual < 70000) {
                tax = annual * 0.15;
            } else {
                tax = annual * 0.35;
            }

            System.out.println("Employee " + i + ":");
            System.out.println("  Annual Salary = " + annual + " €");
            System.out.println("  Tax = " + tax + " €\n");
        }

        in.close();
    }

    public static void main(String[] args) {
        new SalaryTax(); 
        }
}
