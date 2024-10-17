
import java.util.Scanner;

public class driverClass {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("------ Welcome to Shape Area Calculator ------");

        System.out.println("Please Select one of The Shape : ");
        String choice;
        System.out.println("1. Rectangle\n2. Cube\n3. Circle");
        choice = s.nextLine();
        System.out.println("Type the color u want : ");
        String color = s.nextLine();
        if (choice.equals("1")) {
            System.out.println("Enter the Length : ");
            int length = s.nextInt();
            System.out.println("Enter the Width : ");
            int width = s.nextInt();
            Rectangle r = new Rectangle("Rectangle", color, length, width);
            r.print(); 
            System.out.println("----------------");
            r.calculate(r.getLength(), r.getWidth());
        } else if (choice.equals("2")) {
            System.out.println("Enter the Length : ");
            int length = s.nextInt();
            System.out.println("Enter the Width : ");
            int width = s.nextInt();
            System.out.println("Enter the Height : ");
            int height = s.nextInt();
            Cube c = new Cube("Cube", color, length, width, height);
            c.print();
            System.out.println("----------------");
            c.calculate(c.getLength(), c.getWidth(), c.getHeight());
        } else if (choice.equals("3")) {
            System.out.println("Enter the Radius : ");
            int radius = s.nextInt();
            Circle c = new Circle("Circle", color, radius);
            c.print();
            System.out.println("----------------");
            c.calculate(c.getRadius());
        }

    }
}
