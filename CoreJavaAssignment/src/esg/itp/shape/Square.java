package esg.itp.shape;

public class Square implements Polygon {
    float side;
    float area;
    float perimeter;

    public Square(float side) {
        this.side = side;
    }

    public void calcArea() {
        area=side*side;
    }
    public void calcPerimeter() {
      perimeter=4*side;
    }
    public void display() {
            System.out.println("The area and perimeter of a square is "+area+" and "+perimeter+" respectively,whose side is "+side);
    }
}
