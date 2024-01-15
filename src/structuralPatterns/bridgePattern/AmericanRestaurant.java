package structuralPatterns.bridgePattern;

public class AmericanRestaurant extends Restaurant{
    
    public AmericanRestaurant(Pizza pizza){
        super(pizza);
    }
    @Override
    void addSauce(){
        pizza.sauce = "tomato";
    }

    @Override
    void addDough(){
        pizza.dough = "thin";
    }

    @Override
    void addTopping(){
        pizza.topping = "pepperoni";
    }
}
