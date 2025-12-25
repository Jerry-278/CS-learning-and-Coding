import java.util.Scanner;
public class TimesTable12 {
    
    public TimesTable12() {
        
        printTimesTable();
    }

    public void printTimesTable() {
        Scanner in = new Scanner(System.in);
        int n = 1;
        System.out.print("Enter a number to see its times table up to 10: ");
        int number = in.nextInt();

        while (n <= 10) {
            int product = number * n;
            System.out.println(number + " x " + n + " = " + product);
            n = n + 1;
        }
    }

    public static void main(String[] args) {
        new TimesTable12();
    }
}
