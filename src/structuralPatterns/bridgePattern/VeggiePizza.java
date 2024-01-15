package structuralPatterns.bridgePattern;

public class VeggiePizza extends Pizza{

    public VeggiePizza(String sauce, String dough, String topping){
        this.sauce = sauce;
        this.dough = dough;
        this.topping = topping;
    }

    @Override
    public void deliver(){
        System.out.println("Delivering Veggie Pizza with " + sauce + " sauce, " + dough + " dough, and " + topping + " topping.");
    }

}
