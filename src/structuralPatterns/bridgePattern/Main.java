package structuralPatterns.bridgePattern;

public class Main {

    public static void main(String[] args) {
        AmericanRestaurant a = new AmericanRestaurant(new PepperoniPizza("Tomato","Wheat","Pepperoni"));
        a.deliver();

        ItalianRestaurant i = new ItalianRestaurant(new VeggiePizza("Marinara","Thin","Mushrooms"));   
        i.deliver();
    }
}
