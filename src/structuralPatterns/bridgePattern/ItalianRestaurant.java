package structuralPatterns.bridgePattern;

public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(Pizza pizza){
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
