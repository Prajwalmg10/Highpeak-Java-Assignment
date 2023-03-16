import com.highpeak.assignment.hps313.prajwal.problem1.Advisor;
import com.highpeak.assignment.hps313.prajwal.problem1.Greeter;

import java.util.ArrayList;
import java.util.List;

public class GreeterTest {
    public static void main(String[] args) {

        List<Greeter> list=new ArrayList<>();
        for(int i=0;i<args.length;i++){
            list.add(new Greeter(args[i]));
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
