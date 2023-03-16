package problem2;

import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment [] railCoach=new Compartment[10];

        Random random= new Random();

        for(int i=0;i<railCoach.length;i++){
            int random_number=random.nextInt(4);
            switch (random_number){
                case 0:railCoach[i]=new FirstClass();
                    break;
                case 1:railCoach[i]=new Ladies();
                    break;
                case 2:railCoach[i]=new General();
                    break;
                case 3:railCoach[i]=new Luggage();
                    break;
                default:System.out.println("invalid info");
            }
            System.out.println(railCoach[i].notice());
        }
    }
}
