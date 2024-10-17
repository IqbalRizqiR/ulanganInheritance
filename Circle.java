public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public void calculate(int radius) {
        System.out.println("Area : " + (3.14 * radius * radius));
    }

    public void print() {
        super.print();
        System.out.println("Radius : " + this.radius);
    }

}
