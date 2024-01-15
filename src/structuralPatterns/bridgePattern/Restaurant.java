package structuralPatterns.bridgePattern;

public abstract class Restaurant {

    Pizza pizza;

    public Restaurant(Pizza pizza){
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addDough();
    abstract void addTopping();

    public void deliver(){
        addSauce();
        addDough();
        addTopping();
        pizza.deliver();
    }
}
