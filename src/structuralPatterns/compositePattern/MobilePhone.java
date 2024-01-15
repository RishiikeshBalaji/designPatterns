package structuralPatterns.compositePattern;

public class MobilePhone extends Product{

    public MobilePhone(float price, String title) {
        
        this.price = price;
        this.name = title;
    }

    public float calculatePrice(){
        System.out.println("Name: " + this.name + " Price: " + this.price);
        return this.price;
    }

}
