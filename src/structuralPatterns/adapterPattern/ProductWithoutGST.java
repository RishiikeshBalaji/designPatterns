package structuralPatterns.adapterPattern;

public class ProductWithoutGST {

    float price;
    String name;

    public ProductWithoutGST(int price, String title) {
        this.price = price;
        this.name = title;
    }

    public float getPrice() {
        return price;
    }

}
