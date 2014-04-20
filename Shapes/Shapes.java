
package supersub;


public class SuperSub {


    public static void main(String[] args) {
        System.out.println("Rectangle:");
        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        System.out.println(r.getName());
        
        System.out.println("Circle:");
        Circle c = new Circle();
        System.out.println(c.getRadius());
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c.getName());
        
        System.out.println("Triangle:");
        Triangle t = new Triangle();
        System.out.println(t.getSide1());
        System.out.println(t.getSide2());
        System.out.println(t.getSide3());
        System.out.println(t.area());
        System.out.println(t.perimeter());
        System.out.println(t.getName());
    }
}
