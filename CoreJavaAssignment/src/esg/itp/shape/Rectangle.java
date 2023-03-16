package esg.itp.shape;

public class Rectangle implements Polygon {
    float length;
    float breadth;
    float area;
    float perimeter;
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void calcArea() {
      area=length*breadth;
    }
    public void calcPerimeter() {
        perimeter=2*(length+breadth);
    }
    public void display() {
      System.out.println("The area and perimeter of a rectangle is "+area+" and "+perimeter+" respectively,whose length is "+length+" and breadth is "+breadth);
    }
}
