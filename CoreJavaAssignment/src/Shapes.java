import esg.itp.shape.*;
public class Shapes {
    public static void main(String[] args) {
        Polygon p=new Rectangle(14,13);
        p.calcArea();
        p.calcPerimeter();
        p.display();
        p=new Square(15);
        p.calcArea();
        p.calcPerimeter();
        p.display();
    }
}
