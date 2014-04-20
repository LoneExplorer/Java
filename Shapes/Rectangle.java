package supersub;

public class Rectangle extends Geometric {

    private double length;
    private double width;

    public Rectangle() {
        super("Green", "Rectangle", true);//MUST BE CALLED ON THE FIRST LINE OF THE CONSTRUCTOR
        length = 1;
        width = 1;
       //super.setName("Rectangle");

    }
    public Rectangle(String color, String name, Boolean Fill, int length, int width) {
        super(color, name, Fill);//MUST BE CALLED ON THE FIRST LINE OF THE CONSTRUCTOR
        this.length = length;
        this.width = width;
       //super.setName("Rectangle");

    }

    public void setLength(double length) {
        this.length = length;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length *width;
    }

    public double perimeter() {
        return 2*(length+width);
    }
    @Override
    public String toString(){
        return "Width: "+width+" Length: "+length +" Area: " + this.area()+ " Perimeter: " + this.perimeter();
    }
}
