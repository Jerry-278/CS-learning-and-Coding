import java.util.Scanner;

public class Rec_fibonacci_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = in.nextInt();

        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(Fib(i) + " ");
        }
        System.out.println();
        in.close();
    }

    public static int Fib(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        else 
            return Fib(n - 1) + Fib(n - 2);
    }

    public static void printFibonacciHelper() {
        new Rec_fibonacci_2();
    }
}
