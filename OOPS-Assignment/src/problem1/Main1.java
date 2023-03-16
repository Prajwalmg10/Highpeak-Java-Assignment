package problem1;

public class Main1 {
    public static void main(String[] args) {
        Instrument[] items=new Instrument[10];
        items[0]=new Flute();
        items[1]=new Piano();
        items[2]=new Flute();
        items[3]=new Guitar();
        items[4]=new Piano();
        items[5]=new Flute();
        items[6]=new Piano();
        items[7]=new Flute();
        items[8]=new Guitar();
        items[9]=new Piano();
        for (Instrument e:items ) {
            if(e instanceof Piano){
                System.out.println("Piano is playing "+ e.play());
            }else if(e instanceof Flute){
                System.out.println("Flute is playing "+ e.play());
            }else if(e instanceof Guitar){
                System.out.println("Guitar is playing "+ e.play());
            }
        }
    }
}
