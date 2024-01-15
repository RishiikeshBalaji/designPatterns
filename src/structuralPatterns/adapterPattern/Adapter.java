package structuralPatterns.adapterPattern;

public class Adapter implements Billcomponent{

    public final PriceWithGST priceWithGST;

    public Adapter(PriceWithGST priceWithGST) {
        this.priceWithGST = priceWithGST;
    }

    public void getBill(ProductWithoutGST product) {
        System.out.println("Price with GST: " + priceWithGST.withoutGSTtoGST(product));
    }

}
