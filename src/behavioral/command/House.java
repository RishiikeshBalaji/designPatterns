package behavioral.command;

public class House {

    String living,kitchen;

    public House(String living, String kitchen){
        this.living = living;
        this.kitchen = kitchen;
    }

    public void turnOn(String s){
        System.out.println("The lights are on in the "+ s);
    }

    public void turnOff(String s){
        System.out.println("The lights are off in the "+ s);
    }
}
