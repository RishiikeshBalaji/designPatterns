package structuralPatterns.bridgePattern;

public class Pizza {

    String sauce;
    String dough;
    String topping;

    public void deliver(){
        System.out.println("Delivering Pizza with " + sauce + " sauce, " + dough + " dough, and " + topping + " topping.");
    }

}
