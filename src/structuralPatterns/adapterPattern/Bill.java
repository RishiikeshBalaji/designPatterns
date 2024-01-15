package structuralPatterns.adapterPattern;

public class Bill {

    public void getBill(ProductWithoutGST product) {
        System.out.println("Price without GST: " + product.price);
    }

}
