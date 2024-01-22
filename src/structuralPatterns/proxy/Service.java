package structuralPatterns.proxy;

public class Service implements Transaction{

   public void deposit() {
        System.out.println("Service: Main logic for deposit");
    }

   public void withdraw() {
        System.out.println("Service: Main logic for withdrawal");
    }

}
