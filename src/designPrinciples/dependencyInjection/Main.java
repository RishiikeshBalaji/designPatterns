package designPrinciples.dependencyInjection;

public class Main {

    public static void main(String[] args) {

        Car c = new Car("Polo");
        c.display();
        // Car car = new Car("Swift",new NaturalAspirated(), new Bose());
        // car.display();

        // Car car2 = new Car("POLO",new TurboCharged(), new Jbl());
        // car2.display();
    }
}
