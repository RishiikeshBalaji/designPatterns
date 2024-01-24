package behavioral.mediator;

public class ControlCenter implements Mediator{

    private Flight flight;

    public ControlCenter(Flight flight){
        this.flight = flight;
    }
    public boolean requestToLand(String name){
        if(name.equals("Air India")){
            System.out.println("Request accepted");
            return true;
        }
        else{
            System.out.println("Request denied");
            return false;
        }
    }
}
