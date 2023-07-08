import java.util.Scanner;

public class circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Diameter of circle");
        double Diameter = sc.nextDouble();
        double radius = Diameter/2;
        System.out.println("Radius of circle = "+radius);
        double area = 3.14 *radius*radius;
        System.out.println("Area of circle = "+area);
        sc.close();

    }
}
