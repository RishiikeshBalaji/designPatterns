package behavioral.mediator;
public class Main {

    public static void main(String[] args) {
        Flight f = new Flight("Indigo");
        f.setMediator(new ControlCenter(f));
        f.canLand();

        Flight f2 = new Flight("Air India");
        f2.setMediator(new ControlCenter(f2));
        f2.canLand();
    }

}
