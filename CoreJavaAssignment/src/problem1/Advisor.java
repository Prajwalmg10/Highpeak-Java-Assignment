package problem1;

import java.util.Random;

public class Advisor{
    String[] message=new String[5];

    public Advisor(String[] message) {
        for (int i = 0; i <message.length ; i++) {
            this.message[i]=message[i];
        }
    }



    public void getAdvice(){
        Random random=new Random();
        int r= random.nextInt(5);
        System.out.println("Advice : "+message[r]);
    }
}
