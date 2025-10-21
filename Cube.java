import java.util.Scanner;

public class Cube {
    public Cube() {
        input();
    }

    public void input() {
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        int sideLength = in.nextInt();
        
        calculateVolume(sideLength);
    }
    public void calculateVolume(int sideLength) {
        int volume = sideLength * sideLength * sideLength;
        System.out.println("Volume of the cube: " + volume);
    }

    public static void main(String[] args) {
        new Cube(); 
    }
}
