public class Rectangle extends Shape{
    private int length;
    private int width;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }
    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public void calculate(int length, int width) {
        System.out.println("Area : " + (length * width));        
    }

    public void print() {
        super.print();
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
    }
}
