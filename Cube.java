
public class Cube extends Rectangle {

    private int height;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cube() {
        super();
        this.height = 0;
    }

    public Cube(String name, String color, int length, int width, int height) {
        super(name, color, length, width);
        this.height = height;
    }

    public void calculate(int length, int width, int height) {
        System.out.println("Volume : " + (length * width * height));
    }

    public void print() {
        super.print();
        System.out.println("Height : " + this.height);
    }
}
