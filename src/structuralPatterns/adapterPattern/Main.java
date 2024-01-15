package structuralPatterns.adapterPattern;

public class Main {

    public static void main(String[] args) {
        
        Bill b = new Bill();
        ProductWithoutGST p = new ProductWithoutGST(100, "Product 1");
        b.getBill(p);

        Adapter a = new Adapter(new PriceWithGST());
        a.getBill(p);
    }
}
