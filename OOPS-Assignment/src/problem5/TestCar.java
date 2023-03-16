package problem5;

public class TestCar {
    public static void main(String[] args) {
        Car c=new Car();
        SuperCar s=new SuperCar();

        c.drive(60,4);
        c.display();
        System.out.println();
        s.drive(150,5);
        s.display();
    }
}
