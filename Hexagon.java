import java.util.Scanner;

public class Hexagon {
    private int length;

    public Hexagon() {
        input();
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of the hexagon: ");
        length = in.nextInt();
        calculateArea();
        in.close();
    }

    public void calculateArea() {
        if (length <= 0) {
            System.out.println("Side length cannot be 0 or smaller than 0.");
        } else {
            double area = (3 * Math.sqrt(3) / 2) * Math.pow(length, 2);
            System.out.printf("The area of the hexagon is: %.2f%n", area);
        }
    }

    public static void main(String[] args) {
        new Hexagon();
    }
}
