package problem1;

import java.util.*;

public class GreeterTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Person");
        int n=sc.nextInt();
        List<Greeter> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the name");
            list.add(new Greeter(sc.next()));
        }
        String[] s={"Never say No","Be Positive","Utilize the Time","Be Happy","Smile"};

        for (Greeter e:list) {
            e.sayHello();
        }
        Advisor ad=new Advisor(s);
        ad.getAdvice();
        for (int i = list.size()-1; i >=0 ; i--) {
           list.get(i).sayGoodBye();
        }
    }
}
