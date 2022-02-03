import Geometry.Shapes;
import Geometry.Circle;
import Geometry.Square;
public class ShapesDemo{
  public static void main(String[] args){
    Shapes s1 = new Square(2, 2, 1);
    Shapes s2 = new Circle(3, 5, 3);
    System.out.println("Before move() function:");
    System.out.println("\tf1:" + s1.show());
    s1.move(12, 12);
    System.out.println("After move() function s1: ");
    System.out.println("\tf1:" +s1.show());
    System.out.println("Figure f1 area: " + s1.area());

    System.out.println("Before move() function s2: ");
    System.out.println("\tf2:" +s2.show());
    s2.move(12, 12);
    System.out.println("After move() function f2: ");
    System.out.println("\tf2:" +s2.show());
    System.out.println("Figure f2 area: " + s2.area());
  }
}
