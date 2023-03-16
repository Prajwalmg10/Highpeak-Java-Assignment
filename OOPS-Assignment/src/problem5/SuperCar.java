package problem5;

public class SuperCar extends Car{
    String new_feature="AirBallonType";

    public void display() {
        super.display();
        System.out.println("Super car new feature "+new_feature);
    }
}
