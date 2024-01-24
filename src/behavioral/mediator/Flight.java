package behavioral.mediator;

public class Flight {

    private String name;
    private Mediator m;

    public Flight(String name){
        this.name = name;
    }

    public boolean canLand(){
        return m.requestToLand(this.name);
    }

    public void setMediator(Mediator m){
        this.m = m;
    }

}
