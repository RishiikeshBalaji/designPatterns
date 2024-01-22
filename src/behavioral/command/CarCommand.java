package behavioral.command;

public class CarCommand implements Command{

    private Car c;

    public CarCommand(Car c){
        this.c = c;
    }
    public void execute(){
        c.accelarate();
    }

}
