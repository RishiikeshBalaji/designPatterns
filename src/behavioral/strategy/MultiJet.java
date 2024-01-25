package behavioral.strategy;

public class MultiJet implements CarInterface{

    public void accelaterate(){
        System.out.println("Accelarates like MultiJet");
    }

    public void brake(){
        System.out.println("MultiJet brakes");
    }

}
