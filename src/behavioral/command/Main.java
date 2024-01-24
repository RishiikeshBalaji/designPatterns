package behavioral.command;

public class Main {

    public static void main(String[] args) {
        System.out.println(args[0]);
        Car c = new Car();
        c.setCommand(new CarCommand(c));
        c.executeCommand();
    }
}
