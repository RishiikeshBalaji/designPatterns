package structuralPatterns.compositePattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Watch w = new Watch(1700, "Casio G-Shock");
        MobilePhone m = new MobilePhone(10000, "iPhone 12");

        NestedBox nest = new NestedBox();

        nest.add(new MobilePhone(20000, "Motorola"));
        nest.add(new Watch(200000, "Rolex"));
        nest.add(new MobilePhone(30000, "Samsung"));

        System.out.println("Total price of all items: " + (w.calculatePrice() + m.calculatePrice() + nest.calculatePrice()));
    }
}
