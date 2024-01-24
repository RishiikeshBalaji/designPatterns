package structuralPatterns.proxy;

public class Main {

    public static void main(String[] args) {
        Upi u = new Upi();
        u.deposit();
        u.withdraw();
    }
}
