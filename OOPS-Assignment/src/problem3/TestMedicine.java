package problem3;

import java.util.Random;

public class TestMedicine {
    public static void main(String[] args) {
        Medicine [] medicines=new Medicine[10];
        Random random =new Random();
        for(int i=0;i<medicines.length;i++){
            int rand_number=random.nextInt(3);
            switch (rand_number){
                case 0:medicines[i]=new Tablet("Cipla","Jayanagar, Bengaluru");
                    break;
                case 1:medicines[i]=new Syrup("Benadryl","Basavanagudi");
                    break;
                case 2:medicines[i]=new Ointment("Neosporin","Banshankari");
            }
            System.out.println(medicines[i].displayLabel());
        }
    }
}
