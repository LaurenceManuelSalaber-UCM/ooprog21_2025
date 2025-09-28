import java.util.Scanner;

interface Circle {
    int getRadius();
    int getDiameter();
    double getArea();
}

class DebugCircle implements Circle {
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}

public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius for a circle >> ");
        int radius = input.nextInt();

        Circle c = new DebugCircle(radius);

        System.out.println("The radius is " + c.getRadius());
        System.out.println("The diameter is " + c.getDiameter());
        System.out.println("The area is " + c.getArea());

        input.close();
    }
}
