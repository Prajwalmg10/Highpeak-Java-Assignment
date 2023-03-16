package problem3;

public class Syrup extends Medicine {
    public Syrup(String name, String address) {
        super(name, address);
    }
    public String displayLabel(){
        return "Shake bottle well before use";
    }
}
