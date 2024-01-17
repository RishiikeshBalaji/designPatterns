package structuralPatterns.facade;

public class Computer {

    public int compile(String process){
        System.out.println("code compiled");

        return 101010;
    }

    public void run(int compiled_code){
        System.out.println("Output generated successfully");
    }

}
