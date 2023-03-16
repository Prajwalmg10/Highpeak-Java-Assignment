package problem3;

public class Ointment extends Medicine {
    public Ointment(String name, String address) {
        super(name, address);
    }
    public String displayLabel(){
        return "For external use only";
    }
}
