import java.util.Scanner;

public class Caluculation
{


    public Caluculation()//constructor a method that has the same name as the class
    {
        calculations();
    }
    
        public void calculations() {
        double x, y, sum, sub, prod, div;
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        x = in.nextDouble();
        System.out.print("y = ");
        y = in.nextDouble();
        sum = x + y;
        sub = x - y;
        prod = x * y;
        div = x / y;
        
        System.out.println("addition= " + sum + "\n" +
        "subtraction = " + sub + "\n" +
        "mutiplication = " + prod + "\n" +
        "division = " + div
        );
        /*
        System.out.println("addition= " + sum);
        System.out.println("subtraction = " + sub);
        System.out.println("mutiplication = " + prod);
        System.out.println("division = " + div);
        */
        
    }
    
    public static void main(String[] args)
    {
        new Caluculation();
    }
        
        
}





