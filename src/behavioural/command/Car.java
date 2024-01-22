package behavioural.command;

public class Car {

    Command c;

    public void setCommand(Command c){
        this.c = c;
    }

    public void executeCommand(){
        this.c.execute();
    }

    public void accelarate(){
        System.out.println("Car is accelarating");
    }
}
