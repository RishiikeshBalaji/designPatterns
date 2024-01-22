package structuralPatterns.flyweight;

public class VirtualMachine {

    String operatingSystem;

    public VirtualMachine(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public void run(Program program){
        System.out.println("Running " + program.getCode() + " on " + this.operatingSystem);
    }
}
