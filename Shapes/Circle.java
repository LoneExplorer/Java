package supersub;

public class Circle extends Geometric {
    private double radius;
    public Circle(){
        super("Blue","Circle",false);
        radius=1;
    }
    public Circle(String color, String name, Boolean Fill, int radius){
        super(color,name,Fill);
        this.radius=radius;
    }
    public void setRadius(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);//radius*radius
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "Radius: "+radius+" Area: "+this.area()+" Perimeter: "+this.perimeter();
    }
}
