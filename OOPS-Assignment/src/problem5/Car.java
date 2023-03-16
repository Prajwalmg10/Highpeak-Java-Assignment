package problem5;

public class Car {
    double speed;
    int noOfGears;
    public void drive(double speed,int noOfGears){
        this.speed=speed;
        this.noOfGears=noOfGears;
    }
    public void display(){
        System.out.println("The speed of the car is "+speed+" and gear is "+ noOfGears);
    }
}
