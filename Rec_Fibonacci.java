import java.util.Scanner;

public class Rec_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Error: number must be positive!");
        } else if (n == 1) {
            System.out.println("0");
        } else {
            System.out.print("Fibonacci sequence: ");
            System.out.print("0 1 ");
            printFibonacci(0, 1, n - 2); 
        }
        in.close();
    }

    // Recursive method using 3 variables
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return; 
        }

        int c = a + b;
        System.out.print(c + " ");

        printFibonacci(b, c, n - 1);
    }
}
