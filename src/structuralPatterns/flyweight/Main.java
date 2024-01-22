package structuralPatterns.flyweight;

public class Main {

    public static void main(String[] args) {
            
            VirtualMachine vm = new VirtualMachine("Linux");
            Program p = new Program("print('Hello World!')");
            vm.run(p);
            Program p2 = new Program("print('Hi there')");
            vm.run(p2);
    }

}
