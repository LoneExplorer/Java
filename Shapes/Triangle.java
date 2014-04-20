package supersub;

public class Triangle extends Geometric {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){
        super("Purple","Triangle",true);
        side1=3;
        side2=4;
        side3=5;
    }
    public Triangle(String color, String name, Boolean Fill,int side1,int side2, int side3){
        super(color,name,Fill);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public void setSide1(double s1){
        side1 = s1;
    }
    public void setSide2(double s2){
        side2 = s2;
    }
    public void setSide3(double s3){
        side3 = s3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double area(){
        double s = perimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));//returns square root
    }
    public double perimeter(){
        return side1+side2+side3;
    }
    @Override
    public String toString(){
        return "Sides: "+side1+","+side2+","+side3+" Area: " + this.area()+ " Perimeter: " + this.perimeter();
    }
}
