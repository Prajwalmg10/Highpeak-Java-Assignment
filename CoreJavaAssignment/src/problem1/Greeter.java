package problem1;

public class Greeter {
    String name;

    public Greeter(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, "+name+"!");
    }
    public Greeter sayGoodBye(){
        System.out.println("Goodbye "+name+"!");
        return null;
    }
}
