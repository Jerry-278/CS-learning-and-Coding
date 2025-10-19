
import java.util.Scanner;

public class Clock
{


    public Clock()//constructor a method that has the same name as the class
    {
        clock();
    }
        
    
    
        public void clock() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Seconds : ");
        int sec = in.nextInt();
        int min = sec/60;
        int r_sec = sec % 60;
        int hour = min/60;
        int r_min = min % 60;
        System.out.println("It is " + hour + " hours " + r_min + " minutes and " + r_sec + " seconds");
        
        
        
    }
    
    
    
    public static void main(String[] args)
    {
        new Clock();
    }
}






