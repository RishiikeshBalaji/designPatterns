package behavioral.command;

public class RemoteCommand implements Command{

    private House l;

    public RemoteCommand(House l){
        this.l = l;
    }
    
    public void button1(){
        l.turnOn(l.kitchen);
    }

    public void button2(){
        l.turnOn(l.living);
    }

    public void button3(){
        l.turnOn(l.kitchen);
        l.turnOn(l.living);
    }

    public void button4(){
        l.turnOff(l.living);
        l.turnOff(l.kitchen);
    }
    
}
