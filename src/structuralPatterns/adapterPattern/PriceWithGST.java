package structuralPatterns.adapterPattern;

public class PriceWithGST {

    public float withoutGSTtoGST(ProductWithoutGST product) {
        float result = (float) (product.price+(product.price*0.18));

        return result;
    }

}
