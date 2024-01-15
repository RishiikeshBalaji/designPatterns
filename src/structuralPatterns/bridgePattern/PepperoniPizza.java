package structuralPatterns.bridgePattern;

public class PepperoniPizza extends Pizza{

    public PepperoniPizza(String sauce, String dough, String topping){
        this.sauce = sauce;
        this.dough = dough;
        this.topping = topping;
    }

    @Override
    public void deliver(){
        System.out.println("Delivering Pepperoni Pizza with " + sauce + " sauce, " + dough + " dough, and " + topping + " topping.");
    }
}
