package structuralPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class NestedBox implements Box{

    public List<Box> boxes = new ArrayList<>();

    public void add(MobilePhone mobilePhone){
        boxes.add(mobilePhone);
    }

    public void add(Watch watch){
        boxes.add(watch);
    }
    
    @Override
    public float calculatePrice() {
        float totalPrice = 0;
        for(Box box : boxes){
           totalPrice += box.calculatePrice();
        }

        float packingCharge = 100;

        return totalPrice + packingCharge;
    }
}
