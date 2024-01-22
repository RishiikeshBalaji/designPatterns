package behavioral.command;

public class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.setCommand(new CarCommand(c));
        c.executeCommand();
    }
}
