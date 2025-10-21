import java.util.Scanner;

public class Sphere
{


    public Sphere()//constructor a method that has the same name as the class
    {
        sphere();

    }
    

        public void sphere() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("the radius of the sphere is : ");
        double R = in.nextDouble();
        double S = 4 * Math.PI * Math.pow(R,2);
        double V = (4/3) * Math.PI * Math.pow(R,3);
        System.out.println("S = " + S + "\n" + "V = " + V);
        
    }


    
    
    public static void main(String[] args)
    {
        new Sphere();
            
    }
}




