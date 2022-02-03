package Geometry;
public class Square implements Shapes{
  private int x, y;
  private int length = 4; 

  public Square(int x, int y, int length){
    this.x = x; 
    this.y = y;
    this.length = length;
  }

  public int getX(){return length;}
  public int getY(){return x;}
  public int getLength(){return y;}

  @Override
  public double area(){ 
    return (this.length) * (this.length);
  }

  @Override
  public String show() {
    return "Square at (" + Integer.toString(this.x) + ", " + Integer.toString(this.y) + ") side-length " + Integer.toString(this.length);
  }
  @Override
  public void move(int dx, int dy) {
    this.x += dx; 
    this.y += dy; 
  }
}
