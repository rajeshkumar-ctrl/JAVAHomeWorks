package Geometry;  
public class Circle implements Shapes{
  private int x, y;
  private final int radius = 4; 

  public Circle(int x, int y, int radius){
    this.x = x; 
    this.y = y;
  }

  public int getRadius(){return radius;}
  public int getX(){return x;}
  public int getY(){return y;}

  @Override
  public double area() { 
    return 3.14 * (this.radius) * (this.radius);
  }

  @Override
  public String show() {
    return "Circle at (" + Integer.toString(this.x) + ", " + Integer.toString(this.y) + ") radius " + Integer.toString(this.radius);
  }
  @Override
  public void move(int dx, int dy) {
    this.x += dx; 
    this.y += dy; 
  }
}
